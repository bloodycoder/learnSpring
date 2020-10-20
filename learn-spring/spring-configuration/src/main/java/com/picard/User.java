package com.picard;

import lombok.Data;
/*
* 这个例子用于说明Spring中配置的作用
*
* */
@Data
public class User {
    String name;
    public User(String s){
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("My name is "+name);
    }
}
