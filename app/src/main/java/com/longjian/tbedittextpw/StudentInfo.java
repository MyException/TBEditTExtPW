package com.longjian.tbedittextpw;

import io.realm.RealmObject;

/**
 * Created by longjian on 2015/12/28.
 */
public class StudentInfo extends RealmObject {


    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
