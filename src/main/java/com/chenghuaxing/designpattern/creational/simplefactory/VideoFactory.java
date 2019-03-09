package com.chenghuaxing.designpattern.creational.simplefactory;

/**
 * 简单工程-接收传入的一个参数，根据不同的参数创建不同的对象，而无需知道具体的创建细节
 * 增加新的产品时需要修改工厂类的逻辑，不符合开闭原则
 * 使用反射来创建对象则不需要修改工厂类逻辑
 * @author cheng.huaxing
 * @date 2019-03-09
 */
public class VideoFactory {
    public static Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return video;
    }
}
