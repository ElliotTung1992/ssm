package com.google.ssm.java.io;

import java.io.*;

public class IOTest5 {

    public static void main(String[] args) throws Exception {
        File file = new File("e:\\a.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
        File file1 = new File("e:\\b.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1),"utf-8"));
        int len = 0;
        char[] c = new char[1024];
        while ((len = bufferedReader.read(c)) != -1){
            bufferedWriter.write(c, 0 , len);
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
