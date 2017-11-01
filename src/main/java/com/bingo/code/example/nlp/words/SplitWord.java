package com.bingo.code.example.nlp.words;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by ZhangGe on 2017/9/18.
 */
public class SplitWord {

    public final static String path = "C:\\Users\\ZhangGe\\Desktop\\b.txt";

     /* http://opennlp.apache.org/documentation/1.5.3/manual/opennlp.html   官方教程Apache OpenNLP Developer Documentation
     * openNLP 中的各种模型可以在   http://opennlp.sourceforge.net/models-1.5/   下载
     * http://www.programcreek.com/2012/05/opennlp-tutorial/    this is good tutorial about openNLP tools
     *
     * */

    public static void main(String[] args) throws IOException {
        List<String> result = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
        for (String s : result) {
            String[] split = s.split("\\s+");
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i] + " ");
            }
        }
        System.out.println();
    }
}