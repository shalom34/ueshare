package service;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import swing.Mainpage.components.interuniversitaire.events.publicEvent;

public class Service {

    private Socket client;
    private static Service instance;
    private final int PORT_NUMBER = 9999;
    private final String IP = "localhost";
    private Model_User_Account user;

    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    private Service() {

    }

    public void startServer() {
        try {
            client = IO.socket("http://" + IP + ":" + PORT_NUMBER);
            client.on("list_user", new Emitter.Listener() {
                @Override
                public void call(Object... os) {
                    //list users;
                    List<Model_User_Account> users= new ArrayList<>();
                    for(Object o: os){
                        users.add(new Model_User_Account(o));
                    }
                    publicEvent.getInstance().getEventMenu().newUser(users);
                }
            });
            client.open();
        } catch (URISyntaxException e) {
            error(e);
        }

    }

    public Socket getClient() {
        return client;
    }

    public Model_User_Account getUser() {
        return user;
    }

    public void setUser(Model_User_Account user) {
        this.user = user;
    }

    private void error(Exception e) {
        System.out.println(e);
    }
}
