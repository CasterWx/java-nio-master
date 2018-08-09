package com.nio;

import java.nio.ByteBuffer;

import org.junit.Test;
 

public class TestBuffer {
	
	@Test
	public void test(){
		String str = "abcdef" ;
		// ����ָ����С�Ļ�����
		ByteBuffer buf = ByteBuffer.allocate(1024*10);
		log(buf);
		buf.put(str.getBytes()) ;
		log(buf);
		// �л�Ϊ��ȡ����ģʽ flip
		buf.flip();
		log(buf);
		byte []bs = new byte[buf.limit()];
		buf.get(bs);
		System.out.println(new String(bs,0,bs.length));
		log(buf);
		// rewind���ظ���֮ǰ����
		buf.rewind();
		log(buf);
		// clear��ջ�����
		buf.clear();
		log(buf);
	}
	public static void log(ByteBuffer buf){
		System.out.println(buf.position());
		System.out.println(buf.limit());
		System.out.println(buf.capacity());
	}
}
