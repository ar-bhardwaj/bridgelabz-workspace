public class NullException {
    public static void main(String[] args) {
        handleException();
    }


    /* The @SuppressWarnings("null") annotation is used to suppress 
        compiler warnings related to potential null references. */

    @SuppressWarnings("null")
    public static void generateException() {
        String text = null; // Assigning null
        System.out.println(text.length()); // This will throw NullPointerException
    }

    @SuppressWarnings("null")
    public static void handleException() {
        String text = null; // Assigning null

        try {
            System.out.println(text.length()); // This will throw an exception
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught! The variable is null.");
        }
    }

}
