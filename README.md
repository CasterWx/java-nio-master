# java-nio-master
java nio

## ������ 
### ��Java NiO�и������ݵĴ�ȥ���������������顣���ڴ洢��ͬ���������͵����ݡ�
### ���ݲ�ͬ�������ͣ�Boolean���⣩���ṩ����Ӧ���͵Ļ�����

1. ByteBuffer
2. CharBuffer
3. IntBuffer
4. LongBuffer
5. FloatBuffer
6. DoubleBuffer
7. shortBuffer

### ��������ͨ��allocate()��û�����

## ��������ȡ���ݵ��������ķ���
1. put() �������ݵ�������
2. get() ��û�����������

## ���������ĸ���������
1. capacity ���� �����������洢���ݵ�������һ���������ܸı䡣
2. limit ���� ����ʾ�������п��Բ������ݵĴ�С��limit������ݲ��ܲ�����
3. position λ�� �������������ڲ�����λ��
> poistionС��limitС��capacity
4. filps ������ģʽ ��limit��position��position��0
>		ByteBuffer buf = ByteBuffer.allocate(1024);
>		System.out.println(buf.position());
>		System.out.println(buf.limit());
>		System.out.println(buf.capacity());
> ��� �� 0
>		1024
>		1024

### ����ָ����С�Ļ�����
#### ByteBuffer buf = ByteBuffer.allocate(1024);
### put() 
#### �������ݵ�������
### get()
#### ��û�����������
### rewind()
#### position��0�����ظ���֮ǰ����
### clear()
#### ��ջ��������ص����״̬����Ȼ����������գ����������ݻ��ڣ�ֻ������Щ���ݴ��ڱ�����״̬��
### mark() 
#### ���λ��
### reset()
#### �ص�markλ�ô