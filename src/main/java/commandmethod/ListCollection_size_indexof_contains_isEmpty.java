package commandmethod;

import java.util.ArrayList;

public class ListCollection_size_indexof_contains_isEmpty {
    public static void main(String[] args) {

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

    private static class Dog {
    }
}
