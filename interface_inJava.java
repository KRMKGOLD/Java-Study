// 인터페이스(interface)
// 인터페이스는 일종의 추상클래스로, 추상클래스보다 추상화정도가 높아 몸통을 가진 메서드와 멤버변수를 가질 수 없다.
// 추상 메서드에는 구현되어있는 일반 메서드를 넣을 수 있으나, interface는 불가능.

// 모든 멤버변수는 psf(public static final)이어야 하고, 모든 메서드는 public abstract여야 한다.
// JDK1.8부터 static 메서드와 디폴트 메서드는 제외.
interface Shape{
    public static final int SPADE = 4;
    static int DIAMOND = 3; // public static final int CLOVER = 3;
    final int HEART = 2; // public static final int HEART = 2;
    int CLOVER = 1; // public static final int = 1;

    public abstract String getCardNumebr();
    String getCardKind(); // public abstract String getCardKind();
    // 생략된 제어자는 컴파일 시 컴파일러가 자동적으로 추가해 준다.
}

// 인터페이스는 인터페이스만 상속받을 수 있고, 다중 상속이 가능하다.

interface doMove{
    void move(int x, int y);
}

interface doAttack{
    void attack(String toAttackName);
}

interface Character extends doMove, doAttack{
    //
}

// 인터페이스의 구현(implemnets)

class Monster implements Character{
    public void move(int x, int y) {
        //
    }
    public void attack(String toAttackName) {
        //
    }
}

abstract class abstact_Monster implements Character{
    public void attack(String toAttackName) {
        //
    }
}

// 상속과 구현을 동시에 할 수도 있다.
// class A extends Monster implements Character { }

public class interface_inJava {
    public static void main(String[] args) {

    }
}
