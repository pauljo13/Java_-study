package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ASCII) : 미국 표쥰 코드
        char c = 'A'; // 알파벳 대문자(A)는 65부터 시작, 소문자(a)는 97부터 시작, 숫자(0)는 48부터 시작한다.
        System.out.println(c);
        System.out.println((int)c);
        c = 'B';
        System.out.println(c);
        System.out.println((int)c);
        c++;
        System.out.println(c);
        System.out.println((int)c);

        System.out.println("---------");
        c = 'a';
        System.out.println(c);
        System.out.println((int)c);
        c = 'b';
        System.out.println(c);
        System.out.println((int)c);
        c++;
        System.out.println(c);
        System.out.println((int)c);

        System.out.println("---------");
        c = '0';
        System.out.println(c);
        System.out.println((int)c);
        c = '1';
        System.out.println(c);
        System.out.println((int)c);
        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] seats = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
