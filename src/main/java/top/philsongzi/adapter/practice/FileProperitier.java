package top.philsongzi.adapter.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/17 19:38
 * @description here is a description of this file.
 */
public class FileProperitier extends Properties implements FileIO {
    @Override
    public void readFromFiles(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "Written by FileProperties.");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, "");
    }
}
