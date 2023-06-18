public class ThrowYourException {
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) throws CustomException {

        // Throwing the custom exception be passing the message
        throw new CustomException(" This is my custom Exception ");
    }
}
