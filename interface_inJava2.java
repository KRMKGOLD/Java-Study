// 인터페이스의 장점
// 개발시간의 단축, 표준화의 가능
// 관계없는 클래스에 implements를 통해서 관계를 맺어줄 수 있음.
// 독립적인 프로그래밍이 가능하다.

// 인터페이스의 이해
// 1. 클래스를 사용하는 쪽(User)과 클래스를 제공하는 쪽(Provider)이 있음을 이해한다.
// 2. 메서드를 사용하는 쪽에서는 사용하려는 메서드의 선언부만 알 면 된다.

class A{
    public void methodA(B b) {
        b.methodB();
    }
}

class B{
    public void methodB() {
        System.out.println("methodB() ");
    }
}

public class interface_inJava2 {
    public static void main(String[] args) {
        A a = new A;
        a.methodA(new B());
    }
}

// A를 작성하기 위해서는 클래스 B가 작성되어있어야 했음 -> 만약 B가 변경되면 그에 맞게 A도 변경되어야 한다.
// 하지만 클래스 A가 클래스 B를 직접호출하지 않고, 인터페이스를 매게체로 한다면?
// 클래스 A는 인터페이스를 통해 B에 접근하기 때문에, B에 변경사항이 생기거나 클래스 B와 같은 기능의 다른 클래스로 대체 되어도, 클래스 A는 영향받지 않는다.