package top.philsongzi.adapter.practice;

import java.io.*;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/17 19:30
 * @description FileIO接口.
 */
public interface FileIO {

    public void readFromFiles(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key, String value);
    public String getValue(String key);
}
