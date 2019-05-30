public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String data = null;
            System.out.println(data.toString());
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
}
