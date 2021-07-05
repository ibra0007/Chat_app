package chat_app_adv12th;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread  {
    Socket socket ;
    ServerThread ( Socket socket ){
        this.socket=socket ;
    }
    @Override public void run(){
        try{
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream()) ;
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream()) ;
        while (true) {
         //Pair p = (Pair)ois.readObject();
         int x = ois.readInt();
         if (x ==0 )
         break ;
         
         int y = ois.readInt();
         //int z = x + y ; 
         oos.writeInt(x+y);
         oos.flush();   
        }
        socket.close();
        }catch (Exception e ) {
            System.out.println(e);
        }
    /*
    ServerSocket server_socket = new ServerSocket(2020);
    for(int i=0 ; i<2 ;i++){ // hyfdl yreseve
    Socket socket = server_socket.accept() ;
*/
    /*
    int x = ois.readInt();
    int y = ois.readInt();
    int z = x + y ;
*/     
    }
}  

