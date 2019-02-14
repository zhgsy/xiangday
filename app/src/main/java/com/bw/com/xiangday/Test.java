package com.bw.com.xiangday;

import com.bw.com.xiangday.entity.PersonEntity;

import java.lang.reflect.Constructor;

public class Test {

    public static void main(String[] args) {
        Class c1=PersonEntity.class;

        try {

            Constructor constructor = c1.getConstructor(null);
            PersonEntity personEntity1= (PersonEntity) constructor.newInstance(null);
            Constructor constructor1 = c1.getDeclaredConstructor(new Class[]{String.class, int.class});
            //强制访问，开通权限
            constructor1.setAccessible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
