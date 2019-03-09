package com.chenghuaxing.designpattern.creational.factorymethod;

/**
 * @author cheng.huaxing
 * @date 2019-03-09
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
