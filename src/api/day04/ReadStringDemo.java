package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 读取字符串数据
 */
public class ReadStringDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("ref.txt", "r");
		/**
		 * RandomAccessFile提供的方法：
		 * long length();
		 * 用于获取其操作的文件长度（字节量）
		 */
		
		
		byte[]data = new byte[(int)(raf.length())];
	
		raf.read(data);
		
		/*
		 * String 提供的构造方法：
		 * String(byte[]data)
		 * 将给定的字节数组中的所有字节按照系统默认字符集转换成字符串（不推荐）
		 * 
		 * String(byte[]data,String csn)
		 * 将给定字节数组中所有字节按照给定的字符集转换为字符串
		 */
		String line = new String(data,"gbk");
		System.out.println(line);
		
	}

}
