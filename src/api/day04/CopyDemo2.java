package api.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 由于机械硬盘读写效率差，频繁地进行读写复制效率不高
 * 我们可以提高每次都写的数据量， 减少实际读写次数
 * 从而提高读写效率
 * 单字节读写一般可以称为“随机读写”
 * 一组字节读写也可以称为“块读写”
 * 
 * @author pc
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile file = new RandomAccessFile("./tts9.zip","r");
		RandomAccessFile file2 = new RandomAccessFile("./tts9_cp.zip","rw");
		
		
		/* int read(byte[]data)
		 * 连续读取给定字节数组总长度的字节量，并将读取到的字节存入该数组中，返回值为实际读取到的字节量，我们应当根据
		 * 实际读取的字节量判定该数组中本次读取得数据实际长度
		 * 
		 * void write(byte[]data)
		 * 
		 * void write(byte[]data,int offset,int len)
		 * 一次性将给定字节数组中所有字节写出
		 */
	/*	byte [] data = new byte[1024*10];   //编译器早就算好了，并不损耗效率 ，但是这样写更有意义
		int len = -1; //表示每次实际读取到的字节数
		
		while((len = file.read(data))!= -1) {
			
			file2.write(data,0,len);
		}
		System.out.println("Finish");
		
		file.close();
		file2.close();
		
	*/
	
		long start = System.currentTimeMillis();
		
		byte[]data = new byte[1024*100];
		int len = -1;
		while((len = file.read(data))!= -1) {
			file2.write(data,0,len);
		}
		
		
		System.out.println("Finish");
		System.out.println("Total: " + (System.currentTimeMillis() - start) + " ms");
		file.close();
		file2.close();
		
		
	}

}
