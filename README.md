# learnJava

## 객체, 클래스

1. Class_pratice1.java : TV의 기능을 이용한 객체와 클래스 연습 java 프로그램.

2. Constructor_pratice1.java : 생성자 사용법 정리(복습)

```java
class Constructor{
    Constructor(){ // 생성자
        System.out.println("---- Call Constructor()! ----");
    }
    Constructor(int a, int b){
        System.out.println("---- Call Constructor(a, b)! ----");
        System.out.println(a + b);
    }
}
```

3. Constructor_pratice2.java : 생성자를 이용한 인스턴스의 복습 (not clone() )

```java
 Student(Student student){
        name = student.name;
        engGrade = student.engGrade;
        mathGrade = student.mathGrade;
    }
```

4. Initalization_pratice.java : JAVA에서 사용되는 초기화 방식

   ```
   명시적 초기화(explicit initialization)
   생성자(construcutor)
   초기화 블럭(initalization block)
   ```
