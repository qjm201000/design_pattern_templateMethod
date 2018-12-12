package com.pattern;

/**
 * 页面2
 */
public class Page2 extends AbstractPage{
    @Override
    public void makeHeader() {
        System.out.println("页面2，写头");
    }

    @Override
    public void makeBody() {
        System.out.println("页面2，写身");
    }

    @Override
    public void makeFooter() {
        System.out.println("页面2，写脚");
    }
}
