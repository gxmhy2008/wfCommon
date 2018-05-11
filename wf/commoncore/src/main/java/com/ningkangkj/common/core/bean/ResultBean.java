package com.ningkangkj.common.core.bean;

/**
 * @Description 返回信息
 * @Author luckypt
 * @Date 2018/05/11
 */
public class ResultBean {
    private String result;  // 0正确 -1:此用户不存在,1:用户存在,-2:数据插入失败
    private String msg;     // 错误信息
    private String data;    // 返回客户端JSON数据

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
