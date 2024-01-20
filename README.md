# Java_study
![Java Logo](https://nesoy.github.io/assets/logo/Java.jpg)  
  
## 자바 기초 - 1회차
객체 지향 프로그래밍 언어인 자바는 강력한 타입 체크를 제공하며, 다양한 데이터 타입을 지원합니다. 이러한 데이터 타입들을 이해하고 올바르게 사용하는 것은 자바 프로그래밍에서 매우 중요합니다.
  
Java 사용 : 웹 애플리케이션, 모바일 App, 데스크톱 App, 웹 자동화, 머신러닝, 데이터 분석, 사물인터넷, 게임 개발, ... 코딩 테스트  
java  배우면 좋을까 : 개발자 취업, 컴퓨터 전공, 웹/모바일 앱 개발
  
#### 자바 타입 시스템의 중요성
자바의 타입 시스템은 프로그램의 안정성과 유지보수성을 향상시킵니다. 컴파일 시에 데이터 타입을 체크함으로써, 런타임 오류의 가능성을 줄여줍니다. 또한, 각 변수의 타입이 명확하게 정의되어 있기 때문에 코드의 가독성이 높아지고, 다른 개발자들이 코드를 이해하고 수정하는 데 도움이 됩니다.

자바는 처음 배우는 사람들에게 타입에 대한 엄격한 이해를 요구하지만, 이는 강력한 프로그래밍 습관을 형성하는 데 도움이 됩니다. 따라서 자바를 배우는 과정에서 다양한 데이터 타입에 익숙해지고, 올바르게 사용하는 방법을 배우는 것이 중요합니다.

  
### 목록(9h)
- 환경 설정
- 자료형과 변수
- 연산자
- 문자열
- 제어문
- 배열
- 메소드

## 자바 기초 - 2회차

#### 기본 데이터 타입
자바의 기본 데이터 타입에는 다음과 같은 종류가 있습니다:
  
1. **문자열(String)과 문자(char)**
   - `String`: 문자열을 저장하며, 긴 텍스트를 다룰 때 사용합니다.
   - `char`: 단일 문자를 저장하며, 작은 따옴표(')로 둘러싸인 단일 문자를 표현합니다.

2. **숫자 데이터 타입**
   - `int`: 일반적인 크기의 정수를 저장합니다. 예: `int age = 30;`
   - `long`: 더 큰 정수를 저장할 때 사용합니다. 예: `long distance = 12345678901L;`
   - `double`: 정밀한 실수를 저장할 때 사용하며, 기본적으로 실수는 `double`로 처리됩니다. 예: `double pi = 3.14159;`
   - `float`: 덜 정밀한 실수를 저장하며, 메모리를 덜 사용합니다. 숫자 뒤에 'f'나 'F'를 붙여 표시합니다. 예: `float height = 5.9f;`

3. **Boolean**
   - `boolean`: `true` 또는 `false` 값을 가집니다. 조건문과 논리 연산에 주로 사용됩니다.
  
  
#### 변수 선언 및 초기화
자바에서 변수를 선언할 때는 데이터 타입을 명시해야 합니다. 변수 선언 후에, 값을 초기화할 수 있습니다. 초기화는 변수 선언 시점에 할 수도 있고, 나중에 할 수도 있습니다.

java 에서는 변수를 설정할 때 해당 "데이터 타입 + 변수이름;"으로 변수를 먼저 설정해준다.  
이후 "=" 로 직접 선언한 곳에서 데이터를 넣어도 되지만 이후 "변수명 = 데이터값;"로 변수를 넣수있다.

```java
int myNumber;      // 변수 선언
myNumber = 10;     // 변수 초기화

String myString = "Hello World"; // 변수 선언 및 초기화 동시에
```
  
## 자바 기초 - 3회차

### 변수 이름 짓는 법
자바에서 변수 이름을 짓는 것은 중요한 작업 중 하나입니다. 변수 이름은 다음과 같은 규칙을 따라야 합니다:

1. **저장할 값에 어울리는 이름**: 변수의 용도를 명확하게 나타내는 이름을 사용해야 합니다. 잘못된 이름은 혼란을 야기할 수 있습니다.
2. **문자, 숫자, 밑줄 사용**: 변수 이름에는 문자(`a-z`, `A-Z`), 숫자(`0-9`), 밑줄(`_`)을 사용할 수 있으나, 공백은 사용할 수 없습니다.
3. **시작 문자**: 변수 이름은 밑줄이나 문자로 시작해야 하며, 숫자로 시작할 수 없습니다.
4. **단어 조합**: 한 단어 또는 두 개 이상의 단어를 연결하여 사용할 수 있습니다.
5. **카멜 케이스 사용**: 첫 단어를 제외한 각 단어의 첫 글자는 대문자로 시작합니다. 예: `myVariable`, `currentSpeed`.
6. **예약어 사용 금지**: `public`, `static`, `void`, `int` 등의 예약어는 변수 이름으로 사용할 수 없습니다.
7. **상수는 대문자로**: 변경되지 않는 상수는 대문자로 표기합니다. 예: `MAX_HEIGHT`.

### 상수
상수는 `final` 키워드를 사용하여 선언합니다. 상수는 한 번 값이 할당되면 그 값을 변경할 수 없습니다.

```java
final int MAX_SPEED = 120;
```

### 형변환
형변환은 하나의 데이터 타입을 다른 데이터 타입으로 변환하는 것입니다. 다양한 형변환 방법이 있습니다:

- 정수형 → 실수형: `(float)변수`, `(double)변수`
- 실수형 → 정수형: `(int)변수`
- 숫자 → 문자열: `String.valueOf(변수)`, `Integer.toString(변수)`, `Double.toString(변수)`
- 문자열 → 숫자: `Integer.parseInt(문자열)`, `Double.parseDouble(문자열)` 

### 산술 연산자
자바에서는 다양한 산술 연산자를 사용할 수 있습니다:

- 일반 연산: `+`, `-`, `*`, `/`, `%`
- 우선 순위 연산: 괄호 `()`를 사용하여 연산 순서를 정할 수 있습니다.
- 변수를 이용한 연산: 변수에 값을 할당하고 연산을 수행할 수 있습니다.

```java
int a = 20;
int b = 10;
int c = a + b;
System.out.println(c); // 30
```

- 증감 연산자: `++`, `--`를 사용하여 값을 1씩 증가시키거나 감소시킵니다. `x++`는 출력 후 증가, `++x`는 증가 후 출력합니다.

자바 프로그래밍에서 이러한 개념들을 이해하고 적절히 사용하는 것은 프로그램의 정확성과 가독성을 높이는 데 중요합니다.

## 자바 기초 - 4회차
### 대입 연산자
```java
int num = 10;
num = num + 2; // 12
num = num - 2; // 10
num = num * 2; // 20
num = num / 2; // 10
num = num % 2; // 0
```

### 복합 대입 연산자
복합 대입 연산자는 다른 연산(덧셈, 뺄셈 등)과 대입을 결합합니다.  
```java
int num = 10;
num += 2; // 12
num -= 2; // 10
num *= 2; // 20
num /= 2; // 10
num %= 2; // 0
```

### 비교 연산자
비교 연산자는 두 값이나 변수를 비교하고, 그 결과로 참(true) 또는 거짓(false)을 반환합니다.
- x > y : x가 y보다 크다.
- x >= y : x가 y보다 크거나 같다.
- x < y : x가 y보다 작다.
- x <= y : x가 y보다 작거나 같다.
- x == y : x와 y는 같다.
- x != y : x와 y는 다르다.

### 논리 연산자
논리 연산자는 참(true) 또는 거짓(false) 값을 가진 두 조건을 결합합니다.
1. ***AND 연산자***
   - 두 조건이 모두 참일 때만 참을 반환하는 논리 연산자,  만약 두 조건 중 하나라도 거짓이라면, AND 연산의 결과는 거짓(false)이 됩니다.
   - "&&" 로 표현
   ```java
   boolean a = true;
   boolean b = false;

   // 두 조건 모두 참일 때만 참 반환
   System.out.println(a && a); // true
   System.out.println(a && b); // false
   System.out.println(b && b); // false
   ```

2. ***OR 연산자***
   - 두 조건 중 하나라도 참일 때 참을 반환하는 논리 연산자, 두 조건 중 하나라도 참이면, OR 연산의 결과는 참(true)이 됩니다. 만약 두 조건 모두 거짓일 때만, OR 연산의 결과는 거짓(false)이 됩니다.
   - "||" 로 표현
   - 조건A || 조건B
   ```java
   boolean a = true;
   boolean b = false;

   // 두 조건 중 하나라도 참이면 참 반환
   System.out.println(a || a); // true
   System.out.println(a || b); // true
   System.out.println(b || b); // false
   ```

3. ***논리 부정 연산자***
   - 논리 부정 연산자(!)는 참(true)과 거짓(false)의 결과를 반대로 바꾸는데 사용됩니다. 이 연산자는 주로 불리언(boolean) 표현식에 적용되어, true를 false로, false를 true로 바꿉니다.
   ```java
   System.out.println(!true); // false
   System.out.println(!false); // true
   System.out.println(!(5 == 5)); // false
   System.out.println(!(5 == 3)); // true
   ```

### 삼항 연산자
간단한 조건문을 한 줄로 표현할 수 있는 연산자입니다. 삼항 연산자는 조건을 평가한 후 두 개의 가능한 결과 중 하나를 반환합니다. 기본 형식은 조건 ? 결과1 : 결과2입니다. 여기서 조건이 참(true)이면 결과1을 반환하고, 거짓(false)이면 결과2를 반환합니다.  
   - 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
   ```java
   int x = 3;
   int y = 5;
   int max = (x > y) ? x :y;
   System.out.println(max); // 5

   int min = (x < y) ? x : y;
   System.out.println(min); // 3

   boolean b = (x == y) ? true : false;
   System.out.println(b);

   String s = (x != y) ? "달라요" : "같아요";
   System.out.println(s);
   ```

### 문자열 함수
- length() : 문자열에 포함된 문자의 개수를 반환, 문자열의 길이는 0부터 시작하는 것이 아니라 실제 문자의 개수로 계산  
- toUpperCase() : 문자열에 있는 모든 문자를 대문자로 변환, 원본 문자열을 변경하지 않고, 새로운 대문자로 변환된 문자열을 반환  
- toLowerCase() : 문자열에 있는 모든 문자를 소문자로 변환,  원본 문자열을 변경하지 않고, 새로운 소문자로 변환된 문자열을 반환  
- contains() : 한 문자열이 다른 문자열에 포함되어 있는지 여부를 확인, 문자열에 포함되어 있으면 true를, 그렇지 않으면 false를 반환  
- indexOf("문자") :  주어진 문자열이 다른 문자열 내에서 처음으로 나타나는 위치의 인덱스를 반환, 특정 문자나 문자열이 시작되는 위치를 찾는 데 사용됩니다. 문자열의 인덱스는 0부터 시작합니다. 만약 주어진 문자열이 대상 문자열에 존재하지 않으면, indexOf() 메소드는 -1을 반환  
- lastIndexOf("문자") : 주어진 문자열이 다른 문자열 내에서 마지막으로 나타나는 위치의 인덱스를 반환, 특정 문자나 문자열이 마지막으로 등장하는 위치를 찾는 데 사용됩니다. 문자열의 인덱스는 0부터 시작합니다. 만약 주어진 문자열이 대상 문자열에 존재하지 않으면, lastIndexOf() 메소드는 -1을 반환  
- startsWith("문자") : 문자열이 특정 문자나 문자열로 ***시작하는지 여부***를 확인하는 데 사용, 문자열이 지정된 접두사로 시작하면 true를, 그렇지 않으면 false를 반환  
- endsWith("문자") : 문자열이 특정 문자나 문자열로 ***끝나는지 여부***를 확인하는 데 사용, 문자열이 지정된 접미사로 끝나면 true를, 그렇지 않으면 false를 반환  
- replace("기존문자","변경문자") : 문자열 내의 특정 문자 또는 문자열을 다른 문자 또는 문자열로 바꾸는 데 사용, 원본 문자열을 변경하지 않고, 변경된 새로운 문자열을 반환한다. 두 개의 인자를 받으며, 첫 번째 인자는 대체될 문자열, 두 번째 인자는 대체할 새로운 문자열입니다.  
- substring("시작 인덱스", "마지막 인덱스") : 문자열의 일부분을 추출하는 데 사용, 주어진 시작 인덱스에서 시작하여, 문자열의 끝까지 또는 지정된 종료 인덱스 전까지의 부분 문자열을 반환  
- trim() : 문자열의 시작과 끝에 있는 공백을 제거하는 데 사용됩니다. 이 메소드는 문자열 안쪽에 있는 공백은 제거하지 않고, 오직 시작과 끝의 공백만을 제거한다.  
- concat("문자") : 두 개의 문자열을 연결하는 데 사용, 호출하는 문자열의 끝에 매개변수로 전달된 문자열을 추가하여 새로운 문자열을 생성하고 반환  
  

## 자바 기초 - 5회차
### 문자열 비교
1. equals() 메서드를 사용한 문자열 비교
equals() 메서드는 두 문자열의 내용이 같은지를 비교합니다. 이 메서드는 문자열의 값 자체를 비교하기 때문에, 실제로 저장된 문자들이 같은지를 확인합니다.

```java
String s1 = "Java";
String s2 = "Python";

System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 fales
System.out.println(s1.equals("Java"));
System.out.println(s2.equals("python"));
System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용이 같은지 여부
```
예시에서 사용한 s1.equals(s2)는 s1과 s2 문자열의 내용이 같은지를 확인합니다. 첫 번째 예시에서 s1은 "Java", s2는 "Python"이므로, 이 비교는 false를 반환합니다. 반면에, s1.equals("Java")는 s1이 "Java"와 같은지를 비교하기 때문에 true를 반환합니다.

equalsIgnoreCase() 메서드는 equals()와 유사하지만 대소문자를 구분하지 않습니다. 예를 들어, s2.equalsIgnoreCase("python")은 s2가 "Python"이지만, 대소문자를 구분하지 않으므로 true를 반환합니다.

2. == 연산자를 사용한 문자열 비교
== 연산자는 두 객체의 참조가 같은지, 즉 두 객체가 메모리 상에서 같은 위치를 가리키고 있는지를 확인합니다. 이는 객체의 내용이 아닌, 객체가 저장된 메모리 주소를 비교합니다.
```java
s1 = "1234"; // 참조
s2 = "1234";
System.out.println(s1.equals(s2)); // true 내용을 비교
System.out.println(s1 == s2); //true -> 참조하는 것이 같은지

s1 = new String("1234");
s2 = new String("1234");
// s1 과 s2 가 다른 참조 이기 때문에 다르다.
System.out.println(s1.equals(s2)); // true -> 내용만 비교
System.out.println(s1 == s2); // false -> 참조가 다르기 때문에 다르다고 판단함
```

예를 들어, s1 = "1234"와 s2 = "1234"에서는 두 문자열이 같은 리터럴이므로 Java에서는 동일한 메모리 위치를 참조합니다. 따라서 s1 == s2는 true를 반환합니다. 그러나 s1 = new String("1234")와 s2 = new String("1234")에서는 new 키워드를 사용하여 각각 다른 객체를 생성합니다. 이 경우, 각 객체는 메모리 상에서 다른 위치를 차지하므로 s1 == s2는 false를 반환합니다.  

- 정리
equals()는 문자열의 내용을 비교하여 같으면 true, 다르면 false를 반환합니다. 대소문자를 구분합니다.
equalsIgnoreCase()는 대소문자를 구분하지 않고 문자열의 내용을 비교합니다.
== 연산자는 두 문자열 객체의 메모리 주소를 비교합니다. 내용이 같더라도 다른 객체라면 false를 반환합니다.
이러한 차이점을 이해하는 것은 Java 프로그래밍에서 매우 중요합니다. 문자열을 비교할 때, 내용의 동등성을 확인하려면 equals()를 사용하고, 객체 참조의 동일성을 확인하려면 ==를 사용해야 합니다.

### 특수 문자
- \n: 줄바꿈(New Line)
이스케이프 문자 \n은 새로운 줄로 이동하는 효과를 가집니다. 예를 들어, "자바가\n너무\n재미있어요"에서 \n은 각 단어를 새로운 줄에 출력하도록 합니다.
  
- \t: 탭(Tab)
\t는 탭 키를 누른 것과 같은 공백을 만듭니다. 이는 텍스트를 일정한 간격으로 정렬할 때 유용합니다. 예시로 "해물파전\t9000원"에서 \t는 "해물파전"과 "9000원" 사이에 탭 크기의 공백을 삽입합니다.
  
- \\: 백슬래시(Backslash)
백슬래시는 이스케이프 문자를 시작하는 특수문자입니다. 그 자체를 표현하려면 \\를 사용해야 합니다. 예를 들어, "C:\\program Files\\Java"에서 \\는 실제 경로에서 사용되는 단일 백슬래시를 나타냅니다.
  
- \": 큰따옴표(Double Quote)
문자열 내에서 큰따옴표를 표현하려면 \"를 사용합니다. 예를 들어, "단비가 \"냐용~\" 이라고 했어요."에서 큰따옴표는 문자열의 일부로 출력됩니다.
  
- \': 작은따옴표(Single Quote)
작은따옴표를 문자열 내부에서 표현하려면 \'를 사용합니다. 예를 들어, "단비가 \'뭘 바?\' 라는 표정을 지었어요."에서 작은따옴표는 문자열의 일부로 출력됩니다.
  
#### 이스케이프 문자의 중요성
이스케이프 문자는 문자열 내에서 특수한 효과를 부여하거나, 보통의 텍스트로는 표현하기 어려운 문자를 표현하는 데 사용됩니다. 예를 들어, 줄바꿈이나 탭과 같은 공백 문자를 정확하게 표현하거나, 문자열 내에서 따옴표를 사용해야 할 때 매우 유용합니다.
  
Java와 같은 프로그래밍 언어에서 이스케이프 문자의 이해는 문자열을 더욱 효과적으로 다루는 데 필수적입니다. 이러한 문자들은 코드의 가독성을 높이고, 복잡한 문자열 형식을 간단하게 표현하는 데 도움을 줍니다.

## 자바 기초 - 6회차
### if 가정문
if 문은 특정 조건이 참(True)일 때만 코드 블록을 실행하는 기본적인 제어문입니다. 자바에서 if 문의 기본 구조는 다음과 같습니다:
```java
if (조건) {
    // 조건이 참일 때 실행될 코드
}
```
예시 : 
```java
int number = 10;

if (number > 5) {
    System.out.println("숫자는 5보다 큽니다.");
}

```
  
### if else
if-else 문은 if 문의 조건이 거짓(False)일 때 실행할 코드 블록을 추가할 수 있습니다. 구조는 다음과 같습니다:
```java
if (조건) {
    // 조건이 참일 때 실행될 코드
} else {
    // 조건이 거짓일 때 실행될 코드
}
```
예시 : 
```java
int age = 18;

if (age >= 20) {
    System.out.println("성인입니다.");
} else {
    System.out.println("미성년자입니다.");
}
```
  
### else if
else if 문을 사용하면 여러 조건을 순차적으로 테스트할 수 있습니다. else if는 if 뒤에 오며, 여러 개를 사용할 수 있습니다:
```java
if (조건1) {
    // 조건1이 참일 때 실행될 코드
} else if (조건2) {
    // 조건1이 거짓이고 조건2가 참일 때 실행될 코드
} else {
    // 모든 조건이 거짓일 때 실행될 코드
}
```
예시 :  
```java
int score = 75;

if (score >= 90) {
    System.out.println("A등급");
} else if (score >= 80) {
    System.out.println("B등급");
} else if (score >= 70) {
    System.out.println("C등급");
} else {
    System.out.println("D등급");
}
```
  
### Swith Case
switch 문은 변수가 어떤 값을 가지고 있는지에 따라 실행할 코드 블록을 결정하는 조건문입니다. switch 문은 여러 case 레이블을 가질 수 있으며, 변수의 값과 일치하는 case 레이블의 코드 블록을 실행합니다.  
구조:  
```java
switch (변수) {
    case 값1:
        // 변수가 값1과 일치할 때 실행될 코드
        break;
    case 값2:
        // 변수가 값2와 일치할 때 실행될 코드
        break;
    // 추가적인 case 레이블...
    default:
        // 어떤 case도 일치하지 않을 때 실행될 코드
}

```  
예시:  
```java
int day = 4;

switch (day) {
    case 1:
        System.out.println("월요일");
        break;
    case 2:
        System.out.println("화요일");
        break;
    case 3:
        System.out.println("수요일");
        break;
    case 4:
        System.out.println("목요일");
        break;
    case 5:
        System.out.println("금요일");
        break;
    case 6:
        System.out.println("토요일");
        break;
    case 7:
        System.out.println("일요일");
        break;
    default:
        System.out.println("잘못된 입력입니다.");
}

``` 
  
### For
for 문은 정해진 조건이 거짓이 될 때까지 코드 블록을 반복적으로 실행하는 루프 구조입니다.  
구조:  
```java
for (초기화; 조건; 증감) {
    // 반복될 코드
}
```  
예시:  
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i + "번째 반복");
}
``` 
  
### While
while 문은 주어진 조건이 참인 동안 코드 블록을 반복적으로 실행합니다.  
구조:  
```java
while (조건) {
    // 반복될 코드
}

