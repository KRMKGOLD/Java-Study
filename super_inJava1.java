// super()은 자속 클래스에서 조상 클래스에서 상속받은 멤버를 참조하는데 사용되는 참조 변수이다.
// 멤버변수와 지역변수의 이름이 같을 때 this를 사용하듯이, 상속받은 멤버와 자식의 클래스에 정의된 멤버의 이름이 같으면 super를 사용해 구별한다.

class Parent1{
    int x = 10;
}

class Child1 extends Parent1 {
    void method(){
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x); // x == this.x == super.x 모두 Parent의 x값을 의미함.
    }
}

class Parent2{
    int x = 10;
}

class Child2 extends Parent2{
    int x = 20;
    void method(){
        System.out.println("x = " + x); // Child2의 x(20)
        System.out.println("this.x = " + this.x); // Child2의 x(20) this.x라서.
        System.out.println("super.x = " + super.x); // 상속한 Child1의 x(10), super 사용
    }
}

class withOverriding{
    int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    String getLocation() { return "x : " + x + ", y : " + y; }
}

class extend_withOverridingClass extends withOverriding{
    int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void setXY_byWithOverriding(withOverriding w){
        this.x = w.x;
        this.y = w.y;
    }

    String getLocation() {
        // return "x : " + x + ", y : " + y + ", z : " + z;
        return super.getLocation()+ ", z : " + z;
    }
}

public class super_inJava1{
    public static void main(String[] args) {
        withOverriding OverRiding1 = new withOverriding();
        extend_withOverridingClass Extend_overriding1 = new extend_withOverridingClass();

        OverRiding1.setX(100);
        OverRiding1.setY(200);

        Extend_overriding1.setXY_byWithOverriding(OverRiding1);
        Extend_overriding1.setY(300);
        Extend_overriding1.setZ(500);

        System.out.println(OverRiding1.getLocation());
        System.out.println(Extend_overriding1.getLocation());
    }

}
