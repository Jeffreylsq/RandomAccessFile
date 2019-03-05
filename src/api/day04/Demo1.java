package api.day04;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		//RandomAccessFile file = new RandomAccessFile("jeff.txt","r");
		//RandomAccessFile file2 = new RandomAccessFile("tts9_x.rar","rw");
	/*	
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your file name");
	    String name = kb.next();
	    RandomAccessFile ran = new RandomAccessFile(name+".txt", "rw");
	    
	    while(true) {
	    	
	    	String line = kb.next();
	    	String[]arr = line.split(" ");
	    	
	    	if("exit".equals(arr[arr.length-1])) {
	    		break;
	    	}
	    	for(int i = 0 ; i < arr.length ; i++) {
	    		
	    		byte[] data = (arr[i]+" ").getBytes();
	    		ran.write(data);
	    		
	    	}
	    	
	    }
	    System.out.println("Finish");
    	ran.close();
		
		*/
		RandomAccessFile file = new RandomAccessFile("YYY.txt", "r");
		byte[] data = new byte[(int)file.length()];
		
		file.read(data);
		String str = new String(data, "GBK");
		System.out.println(str);
		
		
		
	}

}
