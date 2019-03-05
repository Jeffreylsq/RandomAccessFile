package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �û�ע�Ṧ��
 * �����������û������û��������룬�ǳƣ����䣬
 * Ȼ����Ϣ����user.dat��
 * �����û��������룬�ǳ�Ϊ�ַ���������Ϊintֵ
 * 
 * ��ʽ��
 * ÿ����¼�̶�ռ100���ֽ�
 * �����û����������ǳƸ�32���ֽڣ�Ϊ�ַ���
 * ������intֵ���̶�Ϊ4�ֽ�
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
		
		ran.seek(ran.length()); //ָ���ƶ���ĩβ
		
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
