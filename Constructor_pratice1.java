// 복습

// Constructor(생성자) : 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드
// 생성자는 인스턴스 변수 초기화 작업에 주로 사용되며, 인스턴스 생성 시에 실행되어야 할 작업을 위해서도 사용됨.

// 조건 1 : 생성자의 이름은 클래스의 이름과 같아야 한다.
// 조건 2 : 생성자는 리턴 값이 없음.

class Constructor{
    Constructor(){ // 생성자
        System.out.println("---- Call Constructor()! ----");
    }
    Constructor(int a, int b){
        System.out.println("---- Call Constructor(a, b)! ----");
        System.out.println(a + b);
    }
}

// this(), this
// 클래스 안에서 생성자 간에도 서로 호출이 가능한데, 조건이 있음
// 조건 1 : 생성자의 이름으로 클래스이름 대신 this를 사용.
// 조건 2 : 한 생성자에서 다른 생성자를 호출할 때에는 반드시 첫 줄에서만 호출 가능.

class thisClass{

    thisClass(){
        System.out.println("Call thisClass()...");
    }
    thisClass(String name){
        this();
        // this(); 생성자 내에서 다른 생성자를 선언하기 위해서는 첫 번째 줄에서만 선언이 가능하다.

        // 첫 줄에서만 호출이 가능한 이유는 생성자 내에서 초기화 작업도중 다른 생성자를 호출하면
        // 다른 생성자에서도 멤버변수 값을 초기화를 하므로, 이전의 초기화 작업이 무의미해질수도 있음.
    }
}

class studentClass{
    String name;
    int age;
    int grade;

    studentClass() { this("null", 0, 0); }

    studentClass(String name){ this(name, 0, 0); }

    studentClass(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade; // 클래스의 멤버변수는 this를 이용해 불러온다.
    }
}

public class prClass {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(10, 20);
    }
}