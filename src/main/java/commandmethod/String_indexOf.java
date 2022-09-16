package commandmethod;

public class String_indexOf {
    public static void main(String[] args) {

    String str = "Hello welcome to develop world!!";
                //01234567890123456789012345678901

        System.out.println(str.indexOf("welcome")); //문자열 검색 -> 6
        System.out.println(str.indexOf("to")); //문자열 검색 -> 14

        System.out.println(str.indexOf("t")); //문자 검색 -> 14
        System.out.println(str.indexOf("w")); //문자 검색 -> 6

        System.out.println(str.indexOf("welcome",10)); //문자열을 10번째 index부터 검색 -> -1
        System.out.println(str.indexOf("to",10)); //문자열을 10번째 index부터 검색 -> 14
        System.out.println(str.indexOf("world",10)); //문자열을 10번째 index부터 검색 -> 25

        System.out.println(str.indexOf("t",10)); //문자를 10번째 index부터 검색 -> 14
        System.out.println(str.indexOf("w",10)); //문자를 10번째 index부터 검색 -> 25
        System.out.println(str.indexOf("p",10)); //문자를 10번째 index부터 검색 -> 23

        if(str.indexOf("welcome")!=-1) {
            System.out.println("문자가 포함되어 있습니다");
        } else {
            System.out.println("문자가 포함되어 있지 않습니다");
        }
    }
}
