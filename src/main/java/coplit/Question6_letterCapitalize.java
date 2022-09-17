package coplit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
문제
문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자가 대문자인 문자열을 리턴해야 합니다.

입력
인자 1 : str
String 타입의 공백이 있는 알파벳 문자열
출력
String 타입을 리턴해야 합니다.

주의 사항
단어는 공백으로 구분합니다.
연속된 공백이 존재할 수 있습니다.
빈 문자(공백)으로만 이루어진 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다.

입출력 예시
String output1 = letterCapitalize('hello world');
System.out.println(output1); // "Hello World"
String output2 = letterCapitalize('java  is good ');
System.out.println(output2); // "Java  Is Good "
 */
public class Question6_letterCapitalize {
    public static void main(String[] args) throws Exception{
        //문자열을 입력받을 객체를 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문자열을 출력할 객체를 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //문자열을 입력받을 변수를 생성
        String words = br.readLine();
        String arr[] = words.split(" ");

        //조건 생성
        if(arr.length == 0 || words.isBlank()) {
            bw.write(words);
        } else {
//            String changeWords = words.toUpperCase(0,0);
//            bw.write(changeWords);
        }
        bw.flush();//남아있는 데이터를 모두 출력
        bw.close();//스트림 닫음
    }
}
