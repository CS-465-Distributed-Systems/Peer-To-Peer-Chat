package PeerToPeerChat;
import java.io.*;
import java.net.*;

public class PeerToPeerChat {

    private String[] peerTable;

    public static void main(String[] args) {
        DatagramSocket serverSocket = new DatagramSocket(9876);
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
    public void sendMessage(String input, String destination){
        byte[] sendData = new byte[1024];
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
        serverSocket.send(sendPacket);
    }
    
    public void recieveMessage(String input){
        byte[] receiveData = new byte[1024];
        while(true){
            byte[] reset = new byte[1024];
            receiveData = reset;
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            String sentence = new String(receivePacket.getData());

            sentence = sentence.trim();

            System.out.println("RECEIVED: " + sentence);
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();

            System.out.println(sentence);
        }

    }

    public void updateCat(String input){
    
    }
}
