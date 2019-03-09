package com.chenghuaxing.designpattern.creational.abstractfactory;

/**
 * @author cheng.huaxing
 * @date 2019-03-09
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
