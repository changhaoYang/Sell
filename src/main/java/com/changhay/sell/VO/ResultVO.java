package com.changhay.sell.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * HTTP请求返回的最外层对象
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 2766210188570386973L;

    // 错误码
    private Integer code;

    // 提示信息
    private String msg;

    // 具体内容
    private T data;
}