```  
예시:  
```java
int i = 1;
while (i <= 5) {
    System.out.println(i + "번째 반복");
    i++;
}

``` 
  
### Do While
do-while 문은 먼저 코드 블록을 실행한 후 조건을 평가합니다. 이는 최소 한 번은 코드 블록이 실행됨을 보장합니다.  
구조:  
```java
do {
    // 반복될 코드
} while (조건);

```  
예시:  
```java
int i = 1;
do {
    System.out.println(i + "번째 반복");
    i++;
} while (i <= 5);

``` 
  
### 이중 반복문
이중 반복문은 한 반복문 안에 다른 반복문을 포함하는 구조입니다. 주로 2차원 배열이나 행렬과 같은 데이터 구조를 처리할 때 사용됩니다.  
예시:  
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println(i + ", " + j);
    }
}

``` 
  
### Break
break 문은 반복문(또는 switch 문)의 실행을 즉시 중단시키고 반복문 바깥의 다음 문장으로 이동합니다.   
예시:  
```java
for (int i = 1; i <= 10; i++) {
    if (i == 6) {
        break;
    }
    System.out.println(i);
}

```   
  
### Continue
continue 문은 반복문의 현재 반복을 즉시 종료하고 다음 반복으로 넘어갑니다.  
예시:  
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;
    }
    System.out.println(i);
}

