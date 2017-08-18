package com.bingo.code.example.chain;

public class HTMLFilter implements Filter {
    public String doFilter(String str) {
        String r = str.replace('<', '[')
                .replace('>', ']');
        return r;
    }
}  