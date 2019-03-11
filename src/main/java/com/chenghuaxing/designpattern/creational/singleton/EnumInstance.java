package com.chenghuaxing.designpattern.creational.singleton;

/**
 * 枚举单例
 * 枚举的构造函数是私有且有参的，同时无法进行反射创建，序列化也能保证单例
 * @author cheng.huaxing
 * @date 2019-03-11
 */
public enum EnumInstance {
    INSTANCE;

    private EnumInstance getInstance() {
        return INSTANCE;
    }
}
