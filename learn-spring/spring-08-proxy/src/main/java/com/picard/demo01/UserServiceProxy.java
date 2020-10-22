package com.picard.demo01;

public class UserServiceProxy implements UserService{
    /*
     * 需求，想给UserServiceImpl加功能，但是不想改原来代码
     * 静态代理的例子，缺点在于代码量翻倍。
     *
     * */
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
    }

    @Override
    public void delete() {
        userService.delete();
    }

}
