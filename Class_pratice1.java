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
            System.out.println("tvArr[" + (i + 1) + "]의 채널은" + tvArr[i].channel + "입니다.");
        }

        System.out.println();

        for(int i = 0; i < tvArr.length; i++){
            int j = (int)(Math.random() * 2); // 0 = UP, 1 = DOWN;
            if(j == 0){
                tvArr[i].channelUp();
                System.out.print("tvArr[" + (i + 1) +  "]의 채널을 1 올립니다.");
            }
            else if(j == 1) {
                tvArr[i].channelDown();
                System.out.print("tvArr[" + (i + 1) + "]의 채널을 1 내립니다.");
            }
            System.out.println("tvArr[" + (i + 1) + "]의 채널은" + tvArr[i].channel + "입니다.");
        }
    }
}