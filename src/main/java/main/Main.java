package main;

import factory.FactoryObj;
import interfaces.IProvider;
import interfaces.IRender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import ro.DemoList;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext rootContext = new GenericXmlApplicationContext();
        rootContext.load("classpath:context-annotation-root.xml");
        rootContext.refresh();

        DemoList demo = (DemoList) rootContext.getBean("demoList");
        demo.showAll();
    }
}
