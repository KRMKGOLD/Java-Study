# learnJava

## 객체, 클래스

1. Class_pratice1 : TV의 기능을 이용한 객체와 클래스 연습 java 프로그램.

2. Constructor_pratice1 : 생성자 사용법 정리(복습)

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

3. Constructor_pratice2 : 생성자를 이용한 인스턴스의 복습 (not clone() )

```java
 Student(Student student){
        name = student.name;
        engGrade = student.engGrade;
        mathGrade = student.mathGrade;
    }
```

4. Initalization_pratice : JAVA에서 사용되는 초기화 방식

   ```
   명시적 초기화(explicit initialization)
   생성자(construcutor)
   초기화 블럭(initalization block)
   ```

5. extend_inJAVA : JAVA의 상속

```java
class grade{ }
class student extends grade{ }
```

6. overriding_inJAVA1, 2 : JAVA의 오버라이딩

```java
class A{
    String toOverriding(){
        return "not Overriding!";
    }
}

class B extends A{
    String toOverriding() {
        return "Overriding!";
    }
}
```

7. super_inJava : super() 사용법

```java
class withOverriding{
    int x, y;

    String getLocation() { return "x : " + x + ", y : " + y; }
}

class extend_withOverridingClass extends withOverriding{
    int z;

    String getLocation() {
        // return "x : " + x + ", y : " + y + ", z : " + z;
        return super.getLocation()+ ", z : " + z;
    }
}
```

8. modifier_inJava : 제어자 사용법

```java
// static
static int width = 200;
// final
final class finalClass1{ }
// abstract -> abstract_inJAVA
abstract class className{
```

9. abstract_inJava : 추상 클래스 사용법 1

```java
abstract class useAbstract{
    abstract void sum(int a, int b);
    abstract void minus(int a, int b);
}

abstract class extendAbstractClass2 extends useAbstract{
    void sum(int a, int b) { }
}

class extendAbstractClass1 extends useAbstract{
    void sum(int a, int b) { }
    void minus(int a, int b) { }
}
```

10. interface_inJava : 인터페이스의 작성 / 상속 / 구현

```java
abstract class abstact_Monster implements Character{
    public void attack(String toAttackName) {
        //
    }
}
```

11. interface_inJava2 : 인터페이스의 이해

```java
// A를 작성하기 위해서는 클래스 B가 작성되어있어야 했음 -> 만약 B가 변경되면 그에 맞게 A도 변경되어야 한다.
// 하지만 클래스 A가 클래스 B를 직접호출하지 않고, 인터페이스를 매게체로 한다면?
// 클래스 A는 인터페이스를 통해 B에 접근하기 때문에, B에 변경사항이 생기거나 클래스 B와 같은 기능의 다른 클래스로 대체 되어도, 클래스 A는 영향받지 않는다.
```

12. defaultMethod_inJava : 디폴트 메서드의 이해	
13. innerClass_inJava : 내부 클래스의 이해 (분리작성)