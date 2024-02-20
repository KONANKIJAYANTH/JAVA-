import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket server = new Socket("127.0.0.1", 5003); // Corrected IP address
            OutputStream out = server.getOutputStream();
            String message = "Hi Server!";
            out.write(message.getBytes());
            out.flush();
            InputStream in = server.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String replymessage = reader.readLine();
            System.out.println("Server reply: " + replymessage);
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
