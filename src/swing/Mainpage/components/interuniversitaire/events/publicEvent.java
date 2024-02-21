package swing.Mainpage.components.interuniversitaire.events;

import swing.Login.components.Events.EventLogin;
import swing.Login.components.Events.EventMain;

public class publicEvent {

    public static publicEvent instance;
    private EventMain eventMain;
    private EventImageView eventImageView;
    private EventChat eventChat;
    private EventLogin eventLogin;
    private EventMenu eventMenu;

    public static publicEvent getInstance() {
        if (instance == null) {
            instance = new publicEvent();
        }
        return instance;
    }

    public publicEvent() {

    }
    public void addEventMain(EventMain event){
        this.eventMain=event;
    }
    public void addEventImageView(EventImageView event) {
        this.eventImageView = event;
    }

    public void addEventChat(EventChat event) {
        this.eventChat = event;
    }

    public void addEventLogin(EventLogin event) {
        this.eventLogin = event;
    }
    public void addEventMenu(EventMenu event){
        this.eventMenu=event;
    }
    public EventMain getEventMain(){
        return eventMain;
    }
    public EventImageView getEventImageView() {
        return eventImageView;
    }

    public EventChat getEventChat() {
        return eventChat;
    }

    public EventLogin getEventLogin() {
        return eventLogin;
    }

    public EventMenu getEventMenu() {
        return eventMenu;
    }
    

}
