package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        HashMap<String, Integer> res = new HashMap<>();

        for (String element : collection1){
            if (element.length() == 1) {
                if (res.containsKey(element)) {
                    res.put(element, res.get(element) + 1);
                } else {
                    res.put(element, 1);
                }
            } else {
                if (element.charAt(1) == '-' || element.charAt(1) == ':' || (element.charAt(1) == '[')){
                    if (res.containsKey(element.charAt(0)+"")) {
                        res.put(element.charAt(0)+"", res.get(element.charAt(0)+"") + Integer.parseInt(getNums(element)));
                    } else {
                        res.put(element.charAt(0)+"", Integer.parseInt(getNums(element)));
                    }
                }
            }
        }

        return res;
    }

    private String getNums(String str){
        if (str.charAt(1) == '-' || str.charAt(1) == ':'){
            return str.substring(2);
        }else if (str.charAt(1) == '['){
            return str.substring(2,str.length()-1);
        }

        return "0";
    }
}
