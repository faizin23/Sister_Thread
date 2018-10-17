/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NO_4;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Faizin
 */
public class ClientThread extends Thread{
    public static final int SERVICE_PORT = 13;
    String hostname = "localhost";
    InputStream in ;
    BufferedReader bf ;
    @Override
    public void run(){
        try{
            Socket client5 = new Socket(hostname, SERVICE_PORT);
            bf = new BufferedReader(new InputStreamReader(client5.getInputStream()));
            System.out.println(bf.readLine());
            Thread.sleep(5000);
            client5.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Thread t1 = new ClientThread();
        t1.start();
    }
}
