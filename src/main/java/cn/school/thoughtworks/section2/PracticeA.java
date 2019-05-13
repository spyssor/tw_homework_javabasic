package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        HashMap<String, Integer> res = new HashMap<>();

        for (String element : collection1){
            if (res.containsKey(element)) {
                res.put(element, res.get(element) + 1);
            } else {
                res.put(element, 1);
            }
        }

        return res;
    }
}
