// Program to TCP Client for communication.
package Practical_6;

import java.io.*;
import java.net.*;

public class TCP_Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str = "", str2;
            while (!str.equals("stop")) {
                str = bufferedReader.readLine();
                dataOutputStream.writeUTF(str);
                dataOutputStream.flush();
                str2 = dataInputStream.readUTF();
                System.out.println("Server says: " + str2);
            }
            dataOutputStream.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
