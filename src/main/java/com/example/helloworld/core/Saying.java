package com.example.helloworld.core;

/**
 * Created with IntelliJ IDEA.
 * User: pkondappa
 * Date: 6/9/13
 * Time: 11:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class Saying {
    private final long id;
    private final String content;

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
