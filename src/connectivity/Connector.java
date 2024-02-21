package connectivity;

import java.awt.Font;
import java.sql.*;
import javax.swing.JOptionPane;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import pages.Loginpage;
import static pages.Loginpage.tpassword;
import static pages.Loginpage.unicombo;
import pages.Mainpage;
import swing.popups.ConnectionError;
import swing.popups.ErrorMessage;

public final class Connector {

    private Loginpage page;
    private ConnectionError er;
    private ErrorMessage error;
    public static Connection con = null;
    private String userName, passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Connector() {
    }

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");

        } catch (ClassNotFoundException | SQLException e) {
            er.showMessage("Erreur de connexion.", "Veullez d'abord vous connecter sur l'internet");
        }
    }

    public void requestConnection(JFrame fram) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");

            new Loginpage().setVisible(true);
            fram.dispose();

        } catch (ClassNotFoundException | SQLException e) {

            ConnectionError err = new ConnectionError(fram);

            err.showMessage("Erreur de connexion.", "Veullez d'abord vous connecter sur l'internet");
        }
    }

    public void setUniCombo(String type) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");

            PreparedStatement pst = conn.prepareStatement("select* from universities where type=? order by title asc");
            pst.setString(1, type);
            ResultSet rs = pst.executeQuery();
            unicombo.removeAllItems();
            while (rs.next()) {
                String title = rs.getString("title");
                Loginpage.unicombo.addItem(title);
            }
        } catch (ClassNotFoundException | SQLException e) {

        }
    }

    public void newUser() {
        String firstname = Loginpage.tname.getText();
        String lastname = Loginpage.tpname.getText();
        String username = Loginpage.tuser.getText();
        String password = new String(tpassword.getPassword());
        String email = Loginpage.temail.getText();
        String date = ((JTextField) Loginpage.datechooser.getDateEditor().getUiComponent()).getText();
        String university = Loginpage.unicombo.getSelectedItem().toString();
        String sex = Loginpage.sex;
        String course = Loginpage.course;
        String year = Loginpage.year;
        byte[] picture;
        picture = Loginpage.profilepic;
        try {
            PreparedStatement pst = con.prepareStatement("INSERT INTO user(first_name,last_name,username,password,sex,picture,birth,university,course,year,email) VALUES (?,?,?,md5(?),?,?,?,?,?,?,?)");
            pst.setString(1, firstname);
            pst.setString(2, lastname);
            pst.setString(3, username);
            pst.setString(4, password);
            pst.setString(5, sex);
            pst.setBytes(6, picture);
            pst.setString(7, date);
            pst.setString(8, university);
            pst.setString(9, course);
            pst.setString(10, year);
            pst.setString(11, email);
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void login(String username, String password, JFrame fram) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");
            PreparedStatement pst = con.prepareStatement("select* from user where username=? and password=md5(?)");
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String fullname1 = null;
                String firstname = rs.getString("first_name");
                String lastname = rs.getString("last_name");
                setUserName(username);
                setPassWord(password);
                int fnamelength = firstname.length();
                int lnamelength = lastname.length();
                if ((fnamelength >= 18) && ((lnamelength > 18) || (lnamelength <= 18))) {
                    char lname = lastname.charAt(0);
                    fullname1 = firstname + " " + lname + ".";
                   // Mainpage.mainmenu.setNameFont(new Font("Yu Gothic UI", 1, 16));
                } else if (lnamelength >= 18) {
                    char lname = lastname.charAt(0);
                    fullname1 = firstname + " " + lname + ".";
                   // Mainpage.mainmenu.setNameFont(new Font("Yu Gothic UI", 1, 18));
                } else {
                    fullname1 = firstname + " " + lastname;
                 //   Mainpage.mainmenu.setNameFont(new Font("Yu Gothic UI", 1, 18));
                }
                String user = rs.getString("username");
                byte[] img = rs.getBytes("picture");
                ImageIcon imge = new ImageIcon(img);
                Image im = imge.getImage();
                Image im1 = im.getScaledInstance(300, 370, Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(im1);
               // Mainpage.mainmenu.setProfile(newImage);
               // Mainpage.mainmenu.setFullname(fullname1);
               // Mainpage.mainmenu.setUsername(user);
                new Mainpage().setVisible(true);
                fram.setVisible(false);

            } else {
                error = new ErrorMessage(fram);
                error.showMessage("Erreur!", "Ce compte n'existe pas.");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private void showErrorPopup() {
        pbThread t = new pbThread();
        t.start();
    }

    class pbThread1 extends Thread {

        pbThread1() {

        }

        public void run() {
            int min = 50;
            int max = 105;

            int j = 50;
            for (int i = min; i <= max; i++) {
                try {

                    sleep(10);
                } catch (InterruptedException ex) {

                }
                pbThread2 tt = new pbThread2();
                tt.start();
                j++;
            }

        }
    }

    class pbThread2 extends Thread {

        pbThread2() {

        }

        public void run() {
            int min = 50;
            int max = 105;

            int j = 50;
            for (int i = max; i >= min; i--) {
                try {

                    sleep(10);
                } catch (InterruptedException ex) {

                }
                j++;
            }

        }
    }

    class pbThread extends Thread {

        pbThread() {

        }

        public void run() {
            int min = 1;
            int max = 2;

            int j = 50;
            for (int i = min; i <= max; i++) {
                try {
                    if (i <= 1) {
                        pbThread1 t1 = new pbThread1();
                        t1.start();
                    } else {
                        pbThread2 t2 = new pbThread2();
                        t2.start();
                    }
                    sleep(1000);
                } catch (InterruptedException ex) {

                }
                j++;
            }

        }
    }

    public String getUsername(String username) {
        String user = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");
            PreparedStatement pst = conn.prepareStatement("select* from user where username=?");
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                user = rs.getString("username");
            } else {
                user = "";
            }

        } catch (ClassNotFoundException | SQLException e) {

        }
        return user;
    }

    public void autoConnect(boolean permission) {

    }
    /* private void showMessage(message.MessageType messageType, String message) {
        message ms = new message();
        ms.showMessage(messageType, message);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void begin() {
                if (ms.isShow()) {
                    ms.setVisible(true);
                } else {
                    ms.setVisible(true);
                }

            }

            @Override
            public void timingEvent(float fraction) {

            }

            @Override
            public void end() {
                super.end();
            }
        };
        Animator animator = new Animator(300, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.start();
    }
 public void permit(JFrame fram){
    
 }*/
}
