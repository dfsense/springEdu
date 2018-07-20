package main;


import interfaces.DemoBean;
import org.springframework.context.support.GenericXmlApplicationContext;
import ro.MyHelper;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext rootContext = new GenericXmlApplicationContext();
        rootContext.load("classpath:context-annotation-root.xml");
        rootContext.refresh();

        DemoBean standartDemoBean1 = (DemoBean) rootContext.getBean("standartDemoBean");
        DemoBean standartDemoBean2 = (DemoBean) rootContext.getBean("standartDemoBean");
        DemoBean abstractDemoBean = (DemoBean) rootContext.getBean("abstractDemoBean");
        System.out.println("sdb1.helper == sdb2.helper " + (standartDemoBean1.getMyHelper() == standartDemoBean2.getMyHelper()));

        test(standartDemoBean1);
        test(standartDemoBean2);
        test(abstractDemoBean);
    }

    static public void test(DemoBean demoBean){
        MyHelper helper1 = demoBean.getMyHelper();
        MyHelper helper2 = demoBean.getMyHelper();
        System.out.println("helper1 == helper2 : " + (helper1 == helper2));
    }
}
