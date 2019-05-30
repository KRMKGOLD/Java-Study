import java.util.Date;

public class Presentation {
    public static void main(String[] args) {
        TestClass a = new TestClass();
        TestClass b = new TestClass();

        System.out.println(a.equals(b));
        // Object.equals 는 주소값으로 비교한다, 즉 새로운 객체를 생성한 후 비교하면 false 를 뱉는다.

        Date today = new Date();

        System.out.println(today.hashCode());
        // Object.hashCode()는 객체의 메모리 번지를 이용하여 해시코드를 만들어서 리턴한다.
        // hashCode()로 native call을 하여 Memory에서 가진 해쉬 주소값을 출력합니다.

        System.out.println(a.toString());
        System.out.println(today.toString());
        // Object.toString()은 객체의 문자적인 표현을 반환한다. Object 클래스의 toString 은 오버라이딩 해서 사용하기를 권장한다.

//         System.out.println(a.clone());
        System.out.println(today.clone());
        // Object.clone()은 객체의 복사본을 생성하여 반환한다.

        System.out.println(today.getClass());
        System.out.println(today.clone().getClass());
        // x.clone() != x - 복사된 객체와 원래 객체는 다른 객체이다
        // x.clone().getClass() == x.getClass() - 원본과 복사본 객체의 클래스는 같다.
    }
}
