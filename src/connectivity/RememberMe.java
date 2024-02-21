/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectivity;



import java.sql.*;
import javax.swing.JFrame;
import static pages.Loginpage.*;
import static swing.fields.passwordField.visibility;

/**
 *
 * @author Shalom Geek
 */
public class RememberMe {
JFrame fram;
    public RememberMe() {
        
    }

    public void saveInfos(String username, String password) {
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");
            PreparedStatement pst = con.prepareStatement("insert into rememberme(username,password) values(?,?)");
            pst.setString(1, username);
            pst.setString(2, password);
            pst.executeUpdate();
           // refresh();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public void getInfos() {
        
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");
            PreparedStatement pst = con.prepareStatement("select * from rememberme");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
            loguser.setTextFieldText(rs.getString("username"));
              logpass1.setPasswordText(rs.getString("password"));
              visibility.setVisible(false);
            }
            else{
                  loguser.setTextFieldText(null);
              logpass1.setPasswordText(null);  
                    }con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
    public void refresh(String username, String password){
     try {
          Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ue_db", "root", "");
            PreparedStatement pst = con.prepareStatement("delete from rememberme where username=? and password=?");
            pst.setString(1, username);
            pst.setString(2, password);
            pst.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }    
    }
}
