package swing.Login.components.Events;

import service.Model_Register;

public interface EventLogin {

    public void login();

    public void register(Model_Register data, EventMessage message);

    public void goLogin();

    public void goRegister();

}
