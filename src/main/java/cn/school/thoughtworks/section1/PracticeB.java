package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> res = new ArrayList<>();

        for (List<String> list : collection2){
            for (int i = 0; i < collection1.size(); i ++){
                for (int j = 0; j < list.size(); j ++){
                    if (collection1.get(i).equals(list.get(j)) && !res.contains(collection1.get(i))){
                        res.add(collection1.get(i));
                    }
                }
            }
        }

        return res;
    }
}
