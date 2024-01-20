package chap_06;

public class _05_Overloading{
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언 하는 것
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        // 이름이 똑같아도 받는 자료형에 따라서 다른게 반응하기 때문에 메소드의 이름이 중복되어도 상관없다.
        System.out.println(getPower(3,3));

    }
}
