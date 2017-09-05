package com.google.ssm.io;

import java.io.*;

public class IOTest3 {

    public static void main(String[] args) throws Exception {
        File file = new File("d:\\a.pdf");
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("d:\\c.pdf"));

        long start = System.currentTimeMillis();

        int len = 0;
        byte[] b = new byte[1024*8];
        while ((len = inputStream.read(b)) != -1){
            outputStream.write(b, 0, len);
            outputStream.flush();
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        outputStream.close();
        inputStream.close();
    }
}
