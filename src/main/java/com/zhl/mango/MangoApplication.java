package com.zhl.mango;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhl
 * @date 2024/09/06 19:32
 **/

@SpringBootApplication(scanBasePackages = {"com.zhl.mango"})
public class MangoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MangoApplication.class);
    }
}
