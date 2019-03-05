package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ShowAllUserDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("user1.dat","r");

		for(int i = 0 ; i < raf.length()/100 ; i++) {
			byte[]data = new byte[32];
			raf.read(data);
			String username = new String(data,"utf-8").trim();

			raf.read(data);
			String password = new String(data,"utf-8").trim();

			raf.read(data);
			String nick = new String(data,"utf-8").trim();

			int a = raf.readInt();

			System.out.println("Name: " + username + " password: " + password + " nick name: " +nick  + " Age: " + a); 
		}





	}

}
