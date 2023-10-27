package proxy;

import java.nio.file.AccessDeniedException;
import java.util.Map;

public class ProxyPattern {

    // TODO implement two proxy patterns
    // 1. Proxy with lazy initialization of DbConnection
    // 2. Proxy that rejects and throw AccessDeniedException for
    // all users except "admin" and "stakeholder" while connecting

    public static void main(String[] args) {
        Proxy proxy = new LazyProxy();
        proxy.connect("stakeholder", "1234");

        System.out.println("=====================");
        //Authenticated credentials
        proxy = new SecureProxy();
        proxy.connect("admin", "root");
        //Non authenticated credentials
        System.out.println("=====================");
        proxy.connect("user", "pass");
    }
}
