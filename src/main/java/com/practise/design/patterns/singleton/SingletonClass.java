package com.practise.design.patterns.singleton;

import javax.sound.midi.Soundbank;

public class SingletonClass {
    public static SingletonClass singletonClass = null;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public static void main(String[] args) {
        SingletonClass a = SingletonClass.getInstance();
        SingletonClass b = SingletonClass.getInstance();
        SingletonClass c = SingletonClass.getInstance();

        System.out.println("Hashcode Of A: " + a.hashCode());
        System.out.println("Hashcode Of B: " + b.hashCode());
        System.out.println("Hashcode Of C: " + c.hashCode());
        if (a == b && b == c) {
            System.out.println("All three object points to same memory location");
        }
    }
}
