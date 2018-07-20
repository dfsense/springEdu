package factory;

import interfaces.DemoBean;
import ro.MyHelper;

public class StandartDemoBean implements DemoBean {
    private MyHelper myHelper;

    @Override
    public MyHelper getMyHelper() {
        return this.myHelper;
    }

    public void setMyHelper(MyHelper myHelper){
        this.myHelper = myHelper;
    }

    @Override
    public void unLock() {
        myHelper.doSomething();
//        System.out.println("StandartDemoBean:unLock");
    }
}
