package ro;

import interfaces.IProvider;
import interfaces.IRender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class DemoRender implements IRender {
    private IProvider provider;

    public void setProvider(IProvider provider) {
        this.provider = provider;
    }

    public void render() {
        System.out.println(provider.getMessage());
    }
}
