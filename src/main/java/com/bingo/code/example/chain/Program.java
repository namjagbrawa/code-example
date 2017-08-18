package com.bingo.code.example.chain;

public class Program {
    public static void main(String[] args) {
        String msg = "大家好:)，<script>，敏感，被就业，网络授课没感觉，因为看不见大家伙儿";
        MsgProcessor mp = new MsgProcessor();
        mp.Msg = msg;

        FilterChain fc = new FilterChain().addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());

        FilterChain fc2 = new FilterChain().addFilter(new FaceFilter());

        fc.addFilter(fc2);//经典之处，将1个链添加到另一个链  

        mp.Fc = fc;
        String result = mp.process();
        System.out.println(result);
    }
}  