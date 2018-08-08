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

			//获取通道
			 inChannel = fis.getChannel();
			 outChannel = fos.getChannel();
			//分配指定大小的缓冲区
			ByteBuffer buf = ByteBuffer.allocate(1024);
			while(inChannel.read(buf)!=-1){
				buf.flip();
				//缓冲区数据写入通道
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
