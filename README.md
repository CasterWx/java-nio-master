# java-nio-master
java nio

## 缓冲区 
### 在Java NiO中负责数据的存去，缓冲区就是数组。用于存储不同的数据类型的数据。
### 根据不同数据类型（Boolean除外），提供了相应类型的缓冲区

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