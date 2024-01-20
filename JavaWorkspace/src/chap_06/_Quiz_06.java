package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String str,int number) {
        String result = str.substring(0,number);
        for (int i = 0; i < str.length()-number; i++) {
            result += "*";
        }
        return result;
    }
    public static void main(String[] args) {
        // 개인 정보 중 일부를 비공개로 전환하는 프로그램
        // 조건
        // 1. 하나의 메소드에서 모든 동작 처리
        // 2. 각 정보는 아래 위치부터 비공개 적용
        // - 이름 2 번째 글자
        // - 주민등록번호 9 번째 글자
        // - 전화번호 10 번째 글자
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";


        System.out.println("이름 : " + getHiddenData(name,1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));

    }
}
