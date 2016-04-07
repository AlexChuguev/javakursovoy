package DAO;

import Models.User;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;


@Stateful
public class UserDAO {

    public void addUser(String username, String password) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<User> getAllUsers() {
        ArrayList<User> userList = new ArrayList<>();
        User user = new User("smth", "smth");
        userList.add(user);
        return userList;
       
    }
    
}
