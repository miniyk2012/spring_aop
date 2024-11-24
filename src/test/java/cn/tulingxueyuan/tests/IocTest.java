package cn.tulingxueyuan.tests;

import cn.tulingxueyuan.AppConfig;
import cn.tulingxueyuan.service.RoleService;
import cn.tulingxueyuan.service.impl.UserServiceImpl2;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class IocTest {
    AbstractApplicationContext ioc;

    @Rule
    public final ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void before() {
//        ioc = new ClassPathXmlApplicationContext("classpath:/spring_aop.xml");
        ioc = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void test01() {
        RoleService bean = ioc.getBean(RoleService.class);
        System.out.println(bean.getClass());  // java sdk代理
        bean.get(1);

        System.out.println("--------------");
        exceptionRule.expect(NullPointerException.class);
        bean.get(null);
    }

    @Test
    public void test02() {
        System.out.println("--------------");
        UserServiceImpl2 bean = ioc.getBean(UserServiceImpl2.class);
        System.out.println(bean.getClass());   // CGLIB代理
        bean.get(1);
    }


}
