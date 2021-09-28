package com.future.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * @author Peng
 * @date 2021/9/2 15:12
 */
@SpringCloudApplication
@RefreshScope
@EnableTransactionManagement(proxyTargetClass = true)
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }
}
