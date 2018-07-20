package factory;

import interfaces.DemoBean;
import ro.MyHelper;

public abstract class AbstractDemoBean implements DemoBean {
    abstract public MyHelper getMyHelper();

    @Override
    public void unLock() {
        getMyHelper().doSomething();
    }
}
