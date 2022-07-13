import java.io.*;
import java.net.*;
class Client1{
public static void main(String args[]){
try{
Socket soc1= new Socket("localhost",4567);
BufferedReader is= new BufferedReader(new InputStreamReader(System.in));
DataOutputStream outToServer=new  DataOutputStream(soc1.getOutputStream());
BufferedReader inFromServer= new BufferedReader(new InputStreamReader(soc1.getInputStream()));
System.out.println("Enter a msg:");
String msg=is.readLine();
outToServer.writeUTF(msg + "\n");
String sentence=inFromServer.readLine();
System.out.println(sentence);
soc1.close();
}
catch(IOException e){
System.out.println(e);
}
}
}