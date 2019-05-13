package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> res = new ArrayList<>();
        List<String> list = collection2.get("value");

        for (int i = 0; i < collection1.size(); i ++){
            for (int j = 0; j < list.size(); j ++){
                if (collection1.get(i).equals(list.get(j)) && !res.contains(collection1.get(i))){
                    res.add(collection1.get(i));
                }
            }
        }

        return res;
    }
}
