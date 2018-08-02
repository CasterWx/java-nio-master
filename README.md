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