package Java_App;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContactList {
    private Object SQLex;

    public boolean insertContact(contact cont) throws SQLException {
        boolean contactCreated = true;
        DatabaseMetaData myConnection;
        Connection con = myConnection.getConnection();
        PreparedStatement info;

        try {
            info = con.prepareStatement("Insert into" 'contact' ('ID','user_id','first_name','family_name','mobile_number','email','address','picture');
            info.setString(1, cont.getfirst_name());
            info.setString(2, cont.getfamily_name());
            info.setString(3, cont.getmobile_number());
            info.setString(4, cont.getemail());
            info.setString(5, cont.getaddress());
            info.setBytes(6, cont.getpicture());
            info.setInt(8, cont.user_id());

            if (info.executeUpdate() !=0) {
                JOptionPane.showMessageDialog(null, "New contact has been created");
                contactCreated = true;
            } else { JOptionPane.showMessageDialog(null, "There is something wrong");
                contactCreated = false;

        } catch (SQLException SQLex) {
            Logger.getLogger(ContactList.class.getName()).log(Level.SEVERE, null, SQLex)
        }
        return contactCreated;
    } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
