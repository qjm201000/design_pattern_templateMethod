package com.pattern;

/**
 * 抽象-模块方法模式核心
 */
public abstract class AbstractPage {
    public abstract void makeHeader();//组装页面头部
    public abstract void makeBody();//组装页面body
    public abstract void makeFooter();//组装页脚

    public void make(){
        makeHeader();//组装头
        makeBody();//组装身
        makeFooter();//组装脚
    }
}
