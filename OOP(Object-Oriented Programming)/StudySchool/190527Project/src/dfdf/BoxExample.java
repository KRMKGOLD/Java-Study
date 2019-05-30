package dfdf;

public class BoxExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObject("홍길동");
        String name = (String) box.getObject();

        box.setObject(new Apple());
        Apple apple = (Apple) box.getObject();

    }
}
