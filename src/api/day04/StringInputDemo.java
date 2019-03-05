package api.day04;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class StringInputDemo {

	public static void main(String[] args) throws IOException {

	/*	RandomAccessFile file = new RandomAccessFile("pppp.txt","rw");
		
		file.writeInt(100);   //4
		file.writeLong(234L);   //8
		file.writeDouble(24.323); //20
		
		file.close();
	*/	
		RandomAccessFile file2 = new RandomAccessFile("pppp.txt", "rw");
		
		int d = file2.readInt();
		System.out.println(d);
		System.out.println(file2.getFilePointer());
		
	    long l = file2.readLong();
	    System.out.println(l);
	    System.out.println(file2.getFilePointer());
		
		file2.seek(4);
		file2.writeLong(333);
		
		double dd = file2.readDouble();
		System.out.println(dd);
		System.out.println(file2.getFilePointer());
		
		file2.seek(4);
		long r = file2.readLong();
		System.out.println(r);
		System.out.println(file2.getFilePointer());
	    
		
		file2.writeDouble(298.3);
		file2.seek(12);
		double t = file2.readDouble();
		System.out.println(t);
	}

}
