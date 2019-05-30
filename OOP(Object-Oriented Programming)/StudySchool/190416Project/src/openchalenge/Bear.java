package openchalenge;

import java.util.Random;
import java.util.Scanner;

public class Bear extends GameObject {
    public Bear(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    @Override
    public void move() {
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextLine().charAt(0)) {
            case 'w': // 앞쪽
                if (x == 0) { // OutOfBounds 발생, 다른 3가지 경우 중 랜덤으로 제시.
                    switch (new Random().nextInt(3)) {
                        case 0:
                            x += distance;
                            break;
                        case 1:
                            y -= distance;
                            break;
                        case 2:
                            y += distance;
                            break;
                    }
                    break;
                }
                x -= distance;
                break;
            case 's': // 뒤쪽
                if (x == 9) {
                    switch (new Random().nextInt(3)) {
                        case 0:
                            x -= distance;
                            break;
                        case 1:
                            y -= distance;
                            break;
                        case 2:
                            y += distance;
                            break;
                    }
                    break;
                }

                break;
            case 'a': // 왼쪽
                if (y == 0) {
                    switch (new Random().nextInt(3)) {
                        case 0:
                            x += distance;
                            break;
                        case 1:
                            x -= distance;
                            break;
                        case 2:
                            y += distance;
                            break;
                    }
                    break;
                }
                y -= distance;
                break;
            case 'd': // 오른쪽
                if (y == 19) {
                    switch (new Random().nextInt(3)) {
                        case 0:
                            x += distance;
                            break;
                        case 1:
                            x -= distance;
                            break;
                        case 2:
                            y -= distance;
                            break;
                    }
                    break;
                }
                y += distance;
                break;
        }
    }

    @Override
    public String getShape() {
        return "■";
    }
}
