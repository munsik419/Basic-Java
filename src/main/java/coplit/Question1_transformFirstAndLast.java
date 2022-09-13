package coplit;

import java.util.*;
import java.util.function.Function;

/*
문제
배열을 입력받아 차례대로 배열의 첫 요소와 마지막 요소를 키와 값으로 하는 HashMap을 리턴해야 합니다.

입력
인자 1 : arr
String 타입을 요소로 갖는 배열
출력
HashMap<String, String> 타입의 값을 리턴해야 합니다.

주의 사항
빈 배열을 입력받은 경우, null을 리턴해야 합니다.
입력으로 받는 배열을 수정하지 않아야 합니다.
입출력 예시
String[] arr = new String[]{'Queen', 'Elizabeth', 'Of Hearts', 'Beyonce'};
HashMap<String, String> output = transformFirstAndLast(arr);
System.out.println(output); // --> { Queen : 'Beyonce' }

String[] arr = new String[]{'Kevin', 'Bacon', 'Love', 'Hart', 'Costner', 'Spacey'};
HashMap<String, String> output = transformFirstAndLast(arr);
System.out.println(output); // --> { Kevin : 'Spacey'}

 */
//public class Question1_transformFirstAndLast {
//    public static void main(String[] args) {
//
//
//        //HashMap(key, value)로 구성되며 순서가 없다. key는 중복 불가, value는 중복 허용
//        //HashMap을 순서를 유지하려면 LikedHashMap클래스를 사용하면 된다
//        //Hashing 기법으로 만들어진다
//        //HashMap map = new HasgMap(); / map.put("key", "value"); / 저장에 put를 사용한다
//        //key,value 한쌍을 entry라고 한다 /
//        HashMap[] arr = new HashMap[]{};  //arr 인자에 key,value 값 HashMap 생성
//        arr.put("index=0", "index=last")
//        Scanner sc = new Scanner(System.in);
//           String map = sc.next();
//
//            if (arr.length == 0) return null;
//            HashMap<String, String> result = new HashMap<>();
//            result.put(arr[0], arr[arr.length - 1]);
//            return result;
//        }
//    }
//}