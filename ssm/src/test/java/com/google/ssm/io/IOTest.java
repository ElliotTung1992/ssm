package com.google.ssm.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest {

    public static void main(String[] args) throws Exception {

        File file = new File("e:\\a.mp4");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream outputStream = new FileOutputStream("e:\\b.mp4");

        int len = 0;
        while ((len = fileInputStream.read()) != -1){
            outputStream.write(len);
        }

        outputStream.flush();
        outputStream.close();
        fileInputStream.close();
    }
}
