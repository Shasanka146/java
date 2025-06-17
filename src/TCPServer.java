import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args)throws Exception
    {
        ServerSocket ss=new ServerSocket(9097);
        System.out.println("Waiting for Client...");
        Socket socket=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
        String cmsg=br.readLine();
        System.out.println("client:"+cmsg);
        out.println("hi from server");
        out.flush();
        socket.close();
        ss.close();

    }
}
