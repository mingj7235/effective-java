package me.whiteship.chapter01.item01;

import me.whiteship.hello.ChineseHelloService;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

//    public static HelloService of (String args) {
//        if (args.equals("ko")) {
//            return new KoreanHelloService();
//        } else {
//            return new EnglishHelloService();
//        }
//    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        // HelloService 에 구현되어 있는 모든 클래스를 찾아온다.

//        Optional<HelloService> helloServiceOptional = loader.findFirst();
//        // 첫번째 구현된 클래스를 가지고 온다.
//
//        helloServiceOptional.ifPresent(h -> {
//            System.out.println(h.hello());
//        });

        loader.stream()
                .forEach(h -> {
                    System.out.println(h.get().hello());
                });



//        HelloService eng = HelloService.of("eng");
//        System.out.println(eng.hello());

//        HelloService helloService = new ChineseHelloService();
//        System.out.println(helloService.hello());

//        Class<?> aClass = Class.forName("me.whiteship.hello.ChineseHelloService");
//        Constructor<?> constructor = aClass.getConstructor();
//        HelloService helloService = (HelloService) constructor.newInstance();
//        System.out.println(helloService.hello());
    }

}
