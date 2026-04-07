import java.io.*;
import java.net.*;
public class MyClient1 
{
 public static void main (String[]args) throws IOException
 {
    DatagramSocket dSocket=new DatagramSocket();
    InetAddress add=InetAddress.getByName("localhost");
    String str="*message to server from client*";
    byte[]bufBytes=str.getBytes();
    DatagramPacket datapacket=new DatagramPacket(bufBytes, bufBytes.length,add,9000);
    dSocket.send(datapacket);
     
    dSocket.close();
 }
}