package com.chenghuaxing.designpattern.creational.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author cheng.huaxing
 * @date 2019-03-11
 */
public class ContainerSingleton {

    private ContainerSingleton() {}

    /**
     * 保存单例的容器
     */
    private static Map<String,Object> singletonMap = new ConcurrentHashMap<>();

    private static Object getInstance(String key) {
        return singletonMap.get(key);
    }

    private static void putInstance(String key, Object instance) {
        if (!singletonMap.containsKey(key)) {
            singletonMap.put(key, instance);
        }
    }
}
