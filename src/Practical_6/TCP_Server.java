// Program to TCP server for communication.
package Practical_6;

import java.io.*;
import java.net.*;

public class TCP_Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str = "", str2;
            while (!str.equals("stop")) {
                str = dataInputStream.readUTF();
                System.out.println("Client says: " + str);
                str2 = bufferedReader.readLine();
                dataOutputStream.writeUTF(str2);
                dataOutputStream.flush();
            }
            dataInputStream.close();
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
