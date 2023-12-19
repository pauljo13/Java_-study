package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        // 문자열
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 모두 대문자로 변환
        System.out.println(s.toLowerCase()); // 모두 소문자로 변환

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 문자는 0부터 시작해 있는 위치를 반환
        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 -1 을 반환
        System.out.println(s.indexOf("and")); // 12 처음으로 나오는 곳을 우선 반환
        System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 위치 정보를 반환
        System.out.println(s.startsWith("I like")); // 헤딩 믄지얄러 시작하면 true
        System.out.println(s.endsWith(".")); // 해당 문자열로 끝나면 true



    }
}
