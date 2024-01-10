package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1 등 : 전액 장학금
        // 2 등 : 반액
        // 3 등 : 반액
        // 그 외 : 대상 아님

        // IF else 문을 사용
        int ranking = 3;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");


        // Switch Case 구문
//        switch ( 조건 ) {
//            case A : ...수행 명령 ...
//                break;
//            case B : ...수행 명령 ...
//                break;
//            case C : ...수행 명령 ...
//                break;
//                ...
//            default:

        ranking = 4;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");


        ranking = 3;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2: // case 2 와 3 을 통합
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정
        // break 사용
        int grade = 2;
        int price = 7000;
        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case  3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");

        // if else 문을 이용 -> 여러 조건 또눈 범위에 해당하는 조건
        // switch case 문을 이용 -> 명확한 케이스가 있는 경우
    }
}
