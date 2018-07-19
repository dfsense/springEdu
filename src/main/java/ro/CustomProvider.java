package ro;

import interfaces.IProvider;

public class CustomProvider implements IProvider {
    private String address;

    private int age;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getMessage() {
        return this.address + " : " + this.age;
    }
}
