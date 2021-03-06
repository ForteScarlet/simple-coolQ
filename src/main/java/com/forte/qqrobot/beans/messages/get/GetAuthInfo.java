/*
 * Copyright (c) 2020. ForteScarlet All rights reserved.
 * Project  simple-robot-core
 * File     GetAuthInfo.java
 *
 * You can contact the author through the following channels:
 * github https://github.com/ForteScarlet
 * gitee  https://gitee.com/ForteScarlet
 * email  ForteScarlet@163.com
 * QQ     1149159218
 *
 */

package com.forte.qqrobot.beans.messages.get;

import com.alibaba.fastjson.annotation.JSONField;
import com.forte.qqrobot.beans.messages.result.AuthInfo;

/**
 * @author ForteScarlet <[163邮箱地址]ForteScarlet@163.com>
 * @since JDK1.8
 **/
public interface GetAuthInfo extends InfoGet<AuthInfo> {


    /**
     * 获取通过此类型请求而获取到的参数的返回值的类型
     */
    @Override
    @JSONField(serialize = false)
    default Class<? extends AuthInfo> resultType(){
        return AuthInfo.class;
    }

}