``` 

## 자바 기초 - 7회차
### 배열
자바에서 배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루기 위해 사용하는 데이터 구조입니다. 배열을 사용하면 하나의 변수명으로 여러 데이터를 관리할 수 있어, 데이터 관리가 편리해집니다.  
  
#### 배열 생성법
자바에서 배열을 생성하는 방법은 여러 가지가 있습니다. 아래는 배열을 생성하는 네 가지 기본적인 방법입니다.  
```java
// 방법 1: 배열 선언 후 크기 할당
String[] array1 = new String[4];

// 방법 2: 배열 선언 방식의 변형
String array2[] = new String[4];

// 방법 3: 배열 선언과 동시에 초기화
String[] array3 = new String[] {"A", "B", "C", "D"};

// 방법 4: 배열 선언과 동시에 간단한 초기화
String[] array4 = {"A", "B", "C", "D"};

// 다른 자료형으로 배열 생성
int[] i = {1, 2, 3};
double[] d = {10.0, 11.2, 13.5};
boolean[] b = {true, false, true};
```
#### 배열 순환
배열의 각 요소에 접근하기 위해 'for' 루프 또는 'for-each' 루프를 사용할 수 있습니다.  
```java
// 일반적인 for 루프를 사용하여 배열 순환
for(int index = 0; index < array1.length; index++) {
    System.out.println(array1[index]);
}

