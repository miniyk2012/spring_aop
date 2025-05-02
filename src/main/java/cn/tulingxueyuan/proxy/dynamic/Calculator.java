package cn.tulingxueyuan.proxy.dynamic;


/**
 *  计算器类
 */
public class Calculator implements ICalculator {
    // 加
    @Override
    public Integer add(Integer i, Integer j) {
        Integer result = i+j;
        return result;
    }
    // 减
    @Override
    public Integer sub(Integer i, Integer j){
        Integer result = i-j;
        return result;
    }

    // 乘
    @Override
    public Integer mul(Integer i, Integer j){
        Integer result = i*j;
        return result;
    }

    // 除法
    @Override
    public Integer div(Integer i, Integer j) {
        Integer result = i/j;
        return result;
    }
}
