package experiment.experiment_4;
import java.net.*;
public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String msg = "Hello from UDP client!";
        byte[] data = msg.getBytes();
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(data, data.length, address, 9999);

        socket.send(packet);

        // 接收回复
        byte[] buffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
        socket.receive(receivePacket);
        String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("服务器回复：" + response);

        socket.close();
    }
}
