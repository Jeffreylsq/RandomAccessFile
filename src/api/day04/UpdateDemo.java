package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �޸��ǳƣ�Ҫ���û������û������ǳ�
 * Ȼ�� user.dat �ļ��ж�Ӧ���û��ǳƸ���
 * �����û������� ����ʾ���޴���
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
