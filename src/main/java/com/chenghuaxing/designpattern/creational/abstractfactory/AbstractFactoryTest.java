package com.chenghuaxing.designpattern.creational.abstractfactory;

/**
 * @author cheng.huaxing
 * @date 2019-03-09
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.getVideo().play();;
        courseFactory.getArticle().read();

        courseFactory = new PythonCourseFactory();
        courseFactory.getArticle().read();
        courseFactory.getVideo().play();
    }
}
