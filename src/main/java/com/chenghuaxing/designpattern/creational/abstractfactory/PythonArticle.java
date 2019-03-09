package com.chenghuaxing.designpattern.creational.abstractfactory;

/**
 * @author cheng.huaxing
 * @date 2019-03-09
 */
public class PythonArticle extends Article {
    @Override
    public void read() {
        System.out.println("查看Python课程手记");
    }
}
