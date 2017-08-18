package com.bingo.code.example.chain;

public class MsgProcessor {
    public FilterChain Fc;

    public String Msg;

    public FilterChain getFc() {
        return Fc;
    }

    public void setFc(FilterChain fc) {
        Fc = fc;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String process() {
        return Fc.doFilter(this.Msg);
    }
}  