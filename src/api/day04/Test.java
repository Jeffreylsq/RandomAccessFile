package api.day04;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
/*
 * ʵ��һ�����׼��±�����
 * ����������Ҫ���û�����һ��Ӣ������Ȼ��Ը��ļ�д������ ֮���û������ÿһ���ַ���
 * д�뵽����ļ��У����û�����exit�����˳�
 * 
 * 
 */
public class Test {

	public static void main(String[] args) throws IOException {

		
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter your name");
		String name = kb.next();
		RandomAccessFile raf = new RandomAccessFile(name+".txt" , "rw");
		
		//String input = kb.next();
		while(true) {
			String input = kb.next();
			String [] arr = input.split(" ");
			
			if("EXIT".equals(arr[arr.length-1].toUpperCase()) ) {
				break;
			}
			byte[]data = {};
			for(int i = 0 ; i < arr.length ; i++) {
				char [] a = arr[i].toCharArray();
					if(a[a.length-1] == 32) {
						System.out.println();
					}
				 data = (arr[i]+ " ").getBytes("utf-8");
			}
			
			raf.write(data);
		}
		System.out.println("Finish");
		raf.close();
		
		
		
	}

}
