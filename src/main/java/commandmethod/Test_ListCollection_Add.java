package commandmethod;

import java.util.ArrayList;

public class Test_ListCollection_Add {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>();


//      add() 메소드를 이용한 요소의 저장

        arrList.add(40);

        arrList.add(20);

        arrList.add(30);

        arrList.add(10);


//      for 문과 get() 메소드를 이용한 요소의 출력

        for (int i = 0; i < arrList.size(); i++) {

            System.out.print(arrList.get(i) + " ");

        }
    }

}


//// remove() 메소드를 이용한 요소의 제거
//
//        arrList.remove(1);
//
//
//
//// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
//
//        for (int e : arrList) {
//
//        System.out.print(e + " ");
//
//        }
//
//
//
//// Collections.sort() 메소드를 이용한 요소의 정렬
//
//        Collections.sort(arrList);
//
//
//
//// iterator() 메소드와 get() 메소드를 이용한 요소의 출력
//
//        Iterator<Integer> iter = arrList.iterator();
//
//        while (iter.hasNext()) {
//
//        System.out.print(iter.next() + " ");
//
//        }
//
//
//
//// set() 메소드를 이용한 요소의 변경
//
//        arrList.set(0, 20);
//
//
//
//        for (int e : arrList) {
//
//        System.out.print(e + " ");
//
//        }
//
//
//
//// size() 메소드를 이용한 요소의 총 개수
//
//        System.out.println("리스트의 크기 : " + arrList.size());
