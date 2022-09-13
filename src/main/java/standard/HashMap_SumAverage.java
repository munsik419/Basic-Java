package standard;

//https://youtu.be/el6cTtPHVRs

import com.sun.source.tree.LiteralTree;

import java.util.*;

public class HashMap_SumAverage {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("kim", 90);
        map.put("lee", 50);
        map.put("cha", 80);
        map.put("park", 100);
        map.put("choi", 70);
        System.out.println(map);

        Set set = map.entrySet();
        Iterator iter = set.iterator();

        while(iter.hasNext()) {
            Map.Entry en = (Map.Entry)iter.next();
            System.out.println("이름 : " + en.getKey() + ", 점수 : " + en.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values();
        iter = values.iterator();

        int total = 0;

        while(iter.hasNext()) {
            int i = (int)iter.next();
            total = total +i;
        }

        System.out.println("총점 : " + total);
        System.out.println("편균 : " + (float)total/set.size());
        System.out.println("최고점수 : "+ Collections.max(values));
        System.out.println("최저점수 : "+ Collections.min(values));
   }
}
