package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        String KR_COUNTRY_CODE = "+82"; // 국가 번호
        KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final String KR_COUNTRY_CODE2 = "+82";
        //KR_COUNTRY_CODE2 ="+8383";
        System.out.println(KR_COUNTRY_CODE2);

        final double PI = 3.141592; // 원주율 --> 상수화
        final String DATE_OF_BIRTH = "2001-12-31"; //생년 월일

    }
}
