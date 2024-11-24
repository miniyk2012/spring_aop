package cn.tulingxueyuan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "cn.tulingxueyuan")
@EnableAspectJAutoProxy
public class AppConfig {

}
