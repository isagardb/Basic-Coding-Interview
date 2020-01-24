package Miscellaneous;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP_address {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);
    }
}

/*
DESKTOP-03ENRIL/127.0.0.1
 */