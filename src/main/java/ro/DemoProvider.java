package ro;


import interfaces.IProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

public class DemoProvider implements IProvider {
    private String message;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    @Override
    public String toString(){
        return getMessage();
    }
}
