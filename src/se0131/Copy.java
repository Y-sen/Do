package se0131;

import java.io.File; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		demo1();
//		demo2();
		demo3();
	}
	private static void demo3() throws IOException {
		// TODO Auto-generated method stub
		File sfile = new File("E:\\AAAA\\BB\\1.png");
		String fileName=sfile.getName();
		File dfile = new File("E:\\AAAA\\BB\\CC\\1.png");
		InputStream inp = new FileInputStream(sfile);
		byte[] b = new byte[1024];
		OutputStream out = new FileOutputStream(dfile,true);
		int i = inp.read(b);
		while(i!=-1){
			out.write(b, 0, i);
			i = inp.read(b);
		}
		System.out.println("successful");
		out.close();
		inp.close();
		
	}
	private static void demo2() throws IOException{
		File sfile=new File("E:\\AAAA\\1.png");
		File dfile=new File("E:\\AAAA\\JAVA\\BB\\1.png");
		byte[] b=new byte[1024];
		InputStream is=new FileInputStream(sfile);
		OutputStream os=new FileOutputStream(dfile,true);
		int i=is.read(b);
		while(i!=-1){
			os.write(b, 0, i);
			i=is.read(b);
		}
		System.out.println("successful");
		os.close();
		is.close();
	}
	public static void demo1() throws IOException{
		
		String fileName;
		String path = "E:\\AAAA\\JAVA\\BB\\";
		File sfile = new File("E:\\AAAA\\1.png");
		
		if(sfile.exists()){
			fileName = sfile.getName();
			InputStream input = new FileInputStream(sfile);
			byte[] b = new byte[(int)sfile.length()];
			input.read(b);
			input.close();
//			String str =new String(b);
//			System.out.println(str);
			System.out.println("文件复xie成功");
			path = path + fileName;
			
			System.out.println(path);
			File gfile = new File(path);
			
			FileOutputStream output = new FileOutputStream(gfile);
			output.write( b);
			output.close();
			System.out.println("文件复制成功");
			
		}else{
			System.out.println("此文件不存在");
		}
	}

}
