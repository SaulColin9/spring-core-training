package proxy;


public class LazyProxy extends Proxy{

    public LazyProxy(){
        System.out.println("Lazy Proxy Initialized");
    }
    @Override
    public void connect(String user, String password) {
        if(connection == null){
            connection = new DbConnection();
        }
        connection.connect(user,password);
        connection.checkConnection();
    }
}
