package com.bingo.code.example.chain;

public class FaceFilter implements Filter {
    public String doFilter(String str) {
        return str.replace(":)", "^V^");
    }

}  
  