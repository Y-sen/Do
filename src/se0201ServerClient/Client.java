package se0201ServerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		demo1();
		
		
	}

	private static void demo1() {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket("10.25.130.135", 9988);
			
			//获取控制台的输入内容
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			OutputStream ous = socket.getOutputStream();
//			OutputStreamReader osr = new OutputStreamReader();
			PrintStream ps = new PrintStream(ous);
			String str =br.readLine();
			while(br!=null){
				ps.println(str);
				str=br.readLine();
			}
			
			ps.close();
			ous.close();
			br.close();
			isr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
