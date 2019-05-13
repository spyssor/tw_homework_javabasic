package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        HashMap<String, Integer> res = new HashMap<>();
        List<String> list = object.get("value");

        for (String element : collectionA){
            if (element.length() == 1) {
                if (res.containsKey(element)) {
                    res.put(element, res.get(element) + 1);
                } else {
                    res.put(element, 1);
                }
            } else {
                if (element.charAt(1) == '-'){
                    if (res.containsKey(element.charAt(0)+"")) {
                        res.put(element.charAt(0)+"", res.get(element.charAt(0)+"") + Integer.parseInt(element.substring(2)));
                    } else {
                        res.put(element.charAt(0)+"", Integer.parseInt(element.substring(2)));
                    }
                }
            }

        }

        for (String key : list){
            if (res.containsKey(key)){
                res.put(key, res.get(key)- res.get(key)/3);
            }
        }

        return res;
    }
}
