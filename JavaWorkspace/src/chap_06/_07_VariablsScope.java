package chap_06;

public class _07_VariablsScope {
    public static void methodA(){
//        System.out.println(number);
//        System.out.println(result);
    }
    public static void methodB(){
        int  result = 1; // 지역 변수
    }
    public static void main(String[] args) {
        // 변수의 범위
        int number = 3 ;
//        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
//        System.out.println(j);
    }
}
