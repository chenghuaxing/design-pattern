package com.chenghuaxing.designpattern.creational.singleton.lazy;

/**
 * 懒汉式-静态内部类，不用额外加锁，性能高，同时线程安全
 * @author cheng.huaxing
 * @date 2019-03-11
 */
public class StaticInnerClassSingleton {
    /**
     * 静态内部类由jvm保证在初始化时只有一个线程初始化
     */
    private static class StaticInnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {

    }

    /**
     * 调用该方法时才会初始化静态内部类
     * @return
     */
    private static StaticInnerClassSingleton getInstance() {
        return StaticInnerClass.staticInnerClassSingleton;
    }
}
