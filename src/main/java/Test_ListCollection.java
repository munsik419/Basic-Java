import java.util.ArrayList;

public class Test_ListCollection {
    public static void main(String[] args) {

//        ArrayList<Integer> arrList = new ArrayList<Integer>();
//
//
//
// add() 메소드를 이용한 요소의 저장
//
//        arrList.add(40);
//
//        arrList.add(20);
//
//        arrList.add(30);
//
//        arrList.add(10);


// for 문과 get() 메소드를 이용한 요소의 출력

//        for (int i = 0; i < arrList.size(); i++) {
//
//            System.out.print(arrList.get(i) + " ");
//
//        }

        //Dog 객체로 이루어진 ArrayList를 만들어 mylist의 참조변수에 담는다
        ArrayList<Dog> myList = new ArrayList<Dog>();

        //d,e 객체를 생성한다
        Dog d = new Dog();
        Dog e = new Dog();

        //add 함수로 객체를 ArrayList에 추가한다
        myList.add(d);
        myList.add(e);

        //sizeOfArrayList 변수에 myList.size 함수로 ArryList에 있는 객체의 수를 리턴한다
        int sizeOfArrayList = myList.size();

        //index 변수에 myList.indexOf(d) 함수로 d 객체의 인덱스를 리턴한다
        int index = myList.indexOf(e);

        //isIn 변수에 myList.contains(d) 함수로 d가 ArryList에 있는지 확인한다
        boolean isIn = myList.contains(d);

        //isEmpty 변수에 myList.isEmpty() 함수로 ArryList 객체가 비어있는지 확인한다
        boolean isEmpty = myList.isEmpty();

        //remove 함수로 해당 객체를 제거한다
        myList.remove(d);
        myList.remove(e);

        System.out.println(sizeOfArrayList + " " + index + " " + isIn + " " + isEmpty);

    }


//
//
//
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
private static class Dog {
}
   }

