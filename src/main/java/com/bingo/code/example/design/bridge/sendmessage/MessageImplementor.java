package com.bingo.code.example.design.bridge.sendmessage;

/**
 * 实现发送消息的统一接口
 */
public interface MessageImplementor {
    /**
     * http://chjavach.javaeye.com 1.17 研磨设计模式之桥接模式-2
     * 第 104 / 127 页
     * 发送消息
     *
     * @param message 要发送的消息内容
     * @param toUser  消息发送的目的人员
     */
    public void send(String message, String toUser);
}