// 오버라이딩(overriding) : 조상 클래스로부터상속받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 함.

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

public class overriding_inJAVA {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a.toOverriding());
        System.out.println(b.toOverriding());
    }
}
