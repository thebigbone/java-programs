class TestGenerics {
    static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intarray = { 1, 2, 4, 22, 42 };
        Character[] chararry = { 'a', 'v', 'e', 'w', 'e' };

        printArray(intarray);
        printArray(chararry);

    }

}
