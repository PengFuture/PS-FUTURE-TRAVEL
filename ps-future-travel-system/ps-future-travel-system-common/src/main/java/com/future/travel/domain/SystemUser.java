
package com.future.travel.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.future.travel.api.CommonFieldMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


/**
 * @author Peng
 * @date 2021/8/17 9:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemUser implements CommonFieldMethod {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private String id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 盐值
     */
    private String salt;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 创建时间
     */
    private LocalDateTime createDateTime;
    /**
     * 修改时间
     */
    private LocalDateTime lastModifyTime;


}
