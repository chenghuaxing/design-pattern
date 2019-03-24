package com.chenghuaxing.designpattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author cheng.huaxing
 * @date 2019-03-24
 */
public class QitianDasheng extends Monkey implements Cloneable {
    public QitianDasheng(String name, Date birthday) {
        super(name, birthday);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        QitianDasheng qitianDasheng = (QitianDasheng) super.clone();
        // 深克隆，引用类型同样实现克隆接口即可
        qitianDasheng.birthday = (Date) qitianDasheng.birthday.clone();
        return qitianDasheng;
    }
}
