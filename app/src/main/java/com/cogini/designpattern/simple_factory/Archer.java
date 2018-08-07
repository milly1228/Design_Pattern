package com.cogini.designpattern.simple_factory;

public class Archer implements Adventurer {

    @Override
    public String getType() {
        System.out.print("我是弓箭手");
        return this.getClass().getSimpleName();
    }
}