// for-each 루프를 사용하여 배열 순환
for(String element : array4) {
    System.out.println(element);
}
```

#### 다차원 배열
자바에서는 2차원 이상의 다차원 배열도 사용할 수 있습니다. 가장 흔히 사용되는 다차원 배열은 2차원 배열입니다.
```java
// 2차원 배열 선언 및 초기화
int[][] twoDimArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

// 3차원 배열 예시
int[][][] threeDimArray = { {{1, 2}, {3, 4}}, {{5, 6}, {7, 8}} };

```

#### 다차원 배열 순황
다차원 배열을 순환할 때는 중첩된 for 루프를 사용합니다.
```java
// 2차원 배열 순환
for(int i = 0; i < twoDimArray.length; i++) {
    for(int j = 0; j < twoDimArray[i].length; j++) {
        System.out.print(twoDimArray[i][j] + " ");
    }
    System.out.println();
}

// 3차원 배열 순환
for(int i = 0; i < threeDimArray.length; i++) {
    for(int j = 0; j < threeDimArray[i].length; j++) {
        for(int k = 0; k < threeDimArray[i][j].length; k++) {
            System.out.print(threeDimArray[i][j][k] + " ");
        }
        System.out.println();
    }
    System.out.println();
}

```
### 아스키 코드
아스키 코드(ASCII, American Standard Code for Information Interchange)는 문자를 숫자로 변환하는 데 사용되는 표준 인코딩 시스템입니다. 자바에서 아스키 코드는 문자(char) 데이터 타입과 밀접하게 연관되어 있으며, 문자와 숫자 간의 변환에 자주 사용됩니다.
  
아스키 코드는 128개의 문자를 정의하고 있으며, 이 중 0부터 31까지는 제어 문자(Control Characters)로 사용되고, 32부터 127까지는 출력 가능한 문자(Printable Characters)로 사용됩니다.
  
대문자, 소문자, 숫자의 시작 번호
- 대문자('A'부터 'Z'): 아스키 코드에서 대문자는 65('A')부터 시작하여 90('Z')까지 할당되어 있습니다.
- 소문자('a'부터 'z'): 아스키 코드에서 소문자는 97('a')부터 시작하여 122('z')까지 할당되어 있습니다.
- 숫자('0'부터 '9'): 아스키 코드에서 숫자는 48('0')부터 시작하여 57('9')까지 할당되어 있습니다.
  
```java
public class AsciiExample {
    public static void main(String[] args) {
        // 대문자 A의 아스키 코드 값
        char upperCase = 'A';
        int asciiUpperCase = (int) upperCase;
        System.out.println("ASCII code of 'A': " + asciiUpperCase);

        // 소문자 a의 아스키 코드 값
        char lowerCase = 'a';
        int asciiLowerCase = (int) lowerCase;
        System.out.println("ASCII code of 'a': " + asciiLowerCase);

        // 숫자 0의 아스키 코드 값
        char number = '0';
        int asciiNumber = (int) number;
        System.out.println("ASCII code of '0': " + asciiNumber);
    }
}

