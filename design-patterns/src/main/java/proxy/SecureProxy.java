package proxy;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;

public class SecureProxy extends Proxy{
    List<String> allowedUsers = new ArrayList<>();
    public SecureProxy(){
        System.out.println("Secure Proxy Initialized...");
        allowedUsers.add("admin");
        allowedUsers.add("stakeholder");
        this.connection = new DbConnection();
    }
    @Override
    public void connect(String user, String password){
        try{
            System.out.println("Checking authorization...");
            if(!authorize(user)) {
                throw new AccessDeniedException("DbConnection access denied for " + user);
            }
            System.out.println("Access enabled");
            connection.connect(user, password);
            connection.checkConnection();

        }catch (AccessDeniedException e){
            e.printStackTrace();
        }
    }

    public boolean authorize(String user) {
        return allowedUsers.contains(user);
    }
}
