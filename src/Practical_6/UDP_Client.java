// Program to UDP Client for communication.
package Practical_6;

import java.net.DatagramPacket;
public class UDP_Client {
    public static void main(String[] args) {
        try {
            java.net.DatagramSocket socket = new java.net.DatagramSocket();
            String message = "Hello from client";
            byte[] buffer = message.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, java.net.InetAddress.getLocalHost(), 3000);
            socket.send(packet);
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
