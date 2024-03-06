// Program to UDP server for communication.
package Practical_6;

import java.net.DatagramPacket;
public class UDP_Server {
    public static void main(String[] args) {
        try {
            java.net.DatagramSocket socket = new java.net.DatagramSocket(3000);
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Message from client: " + message);
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
