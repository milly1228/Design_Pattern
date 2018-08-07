package com.cogini.designpattern.simple_factory;

public class Warrior implements Adventurer {
    @Override
    public String getType() {
        System.out.print("我是鬥士");
        return this.getClass().getSimpleName();
    }
}
