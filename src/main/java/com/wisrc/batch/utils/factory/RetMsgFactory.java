package com.wisrc.batch.utils.factory;

import com.wisrc.batch.utils.RetMsg;

/**
 * Created by hzwy23 on 2017/6/27.
 */
public final class RetMsgFactory {
    public static RetMsg getRetMsg(Integer code, String message, Object details) {
        return new RetMsg(code, message, details);
    }
}
