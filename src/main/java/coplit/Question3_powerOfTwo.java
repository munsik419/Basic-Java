package coplit;

/*
문제
수를 입력받아 2의 거듭제곱인지 여부를 리턴해야 합니다.

입력
인자 1 : num
long 타입의 정수 (num >= 1)
출력
boolean 타입을 리턴해야 합니다.

주의 사항
반복문(while)문을 사용해야 합니다.
2의 0승은 1입니다.
Math.log 사용은 금지됩니다.

입출력 예시
boolean output1 = powerOfTwo(16);
System.out.println(output1); // true
boolean output2 = powerOfTwo(22);
System.out.println(output2); // false
 */

import java.util.Scanner;

public class Question3_powerOfTwo {
    public static void main(String[] args) {
        //수를 입력받는다
        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력하세요 : ");
        long num = sc.nextInt();

        //2의 거듭제곱인지 확인 후 boolean 값을 출력한다
        while (num >= 1) {
            if (num % 2 == 0 || num == 1) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            break;
        }
    }
}
