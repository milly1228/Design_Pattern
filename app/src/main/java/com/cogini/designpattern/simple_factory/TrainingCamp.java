package com.cogini.designpattern.simple_factory;

public class TrainingCamp {
    public static Adventurer trainAdventurer(String type){
        switch (type){
            case "archer":{
                System.out.print("訓練一個弓箭手");
                return new Archer();
            }
            case "warrior":{
                System.out.print("訓練一個鬥士");
                return new Warrior();
            }
            default: return null;
        }
    }
}
