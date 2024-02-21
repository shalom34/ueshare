package service;

import org.json.JSONObject;

public class Model_Register {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Model_Register(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name=name;
    }

    public Model_Register() {

    }

    private String email;
    private String password;
    private String name;

    public JSONObject toJSONObject() {
        try {
            JSONObject json = new JSONObject();
           json.put("email", email);
            json.put("password", password);
             json.put("name", name);
            return json;
        } catch (Exception e) {
            return null;
        }
    }
}
