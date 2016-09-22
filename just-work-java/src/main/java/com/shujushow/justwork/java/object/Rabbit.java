package com.shujushow.justwork.java.object;

/**
 * Created by xinshu on 2016/9/22.
 */
public class Rabbit extends Animal {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
