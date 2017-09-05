package com.google.ssm.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IOTest4 {

    public static void main(String[] args) throws Exception {

        File file = new File("e:\\a.txt");
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter("e:\\b.txt");

        int len = 0;
        char[] c = new char[1024];
        while ((len = fileReader.read(c)) != -1){
            fileWriter.write(c, 0 , len);
            fileWriter.flush();
        }
        fileWriter.close();
        fileReader.close();
    }
}
