package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * ��ȡ�ַ�������
 */
public class ReadStringDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("ref.txt", "r");
		/**
		 * RandomAccessFile�ṩ�ķ�����
		 * long length();
		 * ���ڻ�ȡ��������ļ����ȣ��ֽ�����
		 */
		
		
		byte[]data = new byte[(int)(raf.length())];
	
		raf.read(data);
		
		/*
		 * String �ṩ�Ĺ��췽����
		 * String(byte[]data)
		 * ���������ֽ������е������ֽڰ���ϵͳĬ���ַ���ת�����ַ��������Ƽ���
		 * 
		 * String(byte[]data,String csn)
		 * �������ֽ������������ֽڰ��ո������ַ���ת��Ϊ�ַ���
		 */
		String line = new String(data,"gbk");
		System.out.println(line);
		
	}

}
