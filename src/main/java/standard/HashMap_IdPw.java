package standard;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_IdPw {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("Id1", "1111");
        map.put("Id2", "2222");
        map.put("Id3", "3333");
//        System.out.println(map);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Id와 Pw를 입력하세요");
            System.out.println("Id : ");
            String id = scanner.nextLine().trim();  //trim 은 앞 뒤 공백을 없애준다
            System.out.println("Pw : ");
            String pw = scanner.nextLine().trim();

            System.out.println();  //줄바꿈 역활

            if (!map.containsKey(id)) {  //containsKey는 key 값 전체를 가리킨다
                System.out.println("일치하는 id가 없습니다" + "\n" + "다시 입력해 주시기 바랍니다");
                continue;  //다음 반복 while 문으로 이동
            }

            if (!map.get(id).equals(pw)) {  //get(id)는 key 값 중에 id와 일치하는 값이 있으면  value 값을 반환한다
                System.out.println("비밀번호가 일치하지 않습니다" + "\n" + "다시 입력해 주시기 바랍니다");
            } else {
                System.out.println("id와 비밀번호가 일치합니다");
                break;
            }
        }
    }
}
