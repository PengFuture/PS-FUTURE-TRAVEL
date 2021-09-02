package com.future.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author Peng
 * @date 2021/9/2 15:12
 */
@SpringCloudApplication
@RefreshScope
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}
