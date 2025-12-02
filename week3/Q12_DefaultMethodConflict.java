// [12] Handling Default Method Conflicts: Create two interfaces A and B, both with a default method show(). 
// Create a class C that implements both interfaces and resolves the conflict using super.

interface A {
    default void show() {
        System.out.println("Interface A show() method");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B show() method");
    }
}

class C implements A, B {
    @Override
    public void show() {
        A.super.show();
        B.super.show();
        System.out.println("Class C resolves the conflict");
    }
}

public class Q12_DefaultMethodConflict {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
