package com.pattern;

public class Main {
    public static void main(String[] args) {
        AbstractPage page1 = new Page1();
        page1.make();//页面1拼装

        System.out.println("---------------------------");

        AbstractPage page2 = new Page2();
        page2.make();//页面2拼装
    }
}
