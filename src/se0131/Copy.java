package se0131;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		demo1();
		demo2();
	}
	private static void demo2() throws IOException{
		// TODO Auto-generated method stub
		String fileName;
		String path = "E:\\AAAA\\JAVA\\BB\\";
		File sfile = new File("E:\\AAAA\\1.png");  //源文件 
		
		if(sfile.exists()){
			fileName = sfile.getName();
			path = path + fileName;
			File gfile = new File(path); //目标文件地址
			FileOutputStream output = new FileOutputStream(gfile,true);
			
			InputStream input = new FileInputStream(sfile);
			int num = (int)sfile.length();
			System.out.println(num);
			byte[] b = new byte[num];
			for (int i = 0; i < b.length;) {
				
			}
			
//			output.close();
			input.close();
			
		}
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
