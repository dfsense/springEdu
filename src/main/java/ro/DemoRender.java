package ro;

import interfaces.IProvider;
import interfaces.IRender;

public class DemoRender implements IRender {
    private IProvider provider;

    public void setProvider(IProvider provider) {
        this.provider = provider;
    }

    public void render() {
        System.out.println(provider.getMessage());
    }
}
