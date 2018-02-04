package se0131;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File sfile = new File("E:\\AAAA\\1.png");  //源文件 
		File dfile = new File("E:\\AAAA\\BB\\1.png");
		byte[] b = new byte[1024];
		try {
			InputStream inp = new FileInputStream(sfile);
			
			OutputStream os = new FileOutputStream(dfile,true);
			int i = inp.read(b); //返回值 读了多少字节
			while(i!=-1){
				os.write( b, 0, i);
				i = inp.read(b);
			}
			
			System.out.println("success");
			os.close();
			inp.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
