package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * ���ļ���д�ַ���
 * 
 * @author pc
 *
 */
public class WriteStringDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf  =new RandomAccessFile("./rafg.txt","rw");
		String str ="aassa";
		/*
		 * String �ṩ�˽��ַ���ת�����ֽڵط���
		 * byte[]getBytes()
		 * ����ϵͳĬ���ַ���ת�������Ƽ���
		 * byte[]getBytes(String csn)
		 * ����ָ�����ַ�������ת��
		 * utf-8 Ӣ��һ�ֽ� ����3�ֽ�
		 * gbk Ӣ��1�ֽڣ� ����2�ֽ�
		 * 
		 * 
		 */
		byte[]data = str.getBytes("gbk"); // ����ط���������ָ�����ַ���ת��
		raf.write(data);
		raf.close();
		
	}

}
