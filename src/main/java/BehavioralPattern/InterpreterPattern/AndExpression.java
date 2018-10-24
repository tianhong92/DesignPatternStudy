package BehavioralPattern.InterpreterPattern;

import java.util.ArrayList;

// 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
// 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。
// 这种模式被用在 SQL 解析、符号处理引擎等。
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}