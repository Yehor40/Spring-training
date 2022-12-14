package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        //HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        //helloWorld.sayHello();
        InjectedByConstructorService constructorService = (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
        constructorService.getMesage();
        SetterBasedService setterBasedService = (SetterBasedService) ctx.getBean("setterBasedService");
        setterBasedService.setMessage();
    }
}
