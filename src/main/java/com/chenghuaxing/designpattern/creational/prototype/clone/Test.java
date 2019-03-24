package com.chenghuaxing.designpattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author cheng.huaxing
 * @date 2019-03-24
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        QitianDasheng qitianDasheng1 = new QitianDasheng("孙悟空",birthday);
        QitianDasheng qitianDasheng2 = (QitianDasheng) qitianDasheng1.clone();
        System.out.println(qitianDasheng1);
        System.out.println(qitianDasheng2);

        qitianDasheng1.getBirthday().setTime(666666666666L);

        System.out.println(qitianDasheng1);
        System.out.println(qitianDasheng2);
    }
}
