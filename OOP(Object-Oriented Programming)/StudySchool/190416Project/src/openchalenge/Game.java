package openchalenge;

import java.util.Random;

import static java.lang.System.exit;

public class Game {
    public static void main(String[] args) {
        String[][] gameUI = new String[10][20];

        for (int i = 0; i < gameUI.length; i++) {
            for (int j = 0; j < gameUI[0].length; j++) {
                gameUI[i][j] = "□";
            }
        }

        Bear bear = new Bear(new Random().nextInt(10), new Random().nextInt(20), 1);
        Fish fish = new Fish(new Random().nextInt(10), new Random().nextInt(20), 1);

        while (fish.x == bear.x && fish.y == bear.y) {
            fish.x = new Random().nextInt(10);
            fish.y = new Random().nextInt(20);
        }

        gameUI[fish.x][fish.y] = fish.getShape();
        gameUI[bear.x][bear.y] = bear.getShape();

        while (true) {
            for (int i = 0; i < 5; i++) {
                int[] randArray = {0, 0, 0, 0, 0};

                int temp = 0;
                while (temp != 3) {
                    int tempIndex = new Random().nextInt(5);

                    if(randArray[tempIndex] == 0){
                        randArray[tempIndex] = 1;
                    }
                    else
                        continue;
                    temp++;
                }

                for (int index = 0; index < gameUI.length; index++) {
                    for (int j = 0; j < gameUI[0].length; j++) {
                        System.out.print(gameUI[index][j]);
                    }
                    System.out.println();
                }

                gameUI[fish.x][fish.y] = "□";
                gameUI[bear.x][bear.y] = "□";

                System.out.println();
                System.out.print("입력 : ");

                bear.move();
                if (randArray[i] == 0)
                    fish.move();

                if (bear.collide(fish)) {
                    System.out.println("게임 종료!");
                    exit(0);
                }

                gameUI[fish.x][fish.y] = fish.getShape();
                gameUI[bear.x][bear.y] = bear.getShape();
            }

        }
    }
}