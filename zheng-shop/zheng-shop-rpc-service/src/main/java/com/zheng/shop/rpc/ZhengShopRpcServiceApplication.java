package com.zheng.shop.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by madao on 2017/6/19.
 */
public class ZhengShopRpcServiceApplication {

    private static Logger _log = LoggerFactory.getLogger(ZhengShopRpcServiceApplication.class);

    public static void main(String[] args) {
        _log.info(">>>>> zheng-shop-rpc-service 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:spring/*.xml");
        _log.info(">>>>> zheng-shop-rpc-service 启动完成 <<<<<");
    }

}
