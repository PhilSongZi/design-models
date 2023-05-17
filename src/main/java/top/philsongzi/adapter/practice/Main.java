package top.philsongzi.adapter.practice;

import java.io.*;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/17 19:31
 * @description here is a description of this file.
 */
public class Main {

    public static void main(String[] args) {
        FileIO f = new FileProperitier();

        try {
            f.readFromFiles("file.txt");  // 路径懒得改了，意会一下
            f.setValue("year", "2023");
            f.setValue("month", "05");
            f.setValue("day", "17");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
