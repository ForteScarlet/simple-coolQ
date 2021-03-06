/*
 * Copyright (c) 2020. ForteScarlet All rights reserved.
 * Project  simple-robot-core
 * File     SendContext.java
 *
 * You can contact the author through the following channels:
 * github https://github.com/ForteScarlet
 * gitee  https://gitee.com/ForteScarlet
 * email  ForteScarlet@163.com
 * QQ     1149159218
 *
 */

package com.forte.qqrobot.sender.intercept;

import com.forte.qqrobot.sender.senderlist.SenderSendList;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * 提供一个sender对象
 *
 * @author ForteScarlet <[email]ForteScarlet@163.com>
 * @since JDK1.8
 **/
public class SendContext extends SenderContext<SenderSendList> {
    public final SenderSendList SENDER;

    /** send所使用的全局Map */
    private static final Map<String, Object> GLOBAL_CONTEXT_MAP = new ConcurrentHashMap<>(4);

    public SendContext(SenderSendList value, Method method, Object... params) {
        super(value, GLOBAL_CONTEXT_MAP, method, params);
        SENDER = value;
    }
}
