package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo3 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile file = new RandomAccessFile("./tts9.zip", "r");
		RandomAccessFile file2 = new RandomAccessFile("./tts9.c.zip","rw");
		
		byte[]data = new byte[1024 * 10];
		int len = -1;
		while((len = file.read(data))!= -1) {
			file2.write(data,0,len);
		}
		System.out.println("finish");
		file.close();
		file2.close();
	}

}
