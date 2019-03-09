package com.chenghuaxing.designpattern.creational.factorymethod;


/**
 * 工厂方法-创建一个抽象的工厂类，具体的工厂类继承该工厂类
 * 由具体的工厂类来创建对应的对象
 * 符合开闭原则
 * 但是类的个数容易过多，增加系统的复杂度
 * 工厂方法关注的是产品等级
 * @author cheng.huaxing
 * @date 2019-03-09
 */
public abstract class VideoFactory {
    public abstract Video getVideo();
}
