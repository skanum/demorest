package com.Subbarest.demorest;

public class Greeting {
    private Long id;
    private String content;

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}
