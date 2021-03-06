/*
 * Copyright (c) 2020. ForteScarlet All rights reserved.
 * Project  simple-robot-core
 * File     PrivateMsg.java
 *
 * You can contact the author through the following channels:
 * github https://github.com/ForteScarlet
 * gitee  https://gitee.com/ForteScarlet
 * email  ForteScarlet@163.com
 * QQ     1149159218
 *
 */

package com.forte.qqrobot.beans.messages.msgget;

import com.forte.qqrobot.beans.messages.FlagAble;
import com.forte.qqrobot.beans.messages.NickOrRemark;
import com.forte.qqrobot.beans.messages.QQCodeAble;
import com.forte.qqrobot.beans.messages.types.PrivateMsgType;

/**
 * 私信消息
 **/
public interface PrivateMsg extends MsgGet, QQCodeAble, FlagAble, NickOrRemark {

    /** 获取私聊消息类型 */
    PrivateMsgType getType();

    /** 获取发送人的QQ号 */
    String getQQ();

    @Override
    default String getQQCode(){
        return getQQ();
    }

    /** flag默认使用id */
    @Override
    default String getFlag(){
        return getId();
    }

}
