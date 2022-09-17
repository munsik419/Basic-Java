package coplit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

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
        if(arr.length == 0 || words.isBlank()) {  //빈 문자열이거나 공백이면

            bw.write(words);  //그대로 출력한다

        } else {
            Pattern pattern = Pattern.compile("([a-z])([a-z]*)");  //모든 문자열에 대한 정규식

            Matcher matcher = pattern.matcher(words);  //pattern과 일치하는 문자열을 찾아서 객체에 전달

            //위의 두 코드를 하나로 합칠 수 있다
//            Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(words);

            StringBuffer str = new StringBuffer();  //변경한 문자열을 저장할 공간을 생성한다

            while (matcher.find()) {  //matcher.find()) 메서드로 매칭되는 위치로 이동한다

                //appendReplacement 메서드로 (str, 바꿀 문자열)을 통해 바뀐 문자열을 str에 저장한다
                matcher.appendReplacement(str, matcher.group(1).toUpperCase() + matcher.group(2).toLowerCase());
            }
            matcher.appendTail(str);  //더이상 찾을 문자열이 없으므로 꼬리를 붙이기 위한 메서드를 사용한다
            bw.write(str.toString());  //str 값을 String으로 변환하여 출룍한다
        }
        bw.flush();//남아있는 데이터를 모두 출력
        bw.close();//스트림 닫음
    }
}
