package com.bingo.code.example.design.bridge.sendmessage;

/**
 * 抽象的消息对象
 */
public abstract class AbstractMessage {
    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor impl;

    /**
     * 构造方法，传入实现部分的对象
     *
     * @param impl 实现部分的对象
     */
    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    /** method 1
     * 构造方法，传入选择实现部分的类型
     *
     * @param type 传入选择实现部分的类型
     */
    public AbstractMessage(int type) {
        if (type == 1) {
            this.impl = new MessageSMS();
        } else if (type == 2) {
            this.impl = new MessageEmail();
        } else if (type == 3) {
            this.impl = new MessageMobile();
        }
    }

    /** method 2 default
     * 发送消息，转调实现部分的方法
     *
     * @param message 要发送的消息内容
     * @param toUser  把消息发送的目的人员
     */
    /*public void sendMessage(String message, String toUser) {
        this.getImpl(message).send(message, toUser);
    }*/

    /** method 2 default
     * 根据消息的长度来选择合适的实现
     *
     * @param message 要发送的消息
     * @return 合适的实现对象
     */
    protected MessageImplementor getImpl(String message) {
        MessageImplementor impl = null;
        if (message == null) {
        //如果没有消息，默认使用站内短消息
            impl = new MessageSMS();
        } else if (message.length() < 100) {
        //如果消息长度在100以内，使用手机短消息
            impl = new MessageMobile();
        } else if (message.length() < 1000) {
        //如果消息长度在100-1000以内，使用站内短消息
            impl = new MessageSMS();
        } else {
        //如果消息长度在1000以上
            impl = new MessageEmail();
        }
        return impl;
    }

    /**
     * 发送消息，转调实现部分的方法
     *
     * @param message 要发送的消息内容
     * @param toUser  消息发送的目的人员
     */
    public void sendMessage(String message, String toUser) {
        this.impl.send(message, toUser);
    }
}