package com.google.ssm.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest2 {

    public static void main(String[] args) throws Exception {
        File file = new File("e:\\a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream outputStream = new FileOutputStream("e:\\b.txt");

        long start = System.currentTimeMillis();


        int len = 0;
        byte[] b = new byte[8*1024];
        while ((len = fileInputStream.read(b)) != -1){
            outputStream.write(b, 0, len);
            outputStream.flush();
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        outputStream.close();
        fileInputStream.close();
    }
}
