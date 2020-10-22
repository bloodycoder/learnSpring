package com.picard.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//等价于<bean id="user" class="com.picard.pojo.User"></bean>
@Component
@Scope("singleton")
public class User {
    @Value("Picard")
    public String name;
    //@Value("Picard") set方法也能放注解
    public void setName(String name) {
        this.name = name;
    }
}
