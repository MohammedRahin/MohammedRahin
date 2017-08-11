class Test {

    static boolean contains(char c, char[] array) {
        for (char x : array) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] a) {
        char[] charArray = new char[] {'h','e','l','l','o'};
        if (!contains('h', charArray)) {
            // Do something...
            System.out.println("Hello world!");
        }
    }

}