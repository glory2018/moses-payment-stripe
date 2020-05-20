package com.moses.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Moses
 * @date 2020/4/27
 */
public class JSONUtil {
    public static <T> T toBean(String jsonStr, Class<T> clazz) {
        return JSONObject.parseObject(jsonStr, clazz);
    }

    public static <T> String toJsonStr(T object) {
        return JSONObject.toJSONString(object);
    }
}
