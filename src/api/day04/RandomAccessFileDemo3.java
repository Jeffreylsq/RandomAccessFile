package api.day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF读写基本数据类型，以及基于指针的操作
 * 
 * @author Jeffrey Wei
 *
 */
public class RandomAccessFileDemo3 {

	public static void main(String[] args) throws IOException {

		RandomAccessFile ran = new RandomAccessFile("rad.dat","rw");
		
		//获取指针位置
		long pos = ran.getFilePointer();   //指向的是第几个byte+
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
		 * >>>位运算，将2进制向右移动指定位数
		 * max>>>24                   vvvvvvvv
		 * 00000000 00000000 00000000 00000000
		 * 00000000 00000000 00000000 01111111 11111111 11111111 11111111
		 * 因为 我们写入只能看见后八位， 所以我们要将每8位都往后移动
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
		
		ran.seek(0);//第一个字节位置 指针移回指定位置
		System.out.println("pos " + ran.getFilePointer());
		
		/*
		 * int readInt()
		 * 连续读取四个字节并还原对应的int值
		 * 如果在读取过程中读到了文件末尾，则方法会抛出异常
		 * 异常：EOFException end of file 文件末尾
		 */
		int d = ran.readInt();
		System.out.println(d);
		System.out.println("pos " + ran.getFilePointer());
		
		
		//读取long 值
		ran.seek(8);    //从long 开头位置
		long l = ran.readLong();     // 使用这个方法以后 指针移动对应类型的 字节数 从8 到16
		System.out.println(l);
		System.out.println("pos " + ran.getFilePointer());
		
		//将long 改为456
		/*
		 * 只需要将指针移回原位置，重新调用write()方法就可以
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