```
이 예시 코드는 문자 'A', 'a', '0'의 아스키 코드 값을 출력합니다. 자바에서 이와 같이 간단한 타입 변환을 통해 문자의 아스키 코드 값을 얻을 수 있습니다.
  
아스키 코드는 문자열 처리나 암호화, 네트워크 통신 등 다양한 분야에서 활용됩니다. 기본적인 이해를 바탕으로, 실제 적용 사례를 통해 더 깊이있는 학습을 진행하는 것이 좋습니다.

## 자바 기초 - 8회차
### 메소드
메소드(Method)는 자바 프로그래밍에서 중요한 개념 중 하나입니다. 메소드는 특정 작업을 수행하는 독립적인 코드의 단위로, 프로그램 내에서 반복되는 작업을 효율적으로 처리할 수 있게 해줍니다. 메소드는 코드를 모듈화하고 재사용 가능하게 만들어, 프로그램의 구조를 개선하고 유지보수를 용이하게 합니다.

메소드의 주요 특징은 다음과 같습니다:
1. **캡슐화와 추상화**: 메소드는 복잡한 로직이나 작업을 캡슐화하여 이름을 통해 간단하게 호출할 수 있습니다. 이는 프로그램의 추상화 수준을 높여, 복잡성을 관리하는 데 도움을 줍니다.
2. **재사용성**: 한 번 정의된 메소드는 프로그램 내의 여러 위치에서 호출되어 사용될 수 있습니다. 이를 통해 코드의 중복을 줄이고 일관성을 유지할 수 있습니다.
3. **분할과 정복**: 큰 문제를 작은 부분으로 나누어 해결하는 분할과 정복 전략에 메소드가 기여합니다. 각 메소드는 프로그램의 한 부분의 작업을 담당하여, 전체 문제를 해결하는 데 기여합니다.
4. **테스트와 유지보수의 용이성**: 메소드 단위로 코드를 분리하면 각 부분을 독립적으로 테스트하고 디버그하기가 쉬워집니다. 이는 프로그램의 전체적인 안정성과 신뢰성을 향상시키는 데 기여합니다.

메소드는 특히 객체지향 프로그래밍에서 중요한 역할을 하며, 클래스의 행동과 기능을 정의하는 데 사용됩니다. 이러한 특징들은 프로그래밍을 더 효율적이고 관리하기 쉬운 작업으로 만들어줍니다.

이제, 메소드의 정의와 사용 방법에 대해 자세히 알아보겠습니다.  
#### 메소드 정의
자바에서 메소드는 특정 작업을 수행하는 코드 블록입니다. 메소드는 입력(파라미터), 출력(반환값)과 함께 특정 작업을 수행하며, 이를 통해 코드의 재사용성과 관리를 용이하게 합니다.
```java
public int add(int a, int b) {
    return a + b;
}
```
이 예시에서 `add`는 메소드 이름이고, `int a, int b`는 입력 파라미터, `int`는 반환값의 타입입니다.

#### 메소드 호출
메소드를 사용하기 위해서는 호출해야 합니다. 메소드 호출은 메소드의 이름과 필요한 파라미터를 사용하여 이루어집니다.
```java
int result = add(5, 3);
```
이 코드는 `add` 메소드를 호출하고, 그 결과를 `result` 변수에 저장합니다.

#### 파라미터
파라미터는 메소드에 전달되는 입력값입니다. 메소드는 하나 이상의 파라미터를 가질 수 있으며, 파라미터는 메소드 내에서 변수처럼 사용됩니다.
```java
public void greet(String name) {
    System.out.println("Hello, " + name);
}
```
여기서 `String name`은 `greet` 메소드의 파라미터입니다.

#### 반환값
반환값은 메소드가 수행한 후 결과를 호출자에게 돌려주는 값입니다. `return` 키워드를 사용하여 반환값을 지정합니다. 모든 메소드가 반환값을 가지는 것은 아니며, 반환값이 없는 경우 메소드 타입은 `void`입니다.

#### 메소드 오버로딩
메소드 오버로딩은 같은 이름의 메소드를 다른 파라미터 목록으로 정의하는 것입니다. 이를 통해 같은 기능을 수행하지만 다른 타입이나 파라미터 수를 가진 메소드를 생성할 수 있습니다.
```java
public void print(String message) {
    System.out.println(message);
}

