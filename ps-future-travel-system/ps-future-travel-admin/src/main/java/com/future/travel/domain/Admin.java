package com.future.travel.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Peng
 * @date 2021/8/17 9:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    private int id;

    private String username;

    private String password;

    private String message;

}
