package com.future.travel.service;

import com.future.travel.domain.SystemUser;
import com.future.travel.utils.TableData;

/**
 * @author Peng
 * @date 2021/9/28 11:34
 */
public interface SystemUserService {

    /**
     * 获取用户
     *
     * @return 用户数据
     */
    TableData<SystemUser> tableData();
}
