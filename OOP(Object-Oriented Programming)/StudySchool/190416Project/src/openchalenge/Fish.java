package openchalenge;

import java.util.Random;

public class Fish extends GameObject {
    public Fish(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    @Override
    public void move() {
        switch (new Random().nextInt(4)) {
            case 0: // 앞쪽
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
            case 1: // 뒤쪽
                if (x == 9) { // OutOfBounds 발생, 다른 3가지 경우 중 랜덤으로 제시.
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
                x += distance;
                break;
            case 2: // 왼쪽
                if (y == 0) { // OutOfBounds 발생, 다른 3가지 경우 중 랜덤으로 제시.
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
            case 3: // 오른쪽
                if (y == 19) { // OutOfBounds 발생, 다른 3가지 경우 중 랜덤으로 제시.
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
        }
    }

    @Override
    public String getShape() {
        return "★";
    }
}
