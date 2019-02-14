package com.bw.com.xiangday.entity;

public class PersonEntity {
     private String name;
     public int age;



    public PersonEntity(){

        System.out.print("无参构造器");
     }
     private PersonEntity(String name,int age){

        System.out.print("私有构造器,name="+name);
     }
        public void fun(){
            System.out.print("age："+age+"name"+name);
            System.out.print("fun");
        }
        public  void fun3(){
        System.out.print("age:"+age+"name:"+name);
        System.out.print("fun");
        }
        private  void fun1(String name,int age,String s){
            System.out.print("私有fun1方法:name===="+name);
        }



}
