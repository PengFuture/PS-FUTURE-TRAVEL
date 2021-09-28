package com.future.travel.controller;

import com.future.travel.domain.SystemUser;
import com.future.travel.service.SystemUserService;
import com.future.travel.utils.TableData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Peng
 * @date 2021/9/2 15:28
 */
@RestController
@RequestMapping("/system")
public class SystemUserController {

    private static final Logger logger = LoggerFactory.getLogger(SystemUserController.class);


    @Resource
    private SystemUserService systemUserService;

    @RequestMapping("/list.do")
    public TableData<SystemUser> list() {
        return systemUserService.tableData();
    }


}
