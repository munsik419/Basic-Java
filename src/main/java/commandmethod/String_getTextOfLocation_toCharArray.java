package commandmethod;

public class String_getTextOfLocation_toCharArray {
    public static Character getFirstCharacter(String str)
    {
        if(str == null || str.length() == 0)  //빈 문자열일 경우 null 반환
            return null;
        else
        {
            char[] charArr = str.toCharArray();  //문자열을 배열로 변환
            return charArr[0];
        }
    }
    public static void main(String[] args)
    {
        String str = "Hello welcome to develop world!!";
        System.out.println("문자열 : " + str);
        System.out.print("문자열에 첫번째 문자는 : " + getFirstCharacter(str));
    }
}
