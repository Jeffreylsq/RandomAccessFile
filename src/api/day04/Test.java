package api.day04;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
/*
 * 实现一个简易记事本工具
 * 程序启动后，要求用户输入一个英文名，然后对该文件写操作， 之后用户输入的每一行字符串
 * 写入到这个文件中，当用户输入exit程序退出
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
