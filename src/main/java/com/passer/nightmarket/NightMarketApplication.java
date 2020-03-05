package com.passer.nightmarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.passer", "generator"})
@MapperScan(basePackages = "generator")
public class NightMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(NightMarketApplication.class, args);
    }

}
