package swing.Mainpage.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javaswingdev.GoogleMaterialDesignIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import swing.Mainpage.components.MenuCustomsComponents.EventMenuSelected;
import swing.Mainpage.components.MenuCustomsComponents.MenuItem;
import swing.Mainpage.components.MenuCustomsComponents.ModelMenuItem;
import swing.Mainpage.components.MenuCustomsComponents.ScrollBar;



public class MenuCustom extends JComponent {
     private int index = -1;
    private final List<EventMenuSelected> events = new ArrayList<>();

    public MenuCustom() {
        init();
    }

  private void init() {
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        JScrollPane scroll = createScroll();
        panelMenu = createPanelMenu();
        scroll.setViewportView(panelMenu);
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        add(scroll);
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.HOME, "Accueil"));
        addTitle("GENERAL");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.MESSAGE, "Messages", "Privés", "Groupes", "Group chat"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PEOPLE, "Amis","Tous","Nouveaux amis","Demandes"));
      
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.MAP, "Maps", "Localiser", "Ma location"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.SEARCH, "Google search"));
        addTitle("CONFIDENTIALITE");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.ACCOUNT_CIRCLE, "Mon compte"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.SETTINGS, "Paramètres"));
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.EXIT_TO_APP, "Déconnexion","Comptes", "Enregistrer les informations", "N’enregistrer pas les informations"));
        
        addTitle("PLUS");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.INBOX,"FAQ","Aide","A propos"));
       
    }

    private JScrollPane createScroll() {
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new ScrollBar());
        return scroll;
    }

    private JPanel createPanelMenu() {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        menuLayout = new MigLayout("wrap,fillx,inset 0,gapy 0", "[fill]");
        panel.setLayout(menuLayout);

        return panel;
    }

    private JPanel createMenuItem(ModelMenuItem item) {
        MenuItem menuItem = new MenuItem(item, ++index, menuLayout);
        menuItem.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (!menuItem.isHasSubMenu() || indexSubMenu != 0) {
                    clearSelected();
                    setSelectedIndex(index, indexSubMenu);
                }
            }
        });
        return menuItem;
    }

    private void runEvent(int index, int indexSubMenu) {
        for (EventMenuSelected event : events) {
            event.menuSelected(index, indexSubMenu);
        }
    }

    //  Public Method
    public void addMenuItem(ModelMenuItem menu) {
        panelMenu.add(createMenuItem(menu), "h 35!");
    }

    public void addTitle(String title) {
        JLabel label = new JLabel(title);
        label.setBorder(new EmptyBorder(15, 20, 5, 5));
        label.setFont(new Font("Yu Gothic UI",1,17).deriveFont(Font.BOLD));
        label.setForeground(new Color(170, 170, 170));
        panelMenu.add(label);
    }

    public void addSpace(int size) {
        panelMenu.add(new JLabel(), "h " + size + "!");
    }

    public void setSelectedIndex(int index, int indexSubMenu) {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                if (item.getIndex() == index) {
                    item.setSelectedIndex(indexSubMenu);
                    runEvent(index, indexSubMenu);
                    break;
                }
            }
        }
    }

    public void clearSelected() {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                item.clearSelected();
            }
        }
    }

    public void addEvent(EventMenuSelected event) {
        events.add(event);
    }

    private MigLayout menuLayout;
    private JPanel panelMenu;
}
