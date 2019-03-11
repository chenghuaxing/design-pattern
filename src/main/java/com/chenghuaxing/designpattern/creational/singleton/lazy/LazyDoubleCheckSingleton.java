package com.chenghuaxing.designpattern.creational.singleton.lazy;

/**
 * 懒汉式-双重检验锁，相对于直接加synchronized能提升一定的性能
 * @author cheng.huaxing
 * @date 2019-03-11
 */
public class LazyDoubleCheckSingleton {
    /**
     * volatile关键字防止指令重排序
     */
    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
        if (lazyDoubleCheckSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 可能会发生指令重排序
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置对象指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
