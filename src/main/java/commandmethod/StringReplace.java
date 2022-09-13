package commandmethod;

public class StringReplace {
    public static void main(String[] args) {

        //하나의 문자를 변경
        String str = "Hello World";
        String change = str.replace('l', 'r');
        System.out.println(change);

        //한개의 단어를 변경
        String change1 = str.replace("Hello", "Hi");
        System.out.println(change1);

        //줄바꿈이 있는 문장의 경우 : 별 의미는 없는거 같다
        String str1 = ("\n"+"Hello World"+"\n"+"This is Developer World");
        String change2 = str1.replaceAll("World"+"\n", "Hi");
        System.out.println(change2);

        //첫번째 문자만을 변경
        String change3 = str.replaceFirst("l", "Hi");
        System.out.println(change3);

    }
}
