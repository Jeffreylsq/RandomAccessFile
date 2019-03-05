package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * 向文件中写字符串
 * 
 * @author pc
 *
 */
public class WriteStringDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf  =new RandomAccessFile("./rafg.txt","rw");
		String str ="aassa";
		/*
		 * String 提供了将字符串转换成字节地方法
		 * byte[]getBytes()
		 * 按照系统默认字符集转换（不推荐）
		 * byte[]getBytes(String csn)
		 * 按照指定的字符集进行转换
		 * utf-8 英文一字节 中文3字节
		 * gbk 英文1字节， 中文2字节
		 * 
		 * 
		 */
		byte[]data = str.getBytes("gbk"); // 这个地方可以设置指定的字符集转换
		raf.write(data);
		raf.close();
		
	}

}
