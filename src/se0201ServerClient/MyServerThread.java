package se0201ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerThread implements Runnable{
	Socket socket;
	public MyServerThread(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
//			ServerSocket server = new ServerSocket(9988);
//			System.out.println("wait for linked...");
//			socket = server.accept();
//			System.out.println("linked successful");
			InputStream inps = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(inps);
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			while(str!=null){
				System.out.println(socket.getClass().getName()+str);
				str = br.readLine();
			}
			br.close();
			isr.close();
			inps.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
