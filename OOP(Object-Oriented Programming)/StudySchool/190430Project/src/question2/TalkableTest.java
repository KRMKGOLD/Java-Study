package question2;

public class TalkableTest {
    static void conversation(Talkable t) {
        t.talk();
    }

    public static void main(String[] args) {
        class Korean implements Talkable {
            @Override
            public void talk() {
                System.out.println("안녕하세요!");
            }
        }

        class American implements Talkable {
            @Override
            public void talk() {
                System.out.println("Hello!");
            }
        }

        conversation(new Korean());
        conversation(new American());

        conversation(new Korean() {
            @Override
            public void talk() {
                System.out.println("안녕하세요!");
            }
        });

        conversation(new American() {
            @Override
            public void talk() {
                System.out.println("Hello!");
            }
        });
    }
}
