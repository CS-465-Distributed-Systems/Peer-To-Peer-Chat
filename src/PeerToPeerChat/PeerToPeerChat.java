package PeerToPeerChat;
import java.io.*;
import java.net.*;
import java.net.DatagramSocket;

public class PeerToPeerChat {

    private String[] peerTable;



    public static void main(String[] args) throws IOException {
        DatagramSocket serverSocket = new DatagramSocket(9876);
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("localhost");
    }

    public boolean connect(String ipAddress){
        return true;
    }
    
    public void updateTable(String inputTable){
    
    }
    
    public String[] getTable(){
        return peerTable;
    }

    //String destination can designate who to send it to, listed out as option
    //a, b, c etc. where each letter stands for a recipient.

    //temporary input for testing, etc...





    int port = 8080;

    public void sendMessage(String input, String destination){

        try

        {
            InetAddress IPAddress = InetAddress.getByName("192.168.0.1");

        } catch (UnknownHostException e) {

            e.printStackTrace();
        }

        byte[] sendData = new byte[1024];
        String sentence = "";
        sendData = sentence.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
        serverSocket.send(sendPacket);
        clientSocket.send(sendPacket);
    }
    
    public void recieveMessage(String input){
        byte[] receiveData = new byte[1024];

        while(true){
            byte[] reset = new byte[1024];
            receiveData = reset;
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            clientSocket.receive(receivePacket);
            String sentence = new String(receivePacket.getData());

            sentence = sentence.trim();

            System.out.println("RECEIVED: " + sentence);
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();

            System.out.println(sentence);
        }

        String sentence = inFromUser.readLine();
        clientSocket.close();
    }

    public void updateCat(String input){
    
    }
}
