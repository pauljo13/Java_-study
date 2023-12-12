package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산자
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2.5(X) 2(O)
        System.out.println(2 / 4); // 0.5(X) 0(O)
        System.out.println(4 % 2); // 0 나머지
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6 -> 곱하기를 우선적으로 처리
        System.out.println((2 + 2) * 2); // 8 -> 괄호를 사용하여 더하기를 우선 처리

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c); // 30
        c = a -b;
        System.out.println(c); // 10
        c = a * b;
        System.out.println(c); // 200
        c = a / b;
        System.out.println(c); // 2
        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
//        val = val + 1;
//        val++;
//        ++val;
        System.out.println(++val); // 11 증감 후 출력
        System.out.println(val); // 11
        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 출력 후 증감
        System.out.println(val); // 11

        val = 10;
        System.out.println(val);
        System.out.println(--val); // 증감 후 출력
        System.out.println(val);
        val = 10;
        System.out.println(val);
        System.out.println(val--); // 출력 후 증감
        System.out.println(val);

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("총 대기 인원 : " + waiting);

    }
}
