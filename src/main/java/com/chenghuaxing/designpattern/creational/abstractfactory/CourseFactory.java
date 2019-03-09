package com.chenghuaxing.designpattern.creational.abstractfactory;

/**
 * 抽象工厂-提供一个创建一系列相关或依赖对象的接口，将一个系列的产品族统一到一起创建
 * 增加产品族产品时需要修改抽象工厂接口，不符合开闭原则
 * 抽象工厂关注产品族
 * @author cheng.huaxing
 * @date 2019-03-09
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
