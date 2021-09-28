package com.future.travel.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.future.travel.domain.SystemUser;
import com.future.travel.mapper.SystemUserMapper;
import com.future.travel.service.SystemUserService;
import com.future.travel.utils.TableData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Peng
 * @date 2021/9/28 14:21
 */
@Service
public class SystemUserServiceImpl implements SystemUserService {

    private static final Logger logger = LoggerFactory.getLogger(SystemUserServiceImpl.class);

    @Resource
    private SystemUserMapper systemUserMapper;

    @Override
    public TableData<SystemUser> tableData() {
        LambdaQueryWrapper<SystemUser> userWrapper = new LambdaQueryWrapper<>();
        List<SystemUser> systemUsers = systemUserMapper.selectList(userWrapper);
        logger.info("用户参数: {}", systemUsers);
        return new TableData<>(systemUsers, systemUsers.size());
    }
}
