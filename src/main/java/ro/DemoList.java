package ro;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

@Component
public class DemoList {
    @Resource(name = "mapa")
    private Map<String, Object> map;
    @Resource(name = "lista")
    private List list;
    @Resource(name = "propsa")
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
