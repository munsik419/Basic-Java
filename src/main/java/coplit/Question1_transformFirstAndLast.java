package coplit;

import java.util.*;

import static java.lang.String.valueOf;

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
public class Question1_transformFirstAndLast {
    public static void main(String[] args) {

        //입력받을 데이터의 개수를 입력받는다
        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 문자의 개수는?");
        Integer count = sc.nextInt();
        sc.nextLine();

        //배열에 들어갈 문자열을 입력한다
        System.out.println(count + "개의 문자를 입력하세요");
        String[] arr = new String[count];
        for (int i = 0; i < count; ++i) {//
            arr[i] = sc.nextLine();

            //배열에 빈문자열이 입력되면 null을 반환한다
            if(arr[i].length()==0){
                arr[i]=null;
            }
        }

        //저장된 배열의 데이터 중에서 첫번째와 마지막 데이터를 key와 value 로 저장한다
        HashMap result = new HashMap();

        //배열의 첫번째와 마지막 값을 key와 value로 저장한다
        result.put(arr[0], arr[arr.length - 1]);

        //저장된 값을 출력한다
        System.out.println("{" + result.keySet() + " : " + result.values() + "}");
    }
}

// 코플릿 풀이 코드
//    public HashMap<String, String> transformFirstAndLast(String[] arr) {
//        if(arr.length == 0) return null;
//        HashMap<String, String> result = new HashMap<>();
//        result.put(arr[0], arr[arr.length - 1]);
//        return result;
//    }



