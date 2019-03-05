package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF��д�����������ͣ��Լ�����ָ��Ĳ���
 * 
 * @author Jeffrey Wei
 *
 */
public class RandomAccessFileDemo3 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile ran = new RandomAccessFile("rad.dat","rw");
		
		//��ȡָ��λ��
		long pos = ran.getFilePointer();   //ָ����ǵڼ���byte+
		System.out.println("pos " + pos);
		
		int max = Integer.MAX_VALUE;
		
		ran.write(max>>>24);
		
		System.out.println("pos " + ran.getFilePointer());
		
		ran.write(max>>>16);
		
		System.out.println("pos " + ran.getFilePointer());
		
		ran.write(max>>>8);
		System.out.println("pos " + ran.getFilePointer());
		ran.write(max);
		System.out.println("Finish");
		
		
		/*
		 * 
		 * >>>λ���㣬��2���������ƶ�ָ��λ��
		 * max>>>24                   vvvvvvvv
		 * 00000000 00000000 00000000 00000000
		 * 00000000 00000000 00000000 01111111 11111111 11111111 11111111
		 * ��Ϊ ����д��ֻ�ܿ������λ�� ��������Ҫ��ÿ8λ�������ƶ�
		 */
		
		ran.writeInt(max);
		System.out.println("pos " + ran.getFilePointer());
		System.out.println("Finish");
		
		
		
		ran.writeLong(123L);
		System.out.println("pos " + ran.getFilePointer());
		
		ran.writeDouble(23.32);
		System.out.println("pos " + ran.getFilePointer());
		ran.writeFloat(828F);
		System.out.println("pos " + ran.getFilePointer());
		ran.writeShort(12);
		System.out.println("pos " + ran.getFilePointer());
		
		ran.seek(0);//��һ���ֽ�λ�� ָ���ƻ�ָ��λ��
		System.out.println("pos " + ran.getFilePointer());
		
		/*
		 * int readInt()
		 * ������ȡ�ĸ��ֽڲ���ԭ��Ӧ��intֵ
		 * ����ڶ�ȡ�����ж������ļ�ĩβ���򷽷����׳��쳣
		 * �쳣��EOFException end of file �ļ�ĩβ
		 */
		int d = ran.readInt();
		System.out.println(d);
		System.out.println("pos " + ran.getFilePointer());
		
		
		//��ȡlong ֵ
		ran.seek(8);    //��long ��ͷλ��
		long l = ran.readLong();     // ʹ����������Ժ� ָ���ƶ���Ӧ���͵� �ֽ��� ��8 ��16
		System.out.println(l);
		System.out.println("pos " + ran.getFilePointer());
		
		//��long ��Ϊ456
		/*
		 * ֻ��Ҫ��ָ���ƻ�ԭλ�ã����µ���write()�����Ϳ���
		 */
		ran.seek(8);
		ran.writeLong(456L);
		
		ran.seek(8);
		long l2 =ran.readLong();
		System.out.println(l2);
		System.out.println("pos " + ran.getFilePointer());
		
		
		ran.seek(24);
		ran.close();
		
		
		
		
	}

}
