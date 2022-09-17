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

        StringBuffer sc = new StringBuffer();
        sc.append("Hello welcome to develop world!");

        //입력받은 문자열을 뒤집는다
        System.out.println(sc.reverse());
    }
}