package lktbz.inter.general;

// 抽象表达式
public interface IExpression {
    // 对表达式进行解释
    Object interpret(Context context);
}