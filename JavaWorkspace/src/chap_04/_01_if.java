package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 IF
        int hour = 15; // 오전 10

        // if 문 내에서 하나의 문자을 싱향할 때는 { } 생략 가능 하다.
        // if ( 조건 )
        //      실행 문

        // if 문 내에서 두개 이상의 문장을 싱행할 때는 { } 사용해서 실행한다.
        // if ( 조건 ) {
        //      실행문 1
        //      샐행문 2
        // }
        if (hour < 14) {
            System.out.println("아시스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료 #1");

        // 두 개의 조건
        hour = 10;
        boolean mCoffee = false;
//        if ( hour < 14 && mCoffee == false){
        if ( hour < 14 && !mCoffee){
            System.out.println("아이스 아메리카노 + 1");

        }
        System.out.println("커피 주문 완료 #2");


        // 오후 2사 아후이거나 모닝 커피를 마신 경우 ?
        hour = 15;
        mCoffee = false;
        if (hour >= 14 || mCoffee == true){
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
