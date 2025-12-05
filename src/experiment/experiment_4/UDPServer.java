package experiment.experiment_4;
import java.net.*;
public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        System.out.println("UDP 服务器启动，等待数据...");
        socket.receive(packet);
        String msg = new String(packet.getData(), 0, packet.getLength());
        System.out.println("收到客户端消息：" + msg);

        // 回复客户端
        String reply = "服务器已收到 UDP 消息: " + msg;
        DatagramPacket response = new DatagramPacket(
                reply.getBytes(),
                reply.length(),
                packet.getAddress(),
                packet.getPort()
        );
        socket.send(response);
        socket.close();
    }
}
