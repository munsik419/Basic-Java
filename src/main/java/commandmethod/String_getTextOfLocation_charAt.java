package commandmethod;

public class String_getTextOfLocation_charAt {

    //charAt() 사용하여 문자 출력
    public static Character getFirstCharacter(String str){

        if(str == null || str.length() == 0) {  //문자열이 null이거나 문자열 길이가 0이면
            return null;  //null을 반환
        } else {
            return (Character) str.charAt(0);  //그렇지 않으면 문자열의 0번째 문자를 반환
        }
    }
    public static void main(String[] args)
    {
        String str = "Hello welcome to develop world!!";
        System.out.println("문자열 : " + str);
        System.out.print("문자열에 첫번째 문자는 : " + getFirstCharacter(str));
    }
}