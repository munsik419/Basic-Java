package coplit;
/*
문제
문자열을 입력받아 순서가 뒤집힌 문자열을 리턴해야 합니다.

입력
인자 1 : str
String 타입의 문자열
출력
String 타입을 리턴해야 합니다.

입출력 예시
String output = firstReverse("codestates");
System.out.println(output); // "setatsedoc"

output = firstReverse('I love codestates');
System.out.println(output); // "setatsedoc evol I"
 */

import java.util.Scanner;

public class Question4_firstReverse {
    public static void main(String[] args) {

        //문자열을 입력받는다
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

        //입력받은 문자열을 뒤집는다
        StringBuffer sb = new StringBuffer(words);  //StringBuffer : 생성자의 파라미터로 문자열을 입력받는다
        String wordsReverse = sb.reverse().toString();  //reverse() 메서드로 객체의 reference를 반환한다
//        String wordsReverse = String.valueOf(sb.reverse()); sb.reverse().toString();와 같은 결과 값 반환

        System.out.println(wordsReverse);
    }
}

