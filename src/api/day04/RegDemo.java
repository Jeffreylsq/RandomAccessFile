package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册功能
 * 程序启动，用户输入用户名，密码，昵称，年龄，
 * 然后将信息存入user.dat中
 * 其中用户名，密码，昵称为字符串，年龄为int值
 * 
 * 格式：
 * 每条记录固定占100个字节
 * 其中用户名，密码昵称各32个字节，为字符串
 * 年龄是int值，固定为4字节
 * @author pc
 *
 */
public class RegDemo {

	public static void main(String[] args) throws IOException {

		Scanner kb = new Scanner(System.in);
		System.out.println("please enter user name");
		String name = kb.next();
		System.out.println("passward");
		String pas = kb.next();
		System.out.println("nick name");
		String nick = kb.next();
		System.out.println("Age");
		int age = Integer.parseInt(kb.next());
		
		RandomAccessFile ran = new RandomAccessFile("user1.dat","rw");
		
		ran.seek(ran.length()); //指针移动到末尾
		
		byte[]data = name.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		ran.write(data);
		
		data = pas.getBytes("utf-8");
		data = Arrays.copyOf(data, 32);
		ran.write(data);
		
		data = nick.getBytes("utf-8");
		data = Arrays.copyOf(data,32);
		ran.write(data);
		
		ran.writeInt(age);
		
		ran.close();
		
		
		
		
		
	}

}
