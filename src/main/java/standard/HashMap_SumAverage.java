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
//        System.out.println(map);

        //전체 map에 저장된 데이터에서 값을 호출,조회하는 코드

        Set set = map.entrySet();  //map에 저장된 데이터를 key,value 쌍으로 호출한다
        Iterator iter = set.iterator();  //set에 데이터가 남아 있는지 확인한다

        while(iter.hasNext()) {
            Map.Entry me = (Map.Entry)iter.next();  //Map 인터페이스 안의 Entry 인터페이스
            System.out.println("이름 : " + me.getKey() + ", 점수 : " + me.getValue());
        }

        //전체 map에서 key 데이터만을 호출하는 코드
        set = map.keySet();  //key에 저장된 값만 가져온다
        System.out.println("참가자 명단 : " + set);

        //전체 map에서 value 데이터만을 호출하는 코드
        Collection values = map.values();  //value 데이터를 가져온다
        iter = values.iterator();

        int total = 0;

        while(iter.hasNext()) {  //hasNext()는 읽어 올 요소가 남았는지 확인한다
            int i = (int)iter.next();  //next() 메소드는 읽어 올 요소가 남았는지 확인한다
            total = total +i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/set.size());  //정수로 결과값이 나오므로 float로 형변환 해 준다
        System.out.println("최고점수 : "+ Collections.max(values));
        System.out.println("최저점수 : "+ Collections.min(values));
   }
}
