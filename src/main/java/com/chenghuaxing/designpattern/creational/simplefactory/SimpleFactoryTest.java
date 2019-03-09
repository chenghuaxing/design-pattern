package com.chenghuaxing.designpattern.creational.simplefactory;

/**
 * @author cheng.huaxing
 * @date 2019-03-09
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Video video = VideoFactory.getVideo(JavaVideo.class);
        video.play();

        video = VideoFactory.getVideo(PythonVideo.class);
        video.play();
    }
}
