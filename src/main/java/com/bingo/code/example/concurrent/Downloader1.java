package com.bingo.code.example.concurrent;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by ZhangGe on 2017/9/19.
 */
public class Downloader1 extends  Thread {
    private InputStream in;
    private OutputStream out;
    private ArrayList<ProgressListener> listeners;

    public Downloader1(URL url, String outputFilename) throws IOException {
        in = url.openConnection().getInputStream();
        out = new FileOutputStream(outputFilename);
        listeners = new ArrayList<>();
    }

    public synchronized void addListener(ProgressListener listener) {
        listeners.add(listener);
    }

    public synchronized void removeListener(ProgressListener listener) {
        listeners.remove(listener);
    }

    // 不调用外星方法
    private synchronized void updateProgess(int n) {
        ArrayList<ProgressListener> listenersCopy;
        synchronized (this) {
            listenersCopy = (ArrayList<ProgressListener>) listeners.clone();
        }
        for (ProgressListener listener : listeners) {
            listener.onProgress(n);
        }
    }

    public void run() {
        int n = 0, total = 0;
        byte[] buffer = new byte[1024];

        try {
            while ((n = in.read(buffer)) != -1) {
                out.write(buffer, 0, n);
                total += n;
                updateProgess(total);
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ProgressListener {
    public void onProgress(int i) {
        System.out.println(i);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new ProgressListener();
    }
}
