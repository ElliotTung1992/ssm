package com.google.ssm.io;

import java.io.*;

public class IOTest3 {

    public static void main(String[] args) throws Exception {
        File file = new File("e:\\a.mp4");
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("e:\\c.mp4"));

        long start = System.currentTimeMillis();

        int len = 0;
        byte[] b = new byte[1024];
        while ((len = inputStream.read(b)) != -1){
            outputStream.write(b, 0, len);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        outputStream.flush();
        outputStream.close();
        inputStream.close();
    }
}
