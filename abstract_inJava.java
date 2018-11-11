// 추상 클래스(abstract class)
// 추상 클래스는 추상 메소드를 포함한 클래스.

// 추상 메서드(abstract method)
// 추상 클래스와 같이 키워드 abstract를 앞에 붙혀 주고, 추상메서드는 구현부가 없으니 ';'로 끝내준다

abstract class useAbstract{
    abstract void sum(int a, int b);
    abstract void minus(int a, int b);
}

// 추상클래스를 상속받는 자손 클래스는 오버라이딩을 통해 조상인 추상클래스의 추상메서드를 모두 구현해주어야 한다.
// 만약, 추상 클래스를 상속받은 클래스에서 모든 추상 클래스를 구현하지 않았을 경우, 그 클래스도 추상클래스로 사용해야 한다.

class extendAbstractClass1 extends useAbstract{
    void sum(int a, int b) { }
    void minus(int a, int b) { }
}

abstract class extendAbstractClass2 extends useAbstract{
    void sum(int a, int b) { }
}

public class abstract_inJava {
    public static void main(String[] args) {

    }
}
