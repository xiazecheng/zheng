package com.zheng.shop.common.constant;

import com.zheng.common.base.BaseConstants;

/**
 * Created by madao on 2017/7/2.
 */
public class ShopConstant extends BaseConstants{
    public static final String PATH_SEPARATOR = ",";// 树路径分隔符

    public static final String ID_SEPARATOR = "-";// 树路径分隔符

    public static final String UN_HANDLE_EXCEPTION = "数据异常";

    public static final String STORE_ROLE_NAME = "storeManager";

    // 重量单位（克、千克、吨）
    public enum WeightUnit {
        g, kg, t
    }

    // 配送类型：先付款后发货、货到付款
    public enum DeliveryMethod {
        deliveryAgainstPayment, cashOnDelivery
    };

}
