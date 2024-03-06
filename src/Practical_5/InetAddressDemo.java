// InetAddressDemo class to get the IP address of the given host name.
package Practical_5;

import java.net.*;
public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("github.com");
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
