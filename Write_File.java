import java.io.*;

class Write_File{
public static void main(String Ar[]) {
//throws IOException{ 
try{
InputStreamReader r=new InputStreamReader(System.in);
 	BufferedReader br =new BufferedReader(r);

System.out.println("Enter the string ");
String str = br.readLine(); 
FileWriter f=new FileWriter("D:/aiswarya/Writefile.txt");// check path
          
	BufferedWriter wr=new BufferedWriter(f);
        wr.write(str);
	
	wr.close();
System.out.println("Sucessfully written to the file ");
}catch(IOException w){System.out.println(w);}
  String s="";

   		 try{
		FileReader f1=new FileReader("D:/aiswarya/Writefile.txt");
    
//Reader and  Writer are used in character streams and End of file (null)
	
		BufferedReader r=new BufferedReader(f1);
		while((s=r.readLine())!=null){
        		System.out.println(s);
		}
		r.close();
   	
	}catch(Exception e)
{System.out.println(e);
}
	
}

}