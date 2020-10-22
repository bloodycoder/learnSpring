package com.picard.demo04;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("add a word");
    }

    @Override
    public void delete() {
        System.out.println("delete a word");
    }
}
