package com.future.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author Peng
 * @date 2021/9/2 14:48
 */
@SpringCloudApplication
@RefreshScope
public class GateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }
}
