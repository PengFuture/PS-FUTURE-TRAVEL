package com.future.travel.api;

import java.time.LocalDateTime;

/**
 * @author Peng
 * @date 2021/9/28 11:37
 */
public interface CommonFieldMethod {

    /**
     * 获取创建时间
     *
     * @return 创建时间
     */
    default LocalDateTime getCreateDateTime() {
        return null;
    }

    /**
     * 设置创建时间
     *
     * @param createDateTime 时间
     */
    default void setCreateDateTime(LocalDateTime createDateTime) {
    }

    /**
     * 获取更新时间
     *
     * @return 更新时间
     */
    default LocalDateTime getUpdateDateTime() {
        return null;
    }

    /**
     * 设置更新时间
     *
     * @param updateDateTime 更新时间
     */
    default void setUpdateDateTime(LocalDateTime updateDateTime) {
    }

}
