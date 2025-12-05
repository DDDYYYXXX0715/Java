package experiment.experiment_4;
import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8888)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("Hello from TCP client!");
            String response = in.readLine();
            System.out.println("服务器回复：" + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
