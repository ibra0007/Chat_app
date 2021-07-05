package chat_app_adv12th;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket ;
import java.util.Scanner;
public class Client {
    Client() {
try {
 Socket socket = new Socket("localhost" , 2020) ;
 Scanner scan = new Scanner(System.in) ;
 ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream()) ;
 ObjectInputStream ois = new ObjectInputStream(socket.getInputStream()) ;
 while (true){
 int x = scan.nextInt() ;
 oos.writeInt(x);
 oos.flush();
 if (x == 0)
     break ;
 
 int y = scan.nextInt() ;
 oos.writeInt(y);
 oos.flush(); // byfady l Q */
 //Pair p = new Pair(x,y) ;
 //oos.writeObject(p);
 int z = ois.readInt();
 System.out.println(z); 
 }
/*oos.writeInt(x);
 oos.flush();
 oos.writeInt(y);
 oos.flush(); // byfady l Q */ 
  scan.close() ; 
 socket.close();
} catch (Exception e) {
System.out.println(e);
}
}
    public static void main (String[] aast) {
new Client() ;
}
}

