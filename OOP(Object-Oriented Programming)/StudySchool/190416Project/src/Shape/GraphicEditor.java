package Number12;

import java.util.Scanner;

import static java.lang.System.exit;

public class GraphicEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape firstShape = new Shape();

        System.out.println("그래픽 에디터 beauty를 실행합니다.");

        while (true) {
            int num;

            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            num = scanner.nextInt();

            switch (num) {
                case 1: {
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    int data = scanner.nextInt();

                    Shape shape = null;

                    switch (data) {
                        case 1:
                            shape = new Line();
                            break;
                        case 2:
                            shape = new Rect();
                            break;
                        case 3:
                            shape = new Circle();
                            break;
                    }

                    Shape tempShape = firstShape;

                    while (true) {
                        if (tempShape == null) {
                            firstShape = shape;
                        } else if (tempShape.getNext() == null) {
                            tempShape.setNext(shape);
                            break;
                        } else {
                            tempShape = tempShape.getNext();
                        }
                    }
                    break;
                }
                case 2: {
                    int data = scanner.nextInt();

                    Shape tempShape = firstShape;
                    Shape beforeShape = null;

                    try {
                        if (tempShape == null) {
                            System.out.println("Cannot delete");
                            break;
                        }

                        if (tempShape.getNext() == null) {
                            firstShape = null;
                            break;
                        }

                        for (int i = 0; i < data; i++) {
                            beforeShape = tempShape;
                            tempShape = tempShape.getNext();
                        }

                        if (tempShape.getNext() != null) {
                            beforeShape.setNext(tempShape.getNext());
                        }
                    } catch (Exception e) {
                        System.out.println("삭제할수 없습니다.");
                    }
                }
                break;
                case 3:
                    Shape tempShape = firstShape;

                    while (true) {
                        if(tempShape == null) {
                            System.out.println();
                            break;
                        }

                        tempShape.draw();

                        if(tempShape.getNext() == null) {
                            break;
                        }
                        tempShape = tempShape.getNext();
                    }
                    break;
                case 4:
                    exit(0);
                default:
                    System.out.println("Error.");
                    exit(-1);
            }
        }
    }
}
