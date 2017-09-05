package com.google.ssm.io;

import java.io.*;

public class IOTest3 {

    public static void main(String[] args) throws Exception {
        File file = new File("e:\\a.mp4");
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file), 8*1024);
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("e:\\c.mp4"), 8*1024);

        long start = System.currentTimeMillis();

        int len = 0;
        while ((len = inputStream.read()) != -1){
            outputStream.write(len);
            outputStream.flush();
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        outputStream.close();
        inputStream.close();
    }
}
