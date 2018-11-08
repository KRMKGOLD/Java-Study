// 명시적 초기화(explicit initialization)이란?
// 변수를 선언과 동시에 초기화하는 방법.

int num = 10 // 기본형 변수의 초기화
Box b = new Box(); // 참조형 변수의 초기화

// 초기화하는 경우가 복잡해지는 경우에는?
// 초기화블록은 명시적 초기화만으로는 초기화 작업이 복잡해질 때 초기화 블록을 사용한다.

class initblock{
    static { /* 클래스 초기화 블록 */ }
    { /* 인스턴스 초기화블록 */ }
}

// 클래스 초기화블록은 클래스가 메모리에 처음 로딩될때 한 번 수행
// 인스턴스 초기화블럭은 인스턴스 생성시 처음 실행

public class initblock_inJAVA {
    static { System.out.println("Class init..."); }
    { System.out.println("Instance init..."); }

    initblock_inJAVA(){
        System.out.println("Call Constructor...");
    }

    public static void main(String[] args) {
        System.out.println("인스턴스1 할당 전... ");
        initblock_inJAVA initblock_inJAVA1 = new initblock_inJAVA();
        System.out.println("인스턴스1 할당 후... ");

        System.out.println("인스턴스2 할당 전... ");
        initblock_inJAVA initblock_inJAVA2 = new initblock_inJAVA();
        System.out.println("인스턴스2 할당 후... ");
    }
}

// 멤버변수의 초기화 시기 순서를 정리

// 클래스변수의 초기화시점 : 클래스 처음 로딩 때 단 1회 초기화
// 클래스변수의 초기화순서 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
// 인스턴스변수의 초기화시점 : 인스턴스가 생성될 때마다 각 인스턴스 별로 초기화가 이루어진다.
// 인스턴스변수의 초기화순서 : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
