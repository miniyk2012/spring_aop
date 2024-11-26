package cn.tulingxueyuan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "cn.tulingxueyuan")
@EnableAspectJAutoProxy  // 启用AOP @Aspect支持
public class AppConfig {

}
