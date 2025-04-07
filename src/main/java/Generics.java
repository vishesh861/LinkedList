class Box<T> {
    private T value;
    public Box(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}

public class Generics {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox.getValue()); // prints "Hello"
        Box<Integer> intBox = new Box<>(123);
        System.out.println(intBox.getValue()); // prints 123
    }
}

