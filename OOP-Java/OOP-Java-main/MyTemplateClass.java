class MyTemplateClass<T> {
    private T data;

    public MyTemplateClass(T d) {
        data = d;
    }

    public void display() {
        System.out.println("Data: " + data);
    }
}

public class Main {
    public static void main(String[] args) {
        MyTemplateClass<Integer> obj1 = new MyTemplateClass<>(5);
        MyTemplateClass<Float> obj2 = new MyTemplateClass<>(3.14f);
        obj1.display();
        obj2.display();
    }
}
