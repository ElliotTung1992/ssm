package com.google.ssm.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest6 {
    public static void main(String[] args) {
        try (FileOutputStream fis = new FileOutputStream("e:\\word.txt");) {
            String msg = "好好学习";
            //bos.write(msg.getBytes());
            //每次写出3个字节，因为一个中文占用2个字节，所以导致乱码
            byte[] bytes = msg.getBytes();
            fis.write(bytes, 0, 5);
            //换行
            fis.write("\r\n".getBytes());
            fis.write("天天向上".getBytes());
            fis.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
