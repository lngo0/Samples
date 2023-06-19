import java.util.Arrays;

public class Stack {

    class Person {
        private String name;
        private String age;

        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public Person deepCopy() {
            return new Person(name, age);
        }
    }
    private Person[] data;
    private int top;
    private int size;
    public Stack() {
        top = -1;
        size = 10;
        data = new Person[10];
    }
    public Stack(int n) {
        top = -1;
        size = n;
        data = new Person[n];
    }

    public boolean push(Person newData) {
        if (top == size  - 1) {
            return false; //overflow
        } else {
            top += 1;
            data[top] = newData.deepCopy();
            return true;
        }
    }
    public Person pop(Person newData) {
        int topLocation;
        if (top == -1) {
            return null; //overflow
        } else {
            topLocation = top;
            top -= top;
            return data[topLocation];
        }
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].toString());
        }
    }
}
