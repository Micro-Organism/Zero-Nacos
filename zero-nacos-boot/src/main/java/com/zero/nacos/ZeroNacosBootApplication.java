package com.zero.nacos;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "test", autoRefreshed = true)
public class ZeroNacosBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroNacosBootApplication.class, args);
    }

}
