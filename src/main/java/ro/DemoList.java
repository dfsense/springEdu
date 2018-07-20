package ro;

import java.util.*;

public class DemoList {
    private Map<String, Object> map;
    private List list;
    private Properties props;

    public void showAll(){
        System.out.println("Map: ");
        for (Map.Entry<String, Object> entry : this.map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("List: ");
        for (Object obj : this.list){
            System.out.println(obj);
        }

        System.out.println("Props: ");
        for (Map.Entry<Object, Object> entry : props.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
