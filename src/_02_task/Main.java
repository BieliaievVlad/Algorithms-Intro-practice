package _02_task;

public class Main {

    static String[] books = new String[] {"Great time", "Silver fog",
            "Super deal", "Great choice", "Bob and Megan", "Mathematics"};
    static int count;

    public static void main(String[] args) {

        for (int i = 1; i < books.length; i++) {
            String key = books[i];
            int j = i - 1;

            while (j >= 0 && (key.compareTo(books[j]) < 0)) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }

        for (String book : books) {
            count++;
            System.out.println(count + ") " + book);
        }

    }

}
