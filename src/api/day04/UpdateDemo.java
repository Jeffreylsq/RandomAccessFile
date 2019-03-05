package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改昵称，要求用户输入用户名和昵称
 * 然后将 user.dat 文件中对应的用户昵称更改
 * 输入用户不存在 则提示查无此人
 * @author pc
 *
 */
public class UpdateDemo {

	public static void main(String[] args) throws IOException {

		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter user name");
		String name = kb.next();
		System.out.println("Nick name");
		String nick = kb.next();
		
		RandomAccessFile ran = new RandomAccessFile("user1.dat", "rw");
		
		boolean flag = true;
		for(int i = 0 ; i < ran.length()/100; i++) {
			ran.seek(i*100);
			byte[] data = new byte[32];
			ran.read(data);
			String n = new String(data,"utf-8").trim();
			//System.out.println("saaaaaa");
			if(name.equals(n)) {
				//System.out.println("saaaaaa");
				ran.seek(i*100+64);
				byte[]arr = nick.getBytes("utf-8");
				arr = Arrays.copyOf(arr, 32);
				ran.write(arr);
				flag = false;
			}
			
			
			
		}
		if(flag) {
			System.out.println("No this person");
		}
		System.out.println("finish");
		ran.close();
	}

}
