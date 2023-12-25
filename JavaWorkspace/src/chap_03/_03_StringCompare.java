package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 trye, 다르면 fales
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("python"));
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용이 같은지 여부

        // 문자열 비교 심화
        s1 = "1234"; // 참조
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true 내용을 비교
        System.out.println(s1 == s2); //true -> 참조하는 것이 같은지

        s1 = new String("1234");
        s2 = new String("1234");
        // s1 과 s2 가 다른 참조 이기 때문에 다르다.
        System.out.println(s1.equals(s2)); // true -> 내용만 비교
        System.out.println(s1 == s2); // false -> 참조가 다르기 때문에 다르다고 판단함

    }
}
