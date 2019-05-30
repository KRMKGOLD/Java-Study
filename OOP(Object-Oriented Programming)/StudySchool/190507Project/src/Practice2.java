@FunctionalInterface
interface TestInterface {
    void sayHello();
}

@FunctionalInterface
interface TestInterface2 {
    void sayNumber(int a);
}

@FunctionalInterface
interface TestInterface3 {
    int returnNumber(int a);
}

 @FunctionalInterface
 interface TestInterface4 {
     void sayHello();
     int sayNumber(int a);
 }

public class Practice2 {
    public static void main(String[] args) {
        TestInterface testInterface = () -> System.out.println("Say Hello!");
        TestInterface2 testInterface2 = (a) -> System.out.println("Say " + a + "!");
        TestInterface3 testInterface3 = a -> {
            return 500;
        };
        // 람다 사용
    }
}

// 람다 사용법
// 람다형의 매개인자 자료형은 생략이 가능하다.
// TestInterface2 testInterface2 = (int a) -> { System.out.println("Say " + a + "!"); };
// TestInterface2 testInterface2 = (a) ->  { System.out.println("Say " + a + "!"); };
// 매개인자가 1개이면 소괄호 생략이 가능하다
// TestInterface2 testInterface2 = (a) -> { System.out.println("Say " + a + "!"); };
// TestInterface2 testInterface2 = a -> { System.out.println("Say " + a + "!"); };
// 실행문이 하나면 중괄호 생략도 가능하다.
// TestInterface2 testInterface2 = (a) -> { System.out.println("Say " + a + "!"); };
// TestInterface2 testInterface2 = (a) -> System.out.println("Say " + a + "!");
// 실행문이 한 개이면서 return문이라면, 중괄호와 return을 생략 가능
// TestInterface3 testInterface3 = a -> { return 500; };
// TestInterface3 testInterface3 = a -> 500;

// 람다문 : 추상 메서드가 한 개인 인터페이스를 쉽게 구현해서 사용하는 문법