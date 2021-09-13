package com.future.travel.utils;

import lombok.Data;

import java.util.List;

/**
 * @author Peng
 * @date 2021/9/13 23:17
 */
@Data
public class TableData<T> {

    /**
     * 响应码，默认0
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String msg;

    /**
     * 数据统计
     */
    private long count;

    /**
     * 数据集合
     */
    private List<T> data;

    public TableData() {
        super();
        this.code = 0;
        this.msg = "";
    }

    public TableData(Integer code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public TableData(List<T> data, long count) {
        super();
        this.code = 0;
        this.msg = "";
        this.data = data;
        this.count = count;
    }
}
