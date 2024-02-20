// SERVER CODE
import java.net.*;
import java.io.*;

public class Server{

	public static void main(String[] args) {
		final int PORT = 5003 ;
      ServerSocket serversocket =null;
		try{
			serversocket = new ServerSocket(PORT);
			System.out.println("SERVER SOCKET WAS OPENED ");
			InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Local IP Address: " + localhost.getHostAddress());
			while(true){
				// Acepting the clients 
				Socket clientsocket = serversocket.accept();
                // every time printing the clients ipadresss 
				System.out.println(" SOCKET WAS OPENED with client :"+ clientsocket.getInetAddress());
				// used to receive input from the socket 
                InputStream in = clientsocket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                String message = reader.readLine();
                // printing the message received from the socket 
                System.out.println("client message : "+message);
                //Code send message from the server
                OutputStream out = clientsocket.getOutputStream();
                String replay = "Haii client, How are doing?";
                out.write(replay.getBytes());
                out.flush();
                // closing the sockets
				clientsocket.close();
			}
		}catch(IOException e){
                   e.printStackTrace();
		}

		}
	}
