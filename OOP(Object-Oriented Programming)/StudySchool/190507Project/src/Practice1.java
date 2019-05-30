interface Test1 {
    void testA();
}

class TestImpl implements Test1 {
    @Override
    public void testA() {
        System.out.println("직접 클래스 구현");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        TestImpl testImpl = new TestImpl();
        testImpl.testA();

        Test1 test1_1 = new Test1() {
            @Override
            public void testA() {
                System.out.println("익명 구현 객체");
            }
        };
        test1_1.testA();

        Test1 test1_2 = () -> System.out.println("람다 구현");
        test1_2.testA();
    }
}
