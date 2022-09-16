package coplit;
/*
문제
문자열을 입력받아 문자열을 구성하는 각 단어의 첫 글자로 이루어진 문자열을 리턴해야 합니다.

입력
인자 1 : str
String 타입의 공백이 있는 알파벳 문자열
출력
String 타입을 리턴해야 합니다.

주의 사항
단어는 공백 한 칸으로 구분합니다.
연속된 공백은 없다고 가정합니다.
빈 문자열을 입력받은 경우, 빈 문자열을 리턴해야 합니다.

입출력 예시
String output = firstCharacter("hello world");
System.out.println(output); // --> "hw"

output = firstCharacter("The community at Code States might be the biggest asset");
System.out.println(output); // --> "TcaCSmbtba"
 */

import java.util.Scanner;

public class Question4_firstCharacter {
    public static void main(String[] args) {
        //문자열을 입력받는다
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        //문자열을 ""를 기준으로 배열로 변환한다
        String[] wordArr = word.split(" ");


        //배열 길이만큼 반복하며 단어의 첫번째 문자를 구한다
        for (int i=0; i< wordArr.length; i++) {

            char firstArr = wordArr[i].charAt(0);

            System.out.print(firstArr);

        }
    }
}
