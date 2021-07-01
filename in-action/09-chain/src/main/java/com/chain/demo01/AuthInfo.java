package com.chain.demo01;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/01
 */
public class AuthInfo {
    private String code;
    private String info = "";

    public AuthInfo(String code, String ...infos) {
        this.code = code;
        //多个审批意见
        for (String str:infos){
            this.info = this.info.concat(str);
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
