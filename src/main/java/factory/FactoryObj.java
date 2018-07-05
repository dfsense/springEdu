package factory;

import interfaces.IProvider;
import interfaces.IRender;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FactoryObj {
    static private FactoryObj instance;
    private IProvider provider;
    private IRender render;
    private Properties props;

    private FactoryObj ()
    {
        props = new Properties();
        try {
            props.load(new FileInputStream("src/main/resources/config.properties"));
            if (props != null)
            {
                this.render = (IRender) Class.forName(props.getProperty("render")).newInstance();
                this.provider = (IProvider) Class.forName(props.getProperty("provider")).newInstance();
            }
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    static
    {
        instance = new FactoryObj();
    }

    static public FactoryObj getInstance()
    {
        return FactoryObj.instance;
    }

    public IRender getRender()
    {
        if (this.render == null)
        {
            System.out.println("Render has not loaded");
        }
        return this.render;
    }

    public IProvider getProvider()
    {
        if (this.provider == null)
        {
            System.out.println("Provider has not loaded");
        }
        return this.provider;
    }
}
