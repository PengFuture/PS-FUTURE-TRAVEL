package com.future.travel.controller;

import com.future.travel.domain.Admin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Peng
 * @date 2021/9/2 15:28
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    final static Map<Integer, Admin> ADMIN = new HashMap(16);
    static {
        ADMIN.put(1, new Admin(1, "张三", "123456", "123"));
        ADMIN.put(2, new Admin(2, "李四", "qwerty", "qwe"));
        ADMIN.put(3, new Admin(3, "王五", "!@#$%^", "!@#"));
    }


    @RequestMapping("/{id}")
    public Admin getBalance(@PathVariable("id")Integer id) {
        logger.info("request: /login/admin?id=" + id );

        if(id != null && ADMIN.containsKey(id)) {
            return ADMIN.get(id);
        }
        return new Admin(0, "0", "0", "");
    }


}
