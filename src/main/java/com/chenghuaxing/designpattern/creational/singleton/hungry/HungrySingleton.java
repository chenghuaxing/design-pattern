package com.chenghuaxing.designpattern.creational.singleton.hungry;

import java.io.Serializable;

/**
 * 饿汉式
 * 优点：在类初始化就创建好实例，避免类线程安全问题
 * 缺点：可能造成内存资源的浪费
 * 实现序列化接口和克隆接口，序列化或克隆都能破坏单例模式
 * @author cheng.huaxing
 * @date 2019-03-11
 */
public class HungrySingleton implements Serializable, Cloneable {

    /**
     * 私有构造函数，防止外部实例化 添加判断防止放射破坏单例
     */
    private HungrySingleton() {
        if (HUNGRY_SINGLETON != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static final HungrySingleton HUNGRY_SINGLETON;

    /**
     * 静态代码块在类初始化时就执行
     */
    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    /**
     * 增加readResolve方法，在序列化时会判断是否存在该方法，存在的话会调用该方法，可以防止序列化破坏单例
     * @return 返回单例对象
     */
    private Object readResolve() {
        return HUNGRY_SINGLETON;
    }

    /**
     * 重新克隆，防止克隆破坏单例
     * @return 返回单例对象
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return HUNGRY_SINGLETON;
    }
}
