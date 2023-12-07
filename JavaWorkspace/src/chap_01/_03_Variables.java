package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        // 문자열 변수가 생성됨
        String name;
        name = "아무개";
        // 정수형 변수
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        //실수형 변수
        double score = 90.5;
        //한 글자 만을 표현 하고 싶을 때, 한 단어를 표현할 때
        char grade = 'A';
        // 변수 업데이트
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        // boolean 데이터 타입
        boolean pass =true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        // 정밀도가 약간 떨어지는 실수형 데이터, float는 특정 자리숫자까지만 표현함
        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        // int 범위는 -20억 ~ +20억 --> 이보다 큰 숫자는 long 데이터 타입을 사용
        long l = 10000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
