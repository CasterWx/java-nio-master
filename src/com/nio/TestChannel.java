package com.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Test; 

public class TestChannel {
	@Test
	public void test(){
		FileInputStream fis = null ; 
		FileOutputStream fos = null ;
		FileChannel inChannel = null ;
		FileChannel outChannel = null ;
		
		try {
			fis = new FileInputStream(""); //filename
			fos = new FileOutputStream("");  // outname

			//��ȡͨ��
			 inChannel = fis.getChannel();
			 outChannel = fos.getChannel();
			//����ָ����С�Ļ�����
			ByteBuffer buf = ByteBuffer.allocate(1024);
			while(inChannel.read(buf)!=-1){
				buf.flip();
				//����������д��ͨ��
				outChannel.write(buf);
				buf.clear();
			}	
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}finally {
			try {
				inChannel.close();
				outChannel.close();
				fos.close();
				fis.close();	
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("error2");
			} 
		}
		
	}
}
