package api.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ڻ�еӲ�̶�дЧ�ʲƵ���ؽ��ж�д����Ч�ʲ���
 * ���ǿ������ÿ�ζ�д���������� ����ʵ�ʶ�д����
 * �Ӷ���߶�дЧ��
 * ���ֽڶ�дһ����Գ�Ϊ�������д��
 * һ���ֽڶ�дҲ���Գ�Ϊ�����д��
 * 
 * @author pc
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile file = new RandomAccessFile("./tts9.zip","r");
		RandomAccessFile file2 = new RandomAccessFile("./tts9_cp.zip","rw");
		
		
		/* int read(byte[]data)
		 * ������ȡ�����ֽ������ܳ��ȵ��ֽ�����������ȡ�����ֽڴ���������У�����ֵΪʵ�ʶ�ȡ�����ֽ���������Ӧ������
		 * ʵ�ʶ�ȡ���ֽ����ж��������б��ζ�ȡ������ʵ�ʳ���
		 * 
		 * void write(byte[]data)
		 * 
		 * void write(byte[]data,int offset,int len)
		 * һ���Խ������ֽ������������ֽ�д��
		 */
	/*	byte [] data = new byte[1024*10];   //�������������ˣ��������Ч�� ����������д��������
		int len = -1; //��ʾÿ��ʵ�ʶ�ȡ�����ֽ���
		
		while((len = file.read(data))!= -1) {
			
			file2.write(data,0,len);
		}
		System.out.println("Finish");
		
		file.close();
		file2.close();
		
	*/
	
		long start = System.currentTimeMillis();
		
		byte[]data = new byte[1024*100];
		int len = -1;
		while((len = file.read(data))!= -1) {
			file2.write(data,0,len);
		}
		
		
		System.out.println("Finish");
		System.out.println("Total: " + (System.currentTimeMillis() - start) + " ms");
		file.close();
		file2.close();
		
		
	}

}
