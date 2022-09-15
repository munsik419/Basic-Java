package coplit;

import java.util.Scanner;

/*
문제
연이율을 입력받아 원금이 2배 이상이 될 때까지 걸리는 시간(년)을 리턴해야 합니다.

입력
인자 1 : interestRate
double 타입의 연이율 (%)
출력
int 타입을 리턴해야 합니다.

입출력 예시
int output = computeWhenDouble(7);
System.out.println(output); // --> 11

output = computeWhenDouble(10);
System.out.println(output); // --> 8
*/
public class Question2_computeWhenDouble {
    public static void main(String[] args) {

        //연이율을 입력받는다
        Scanner sc = new Scanner(System.in);

        System.out.println("연이율을 입력해 주세요 : ");
        Double interestRate = sc.nextDouble();
        Double interestRate1 = interestRate/100;

        //원금을 입력받는다
        System.out.println("원금을 입력해 주세요 : ");
        Double amountMoney = sc.nextDouble();

        //원금이 2배 이상이 되는데 걸리는 시간을 구한다
        int year = 0;
        Double doubleAmountMoney = amountMoney;
        while (doubleAmountMoney < amountMoney * 2) {
            doubleAmountMoney = doubleAmountMoney + (doubleAmountMoney * interestRate1);
            year++;
        }

        //원금의 2배가 넘는 시간(년)을 출력한다
        System.out.println("원금의 2배 이상이 되는 기간은 " + year + " 년 입니다");
    }
}

//코플릿 풀이
//    public int computeWhenDouble(double interestRate) {
//        double rate = 1 + interestRate / 100;
//        double principal = 1;
//        int year = 0;
//        while (principal < 2) {
//            principal = principal * rate;
//            year++;
//        }
//        return year;
//    }