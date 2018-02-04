package se0201ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servers {
	public static void main(String[] args) {
//		demo1();
		try {
			ServerSocket server = new ServerSocket(9988);
			System.out.println("wait for linked...");
			while(true){
				Socket socket = server.accept();
				System.out.println(socket.getClass().getName()+"linked successful");
				MyServerThread mst = new MyServerThread(socket);
				Thread t1 = new  Thread(mst);
				t1.start();
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	private static void demo1() {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(9988);
			System.out.println("wait for linked...");
			Socket socket = server.accept();
			System.out.println("linked successful");
			InputStream inp = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(inp);
			BufferedReader br = new BufferedReader(isr);
			
			String str = br.readLine();
			while(str!=null){
				System.out.println("Client: "+str);
				str=br.readLine();
			}
			br.close();
			isr.close();
			inp.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
