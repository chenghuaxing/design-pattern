package com.chenghuaxing.designpattern.creational.abstractfactory;

/**
 * @author cheng.huaxing
 * @date 2019-03-09
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
