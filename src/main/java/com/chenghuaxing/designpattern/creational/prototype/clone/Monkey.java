package com.chenghuaxing.designpattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author cheng.huaxing
 * @date 2019-03-24
 */
public class Monkey {
    protected String name;
    protected Date birthday;

    public Monkey(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
