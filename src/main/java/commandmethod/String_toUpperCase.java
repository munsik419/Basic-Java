package commandmethod;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_toUpperCase {
    public static String upperCaseFirst(String val) {
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }

    public static void main(String[] args) {
        //upperCaseFirst()를 사용하여 변환 : 문장의 첫번째만 변환
        String val1 = "java";
        String val2 = "advanced java";

        String output = upperCaseFirst(val1);
        System.out.println(val1);
        System.out.println(output);

        output = upperCaseFirst(val2);
        System.out.println(val2);
        System.out.println(output);

        //toUpperCase() 와 appendTail()를 사용하여 변환 : 단어의 첫번째를 전부 변환
        String str = "hello world!";
        System.out.println(str);
        StringBuffer strbf = new StringBuffer();
        Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);
        while (match.find()) {
            match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
        }
        System.out.println(match.appendTail(strbf).toString());

        //substring()을 사용하여 변환
        String str1 = "java world";
        String firstLtr = str1.substring(0, 1);
        String restLtrs = str1.substring(1, str1.length());
//        System.out.println(str1.length());

        firstLtr = firstLtr.toUpperCase();
        str1 = firstLtr + restLtrs;
        System.out.println("The modified string is: "+str1);
    }
}
