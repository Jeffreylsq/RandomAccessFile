package api.day04;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class FileCopy {

	public static void main(String[] args) throws IOException {

		RandomAccessFile file = new RandomAccessFile("tts9.rar","rw");
		RandomAccessFile file2 = new RandomAccessFile("tts10.rar","rw");
		
		byte[]arr = new byte[1024*100];
		int len = -1;
		while((len = file.read(arr))!= -1) {
			file2.write(arr);
		}
		
		System.out.println("finish");
		file.close();
		file2.close();
	}

}
