package com.wenyu7980.area;

import com.wenyu7980.aggregation.EnableWYAggregation;
import com.wenyu7980.authentication.common.feign.EnableWYAuthentication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 * @author wenyu
 */
@SpringBootApplication
@EnableWYAuthentication
@EnableWYAggregation
@EnableFeignClients(basePackages = "com.wenyu7980")
public class FileApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileApplication.class, args);
    }
}
