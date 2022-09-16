package commandmethod;

public class String_getTextOfLocation_substring {
    public static void main(String[] args){

        String str = "Hello welcome to develop world!!";
                    //01234567890123456789012345678901
        System.out.println("문자열 : " + str);

        System.out.println("시작점 index(3): " + str.substring(3));  //4번째 문자부터 전체 반환

        System.out.println("index(2)부터 index(6)까지의 문자 : " + str.substring(2, 7));  //3번째 문자부터 6번째 앞 문자까지
        System.out.println("index(3)부터 index(7)까지의 문자 : " + str.substring(3, 8));  //3번째 문자부터 8번째 앞 문자까지


        System.out.print("문자열에 첫번째 문자는 : " + getFirstCharacter(str));  //첫번째 문자열 가져오기

    }

    public static String getFirstCharacter(String str)
    {
        if(str == null || str.length() == 0)  //빈 문자열일 경우의 조건
            return null;
        else
            return str.substring(0, 1);
    }
}

