package com.chenghuaxing.designpattern.creational.singleton.lazy;

/**
 * 懒汉式
 * 优点：在使用时才创建，避免内存浪费
 * 缺点：需要额外的手段保证线程安全
 * @author cheng.huaxing
 * @date 2019-03-11
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 为保证线程安全添加synchronized关键字，但是会有性能问题
     * @return
     */
    private synchronized static LazySingleton getInstance() {
        if (lazySingleton != null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
