package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        HashMap<String, Integer> res = new HashMap<>();
        List<String> list = object.get("value");

        for (String element : collectionA){
            if (res.containsKey(element)) {
                res.put(element, res.get(element) + 1);
            } else {
                res.put(element, 1);
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
