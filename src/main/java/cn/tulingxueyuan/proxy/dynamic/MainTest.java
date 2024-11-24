package cn.tulingxueyuan.proxy.dynamic;

import cn.tulingxueyuan.proxy.statically.GamePlayer;
import cn.tulingxueyuan.proxy.statically.IGamePlayer;
import java.util.Arrays;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 *
 * 使用jdk动态代理完成增加日志功能:动态生成代理类
 */
public class MainTest {

    @Test
    public void test(){

        ICalculator proxy = (ICalculator) MainTest.createProxy(new Calculator());
        System.out.printf("112/4=%d", proxy.div(112,4));

        IGamePlayer proxy2 = (IGamePlayer) MainTest.createProxy(new GamePlayer("yangkai"));
        proxy2.play();
    }

    /**
     * 公共jdk动态代理对象生成
     * @return
     */
    public static Object createProxy(final Object needProxy){

        ClassLoader classLoader = needProxy.getClass().getClassLoader();
        Class<?>[] interfaces= needProxy.getClass().getInterfaces();

        // 代理类的执行方法
        // method 被代理对象的方法
        // args: 方法的参数
        InvocationHandler handler= (proxy, method, args) -> {
            Object result=null;
            try {
                System.out.printf("before %s\n", Arrays.toString(args));
                result = method.invoke(needProxy, args);
                System.out.println("after");
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            finally {
                System.out.printf("after end\n");
            }
            return result;
        };
        InvocationHandler handler2 = new MyInvocationHandler(needProxy);

        /* 动态创建代理类

        * ClassLoader loader 类加载器  ，通常指定的被代理类的接口的类加载器
        * Class<?>[] interfaces, 类型， 通常指定被代理类的接口的类型
           InvocationHandler h   委托执行的处理类 ：日志功能
        * */
        Object o =  Proxy.newProxyInstance(classLoader, interfaces, handler2);
        System.out.println(o.getClass());

        return o;
    }
}
