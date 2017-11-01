package com.bingo.code.example.oom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangGe on 2017/9/22.
 */
public class DirectMemoryOutOfMemory {
    public static void main(String[] args) throws Exception{
        List<ByteBuffer> buffers = new ArrayList<>();
        while(true){
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffers.add(buffer);
        }
    }
}
