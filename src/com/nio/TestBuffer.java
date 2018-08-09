package com.nio;

import java.nio.ByteBuffer;

import org.junit.Test;
 

public class TestBuffer {
	
	@Test
	public void test(){
		String str = "abcdef" ;
		// 分配指定大小的缓冲区
		ByteBuffer buf = ByteBuffer.allocate(1024*10);
		log(buf);
		buf.put(str.getBytes()) ;
		log(buf);
		// 切换为读取数据模式 flip
		buf.flip();
		log(buf);
		byte []bs = new byte[buf.limit()];
		buf.get(bs);
		System.out.println(new String(bs,0,bs.length));
		log(buf);
		// rewind可重复读之前数据
		buf.rewind();
		log(buf);
		// clear清空缓冲区
		buf.clear();
		log(buf);
	}
	public static void log(ByteBuffer buf){
		System.out.println(buf.position());
		System.out.println(buf.limit());
		System.out.println(buf.capacity());
	}
}
