package ro;


import interfaces.IProvider;

public class DemoProvider implements IProvider {
    public String getMessage() {
        return "Hello World!!!";
    }
}
