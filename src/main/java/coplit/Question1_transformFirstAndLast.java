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


//        String[] arr = new String[100];

//        HashMap<String, String> result = new HashMap<String, String>();

        //입력받을 데이터의 개수를 입력받는다
        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 문자의 개수는?(100개 이하)");
        int count = sc.nextInt();

        //배열에 들어갈 문자열을 입력한다
        System.out.println(count + "개의 문자를 입력하세요");
        String[] arr = new String[100];
        for (int i = 0; i < count; ++i) {//
            arr[i] = sc.nextLine();
        }
//        String[] arr = new String[100];

        //저장된 배열의 데이터 중에서 첫번째와 마지막 데이터를 key와 value 로 저장한다
        HashMap result = new HashMap();

        //배열의 첫번째와 마지막 값을 key와 value로 저장한다
            result.put(arr[0], arr[arr.length - 1]);
//        int i = 0;
//        for (String str : arr) {  //배열 arr의 값을 str 변수에 대입한다
//            isStringEmpty(true, null); //대입된 값의 길이 index가 0이면
//            i++;
        //저장된 값을 출력한다
            System.out.println(result);
        }
    }


//        static boolean isStringEmpty (String arr){
//            System.out.println("null");
//            return arr == null;
//        }
//    }




