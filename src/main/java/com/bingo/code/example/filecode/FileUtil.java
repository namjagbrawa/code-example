/*
package com.bingo.code.example.filecode;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

*/
/**
 * Created by ZhangGe on 2017/10/26.
 *//*

public class FileUtil {

    private String path;

    public FileUtil(String path) {
        this.path = path;
    }

    public void write(byte[] bytes) {

    }

    public byte[] read(String path) throws IOException {
    }

    public List<String> getPaths() {
        Iterator<Path> iterator = Paths.get(path).iterator();
        List<String> list = new ArrayList();
        while (iterator.hasNext()) {
            Path next = iterator.next();
            list.add(next.toAbsolutePath().toString());
        }
        return list;
    }
}
*/
