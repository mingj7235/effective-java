package me.whiteship.chapter01.item01;

public class KoreanHelloService implements HelloService{

    @Override
    public String hello() {
        return "안녕하세요";
    }

    @Override
    public String bye() {
        return HelloService.super.bye();
    }

}
