package chat_app_adv12th;
import java.net.ServerSocket ;
import java.net.Socket;
public class Server {
    Server() {
try {
     ServerSocket server_socket = new ServerSocket(2020);
     for(int i=0 ; i<2 ;i++){ // hyfdl yreseve
     Socket socket = server_socket.accept() ;
     ServerThread temp = new ServerThread(socket); 
     temp.start();
     }   
 //System.out.println(z);
 //server_socket.close();
} catch (Exception e) {
System.out.println(e);
}
}
public static void main (String[] aast) {
new Server() ;
//socket = socket_server.axxept();
}
}