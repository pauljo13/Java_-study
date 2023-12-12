# Java_study
## java day 1
Java -> 객체지향 프로그램  
Java 사용 : 웹 애플리케이션, 모바일 App, 데스크톱 App, 웹 자동화, 머신러닝, 데이터 분석, 사물인터넷, 게임 개발, ... 코딩 테스트  
java  배우면 좋을까 : 개발자 취업, 컴퓨터 전공, 웹/모바일 앱 개발  
  
### 목록(9h)
- 환경 설정
- 자료형과 변수
- 연산자
- 문자열
- 제어문
- 배열
- 메소드

### 중요 공부 내용(11h)
- 클래스
- 추상클래스와 인터페이스
- 제네릭스
- 익명클래스 람다와 스크림
- 예외처리
- 쓰레드
- 입출력

## java day 2

### 데이터 타입
- 문자열
- 숫자(정수, 음수, 실수)
- Boolean(true, fales)
  
### 변수 설정
java 에서는 변수를 설정할 때 해당 "데이터 타입 + 변수이름;"으로 변수를 먼저 설정해준다.  
이후 "=" 로 직접 선언한 곳에서 데이터를 넣어도 되지만 이후 "변수명 = 데이터값;"로 변수를 넣수있다.
- 문자열 : String(긴 문장), char(짧은거)
- 숫자 : int(적당한 정수), long(긴 정수값), double(정확한 실수), float(적당한 실수)
- boolean형 : boolean(true, falese 값)
  
## java day 3

### 변수 이름 짓는 법
1. 저장할 값에 어울리는 이름
    - 엉뚱한 이름을 짓게 되면 모르는 사람이 혼동
2. 밑줄(_). 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
3. 밑줄, 문자로 시작 가능(숫자는 불가)
4. 한 단어 또는 2개 이상 단어의 연속
5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
6. 예약어 사용 불가 (public, static, void, int, double, float, ...)
  
- 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않음)
- 절대 변하지 않는 상수능ㄴ 대문자로

### 상수
"final 데이터타입 이름(대문자)"의 형태로 상수로 만든다.  
상수가 되면 중간에 데이터를 바꾸는 것이 불가능 하다.  

### 형변환
형변환은 데이터 타입을 변환하는 것으로  
정수형 -> 실수형  
실수형 -> 정수형  
문자열 -> 정수형 or 실수형  
정수형 or 실수형 -> 문자열  
  
"(변환할 데이터 타입) 변수"   
정수형 -> 실수형 : (float)s, (double)s  
실수형 -> 정수형 : (int)s  
  
숫자형(정수,실수) -> 문자형  
String s1 = String.valueOf(정수 or 실수);  
String s1 = Integer.toString(정수);  
String s1 = Double.toString(실수)  

문자형 -> 숫자형(정수,실수)  
int i = Integer.parseInt("문자");  
double d = Double.parseDouble("문자");  

### 산술 연산자
- 일반 연산
System.out.println(4 + 2); // 6
System.out.println(4 - 2); // 2
System.out.println(4 * 2); // 8
System.out.println(4 / 2); // 2
System.out.println(5 / 2); // 2.5(X) 2(O)
System.out.println(2 / 4); // 0.5(X) 0(O)
System.out.println(4 % 2); // 0 나머지
System.out.println(5 % 2); // 1
  
- 우선 순위 연산
System.out.println(2 + 2 * 2); // 6 -> 곱하기를 우선적으로 처리
System.out.println((2 + 2) * 2); // 8 -> 괄호를 사용하여 더하기를 우선 처리

- 변수를 이용한 연산
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

- 증감 연산 : ++, --
x = x + 1;
x++ 출력 후 증감
++x 증감 후 출력
x = x - 1;
x-- 출력 후 증감
--x 증감 후 출력

