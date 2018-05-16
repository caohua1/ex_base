package com.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@EnableTransactionManagement(proxyTargetClass = true)
public class WebApplication extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(com.ex.WebApplication.class);

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(com.ex.WebApplication.class);
    }

    public static void main(String[] args) {
        logger.info("服务开始运行");
        SpringApplication.run(com.ex.WebApplication.class, args);
    }
}
