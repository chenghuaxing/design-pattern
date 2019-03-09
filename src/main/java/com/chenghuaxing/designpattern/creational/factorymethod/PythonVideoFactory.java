package com.chenghuaxing.designpattern.creational.factorymethod;

/**
 * @author cheng.huaxing
 * @date 2019-03-09
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
