package org.example.zakruzhny.generic;

public class Post<K extends Number, V> {

    private K messageId;

    private V message;

    public K getMessageId() {
        return messageId;
    }

    public void setMessageId(K messageId) {
        this.messageId = messageId;
    }

    public V getMessage() {
        return message;
    }

    public void setMessage(V message) {
        this.message = message;
    }

    public <T1 extends Number, T2> T1 method1(T2 i1, Post<? super Integer, ?> post) {
        return null;
    }
}
