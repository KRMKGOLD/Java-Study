class Tv {
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class TvTest{
    public static void main(String args[]){
        Tv[] tvArr = { new Tv(), new Tv(), new Tv() };
        /* Tv[] tvArr = new Tv[3];
            new Tv[0] = new Tv();
            new Tv[1] = new Tv();
            new Tv[2] = new Tv(); */
        // for(int i = 0; i < tvArr.length; i++) new Tv[i] = new Tv();

        for(int i = 0; i < tvArr.length; i++){
            tvArr[i].channel = (int)(Math.random() * 10 + 1);
            System.out.println("tvArr[" + (i + 1) + "]�� ä����" + tvArr[i].channel + "�Դϴ�.");
        }

        System.out.println();

        for(int i = 0; i < tvArr.length; i++){
            int j = (int)(Math.random() * 2); // 0 = UP, 1 = DOWN;
            if(j == 0){
                tvArr[i].channelUp();
                System.out.print("tvArr[" + (i + 1) +  "]�� ä���� 1 �ø��ϴ�.");
            }
            else if(j == 1) {
                tvArr[i].channelDown();
                System.out.print("tvArr[" + (i + 1) + "]�� ä���� 1 �����ϴ�.");
            }
            System.out.println("tvArr[" + (i + 1) + "]�� ä����" + tvArr[i].channel + "�Դϴ�.");
        }
    }
}