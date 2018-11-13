// 제어자(modifier)
// 제어자란 클래스, 변수 또는 메서드의 선언부에 함께 사용되어 부가적인 의미를 부여하는 것.
// 접근 제어자와 그 외의 제어자로 구분할 수 있다.

// 접근 제어자 : public, protected, default, private
// 그 외 : static, final, abstract, native, transient, synchronized, volatile, strictfp


// 1. static
// static : '클래스의' 또는 '공통적인' 이라는 뜻을 가짐.
// static은 멤버변수와 메소드, 그리고 초기화 블럭은 인스턴스가 아닌 클래스의 관계된 것이기 대문에 인스턴스를 사용하지 않고도 사용이 가능하다.

class useStaitc{
    static int width = 200;
    static int height = 300;
    int width_notStatic = 300;

    static { } // 클래스 초기화 블록

    static int max(int a, int b) { return a > b ? a : b; }
}

// 2. final
// final : '마지막의', '변경될 수 없는'의 의미를 가짐.
// 변수에 사용되면 값을 변경할 수 없는 상수가 되며, 메소드에 사용되면 오버라이딩을 하지 못하며, 클래스에 사용하면 자신을 확장할 수 없다.

final class finalClass1{ }

// class extends_finalClass1 extends finalClass1 {} - Error

class finalClass2{
    int a = 100;
    final int b = 100;

    // void changeB { b = 300; } - Error
    final int getA(){ return a; }
}

class finalMethod extends finalClass2{
    // final int getA(){ } - Error
}

// 3. abstract
// abstract : '추상의', '미완성의'
// 메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상 메서드를 이용하기 위해 사용하는 접근자
// - abstract_inJava.java

abstract class className{
    // ...
}

public class modifier_inJava {
    public static void main(String[] args) {

    }
}
