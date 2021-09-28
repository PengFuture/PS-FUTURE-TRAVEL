package com.future.travel.utils;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Peng
 * @date 2021/9/13 23:17
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
@Data
public class GeneralData {

	/**
	 * 服务结果
	 */
	private boolean result;

	/**
	 * 服务响应码
	 * 403 - 会话超时
	 * 慎用
	 */
	private int code;

	/**
	 * 服务响应信息
	 */
	private String msg;

	/**
	 * 存储List集
	 */
	private List list;

	/**
	 * 存储Map集
	 */
	private Map map;

	public static GeneralData success(int code, String msg) {
		return new GeneralData(true, code, msg);
	}

	public static GeneralData success(String msg) {
		return new GeneralData(true, msg);
	}

	public static GeneralData success() {
		return new GeneralData(true, "成功");
	}

	public static GeneralData fail(int code, String msg) {
		return new GeneralData(false, code, msg);
	}

	public static GeneralData fail(String msg) {
		return fail(503, msg);
	}

	public static GeneralData fail() {
		return fail(503, "失败");
	}

	public GeneralData(boolean result, int code, String msg) {
		this.result = result;
		this.code = code;
		this.msg = msg;
	}

	public GeneralData(boolean result, String msg) {
		this.result = result;
		this.msg = msg;
	}

	public GeneralData(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public void put(Object key, Object value) {
		if (map == null) {
			map = new HashMap();
		}
		this.map.put(key, value);
	}

	public GeneralData fluentPut(Object key, Object value) {
		if (map == null) {
			map = new HashMap();
		}
		this.map.put(key, value);
		return this;
	}

	public void add(Object value) {
		if (list == null) {
			list = new ArrayList();
		}
		this.list.add(value);
	}

	public GeneralData fluentAdd(Object value) {
		if (list == null) {
			list = new ArrayList();
		}
		this.list.add(value);
		return this;
	}

}
