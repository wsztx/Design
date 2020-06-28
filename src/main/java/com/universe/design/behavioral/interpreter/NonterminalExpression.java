package com.universe.design.behavioral.interpreter;

/**
 * @author
 * @version v1.1.0
 * @Description 非终结符表达式类
 * @since jdk1.8
 */
public class NonterminalExpression implements AbstractExpression {
    private AbstractExpression exp1;
    private AbstractExpression exp2;
    public Object interpret(String info) {
        //非对终结符表达式的处理
        return null;
    }
}
