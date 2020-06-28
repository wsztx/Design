package com.universe.design.behavioral.state;

/**
 * @author
 * @version v1.1.0
 * @Description 状态模式测试类
 * @since jdk1.8
 */
public class StateTest {
    public static void main(String[] args) {
        Context context=new Context();    //创建环境
        context.handle();    //处理请求
        context.handle();
        context.handle();
        context.handle();
    }
}
