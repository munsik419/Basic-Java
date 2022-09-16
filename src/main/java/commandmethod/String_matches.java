package commandmethod;

public class String_matches {
    public static void main(String[] args)  {
        String s = "Hello welcome to develop world!!";

        //특정 문자열 검색
        if(s.matches(".*welcome.*")) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        //영문자 검색
        if(s.matches(".*[a-zA-Z].*")) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        //숫자 검색
        if(s.matches(".*[0-9].*")) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
