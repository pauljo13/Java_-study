package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드가 있으면 + 1
        // 망고 주스가 있으면 + 1
        // 아이스 아메리카노 + 1

        boolean hallabongAde = true;
        boolean mango = false;

        if (hallabongAde){
            System.out.println("한라봉 에이드 + 1");
        }
        else if (mango){
            System.out.println("망고 주스 + 1");
        }
        else {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #1");



        // else if 는 여러번 사용 가능 하다.
        hallabongAde = false;
        mango = false;
        boolean orange = true;

        if (hallabongAde){
            System.out.println("한라봉 에이드 + 1");
        }
        else if (mango){
            System.out.println("망고 주스 + 1");
        }
        else if (orange) {
            System.out.println("오렌지 주스 + 1");
        }
        else {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #2");
    }
}
