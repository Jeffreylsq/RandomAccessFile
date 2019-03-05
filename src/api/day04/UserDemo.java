package api.day04;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;
public class UserDemo {

	public static void main(String[] args) throws IOException {

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter user name");
		String name = kb.next();
		System.out.println("please enter your nick name");
		String nick = kb.next();
		System.out.println("Please enter your passcode");
		String pas = kb.next();
		System.out.println("Enter your age");
		int age = Integer.parseInt(kb.next());
		
		RandomAccessFile ran = new RandomAccessFile("tttt.txt", "rw");
		
		ran.seek(ran.length());
		byte[]data = name.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		ran.write(data);
		
		data = nick.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		ran.write(data);
		
		data = pas.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		ran.write(data);
		
		ran.writeInt(age);
		
		ran.close();
		
	}

}
