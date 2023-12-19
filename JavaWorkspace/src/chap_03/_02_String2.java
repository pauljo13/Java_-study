package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and ",",")); // " 기존 문자 " -> " 변경 문자 "
        System.out.println(s.substring(7)); //인덱스 기준부터 시작
        System.out.println(s.substring(s.indexOf("Java"))); // 원하는 문자 위치를 반환 후 해당 부분부터 출력
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작 위치는 글자를 포함, 끝 위치는 해당 글자를 포함하지 않는다. 직전까지

        // 공백 제거
        s = "        I love Java.      ";
        System.out.println(s);
        System.out.println(s.trim()); // 불필요한 공백을 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); //JavaPython
        System.out.println(s1 + "," + s2); //Java,Python
        System.out.println(s1.concat(",").concat(s2)); //Java,Python


    }
}
