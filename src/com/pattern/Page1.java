package com.pattern;

/**
 * 页面1
 */
public class Page1 extends AbstractPage{
    @Override
    public void makeHeader() {
        System.out.println("页面1，写头");
    }

    @Override
    public void makeBody() {
        System.out.println("页面1，写身");
    }

    @Override
    public void makeFooter() {
        System.out.println("页面1，写脚");
    }
}
