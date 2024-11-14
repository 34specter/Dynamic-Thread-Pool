package cn.shidu;

/*
 *@title Application
 *@description
 *@author 孙悟饭
 *@version 1.0
 *@create 2024/11/14 10:40
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
