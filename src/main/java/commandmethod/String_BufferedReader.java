package commandmethod;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class String_BufferedReader {
    public static void main(String[] args) throws Exception {
        //BufferReader를 사용하여 readLine()로 입력받을 경우 예외처리가 필수이다

        //BufferReader (InputStreamReader) : 문자열 입력 메서드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //InputStreamReader : 문자열 입력 메서드

        String str = br.readLine();  //String 문자열을 라인 단위로 입력, Enter를 경계로 한다

        String arr[] = str.split(" ");  //" "빈칸을 경계로 하여 배열로 변환한다

        int str1 = Integer.parseInt(br.readLine());  //정수형의 문자열 입력, 형변환이 필요하다

//        System.out.println(str);
        System.out.println(arr);
        System.out.println(str1);


        //BufferWriter (OutputStreamWriter) : 문자열 출력 메서드
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.newLine();  //줄바꿈 , "\n"와 같다
        bw.write(str + "\n");  //출력
        bw.newLine(); //줄바꿈 , "\n"와 같다
        bw.flush();//남아있는 데이터를 모두 출력
        bw.close();//스트림 닫음
    }

    // 문자열 가공 방법
    public void manufacturing() throws Exception {
        // 1번째 방법) StringTokenizer를 이용한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer인자값에 입력 문자열 넣음
        int a = Integer.parseInt(st.nextToken()); //첫번째 호출을 to int
        int b = Integer.parseInt(st.nextToken()); //두번째 호출을 to int

        // 두번째 방법) string을 한번에 받아서 split을 이용해 배열로 변환
        String s = br.readLine();
        String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음

        return;
    }

}