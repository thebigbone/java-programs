class MyGen<T> {
    T obj;

    void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }
}

class Gene {
    public static void main(String[] args) {
        MyGen<Integer> a = new MyGen<Integer>();
        a.add(10);
        System.out.println(a.get());
    }
}
