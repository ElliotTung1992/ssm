package com.google.ssm.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest7 {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("e:\\word.txt");) {

            byte[] arr = new byte[3];
            int temp;
            while ((temp = fis.read(arr)) != -1) {
                System.out.println(new String(arr, 0, temp));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
