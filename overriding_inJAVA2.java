// 오버라이딩 조건
// 조건 1 : 이름이 같아야 한다
// 조건 2 : 매개변수가 같아야 한다
// 조건 3 : 반환타입이 같아야 한다

// 선언부가 일치해야 하지만, 접근 제어자와 예외는 제한된 조건 하에서만 다르게 변경이 가능하다.

import java.io.IOException;
import java.sql.SQLException;

class C{
    void method() throws IOException, SQLException{
        //
    }
}

class D extends C{
    void method() throws /* Exception */ IOException{
        //
    }
}

// 조상 클래스의 메소드를 자손 그래스에서 오버라이딩 할 때의 조건
// 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없음.
// 예외(Exception)은 조상 클래스의 메서드보다 많이 선언할 수 있다.
// 인스턴스메소드를 static메소드로, 또는 그 반대로는 변경할 수 없다.

public class overriding_inJAVA2 {
    public static void main(String[] args) {
        //
    }
}
