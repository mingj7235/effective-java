package me.whiteship.chapter01.item01;

public class EnglishHelloService implements HelloService {

    @Override
    public String hello() {
        return "Hello";
    }

    @Override
    public String bye() {
        return HelloService.super.bye();
    }

}
