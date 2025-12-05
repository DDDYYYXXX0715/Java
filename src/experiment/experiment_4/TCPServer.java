package experiment.experiment_4;
import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            System.out.println("TCP 服务器启动，等待客户端连接...");
            Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String msg = in.readLine();
            System.out.println("收到客户端消息：" + msg);
            out.println("服务器已收到消息: " + msg);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}