public void print(int number) {
    System.out.println(number);
}
```
이 예시에서 `print` 메소드는 문자열과 정수 두 가지 형태로 오버로딩되었습니다.

#### 메소드가 필요한 이유
메소드는 코드의 재사용성, 유지보수성, 가독성을 향상시키는 데 필요합니다. 메소드를 사용하면 반복되는 코드를 줄일 수 있고, 복잡한 코드를 단순화하여 이해하기 쉽게 만들 수 있습니다.

#### Main 메소드
자바 프로그램은 `main` 메소드에서 시작합니다. `main` 메소드는 프로그램의 진입점(entry point)이며, 자바 런타임은 이 메소드를 통해 프로그램을 실행합니다.
```java
public static void main(String[] args) {
    // 프로그램 코드
}
```
`main` 메소드는 항상 `public static void`로 선언되며, `String[] args`는 커맨드 라인에서 입력된 파라미터를 받습니다.


### 변수의 범위

자바에서 변수의 범위(scope)는 해당 변수가 접근 가능하고 사용될 수 있는 코드의 영역을 말합니다. 변수의 범위는 변수가 선언된 위치에 따라 다릅니다.

#### 1. 지역 변수 (Local Variables)
```java
public void myMethod() {
    int localVar = 100; // 지역 변수 선언
    System.out.println(localVar);
}
```
- 지역 변수는 메소드, 생성자 또는 블록 안에서 선언됩니다.
- 선언된 블록이나 메소드 내에서만 접근 가능합니다.

#### 2. 인스턴스 변수 (Instance Variables)
```java
public class MyClass {
    int instanceVar; // 인스턴스 변수 선언

    public MyClass(int value) {
        this.instanceVar = value;
    }

    public void display() {
        System.out.println(instanceVar);
    }
}
```
- 클래스 내부에 선언되지만, 메소드, 생성자, 블록 외부에 위치합니다.
- 객체 생성 시에 생성되고, 객체가 소멸할 때까지 존재합니다.

#### 3. 클래스 변수 (Static Variables)
```java
public class MyClass {
    static int classVar = 10; // 클래스 변수 선언

    public static void displayStatic() {
        System.out.println(classVar);
    }
}
```
- `static` 키워드를 사용하여 클래스 내부에 선언됩니다.
- 클래스의 모든 인스턴스 간에 공유됩니다.

#### 4. 매개변수 (Parameters)
```java
public void myMethod(int param) { // 매개변수 param
    System.out.println(param);
}
```
- 메소드나 생성자에 전달되는 변수입니다.
- 해당 메소드 또는 생성자 내부로 범위가 제한됩니다.


[참조 유튜브](https://www.youtube.com/watch?v=NQq0dOoEPUM&list=WL&index=3&t=12131s)