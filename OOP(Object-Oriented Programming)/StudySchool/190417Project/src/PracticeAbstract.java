abstract class Bird {
    public abstract void sing();
    public abstract void fly(int height);
}

class Owl extends Bird {
    @Override
    public void sing() {
        System.out.println("Hoot hoot!");
    }

    @Override
    public void fly(int height) {
        System.out.printf("부엉이는 %dm 날 수 있습니다.", height);
    }
}

abstract class Chicken extends Bird {
    @Override
    public void sing() {
        System.out.println("Koke koke!");
    }
}