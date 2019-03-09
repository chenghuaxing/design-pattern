package com.chenghuaxing.designpattern.creational.factorymethod;

/**
 * @author cheng.huaxing
 * @date 2019-03-09
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        videoFactory.getVideo().play();

        videoFactory = new PythonVideoFactory();
        videoFactory.getVideo().play();
    }
}
