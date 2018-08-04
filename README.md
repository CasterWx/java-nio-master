# java-nio-master
java nio

* 目录
	* [缓冲区](#缓冲区)
	* [通道](#通道)
	
# 缓冲区 
## 在Java NiO中负责数据的存去，缓冲区就是数组。用于存储不同的数据类型的数据。
## 根据不同数据类型（Boolean除外），提供了相应类型的缓冲区

1. ByteBuffer
2. CharBuffer
3. IntBuffer
4. LongBuffer
5. FloatBuffer
6. DoubleBuffer
7. shortBuffer

### 上述均是通过allocate()获得缓冲区

## 缓冲区存取数据的两个核心方法
1. put() 存入数据到缓冲区
2. get() 获得缓冲区中数据

## 缓冲区的四个核心属性
1. capacity 容量 ：缓冲区最大存储数据的容量，一旦声明不能改变。
2. limit 界限 ：表示缓冲区中可以操作数据的大小，limit后的数据不能操作。
3. position 位置 ：缓冲区中正在操作的位置
> poistion小于limit小于capacity
4. filps 读数据模式 ：limit置position，position置0
>		ByteBuffer buf = ByteBuffer.allocate(1024);
>		System.out.println(buf.position());
>		System.out.println(buf.limit());
>		System.out.println(buf.capacity());
> 结果 ： 0
>		1024
>		1024

### 分配指定大小的缓冲区
#### ByteBuffer buf = ByteBuffer.allocate(1024);
### put() 
#### 存入数据到缓冲区
### get()
#### 获得缓冲区中数据
### rewind()
#### position置0，可重复读之前数据
### clear()
#### 清空缓冲区，回到最初状态，虽然缓冲区被清空，但里面数据还在，只不过这些数据处于被遗忘状态。
### mark() 
#### 标记位置
### reset()
#### 回到mark位置处

# 通道
## 用于源节点和目标节点的连接，在NIO中负责缓冲区数据的传输。Channel本身不存储数据，因此需要配合缓冲区进行传输/
## 通道的主要实现类:
### java.nio.channels.Channels接口：
> FileChannel
> SocketChannel
> ServerSocketChannel
> DatagramChannel

## 获取通道
### 1.Java针对支持通道的类提供了getChannel()方法
>	本地IO:
>	FileInputStream/FileOutputStream
>	RandomAccessFile
>
>	网络IO:
>	Soctet
>	ServerSocket
>	DatagramSocket
### 2.在JDK1.7中的NIO.2针对各个通道提供了一个静态方法open()
### 3.在JDK1.7中的Files工具类的newByteChannel()
	