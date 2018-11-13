// 디폴트 메서드
// 조상 클래스에 새로운 메서드를 추가하는 것은 별 일이 아니지만, 인터페이스의 경우에는 보통 큰 일이 아니다.
// 인터페이스에 새로운 메서드를 추가하는 것은 추상 메소드를 만드는 것
// 인터페이스를 구현한 기존의 클래스들이, 이 메서드를 작성해줘야 하기 때문에 디폴드 메서드를 사용.

interface default_inInterFace{
    void method();

    default void newMethod() { }
    // default 메소드를 추가하는 대신, 다른 메서드와 이름이 겹치면?
    // 1. (여러 인터페이스에서 디폴트 메서드간의 충돌) - 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩한다.
    // 2. (디폴트 메서드와 조상 클래스의 메서드 간의 충돌) - 조상 클래스의 메서드가 사용되고, 디폴트 메서드는 무시된다.
}

public class defaultMethod_inJava {
    public static void main(String[] args) {

    }
}
