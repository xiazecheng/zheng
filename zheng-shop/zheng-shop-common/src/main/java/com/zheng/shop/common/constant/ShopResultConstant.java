package com.zheng.shop.common.constant;

/**
 * Created by madao on 2017/7/2.
 */
public enum  ShopResultConstant {

    FAILED(0, "failed"),
    SUCCESS(1, "success"),
    DELETE_HAS_CHILDREN(10001, "以下类目有子类目，不能删除");

    private int code;
    private String message;

    ShopResultConstant(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
