package chap_01;

import java.security.SecureRandom;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 엉뚱한 이름을 짓게 되면 모르는 사람이 혼동
        // 2. 밑줄(_). 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
        // 3. 밑줄, 문자로 시작 가능(숫자는 불가)
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int, double, float, ...)

        // 다른 나라 입국 신고서(여행)
        String nationality = "대한민국"; //국적
        String firstName = "철수"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "2001-12-31"; // 생년원일
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE607"; // 항공 편명
        String _flightNo = "KE607";
        String flight_no_2 = "KE607";
        // 안되는 사례 String -flightNo = "KE607";

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "가방";
        // 안되는 사례 String 3item = "전자제품";

        // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않음)
        int i = 0;
        String s = "";
        String str = "";

        // 절대 변하지 않는 상수능ㄴ 대문자로
        final String CODE = "KT";

    }
}
