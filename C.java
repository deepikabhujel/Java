interface A {
    final int a = 10; // public, static, final by default
    void displayA(); // public by default
}

interface B {
     final int b = 20; // public, static, final by default
    void displayB(); // public by default
}

// Implementing both interfaces (Multiple Inheritance)
class C implements A, B {
    // Methods must be public when implementing an interface
    public void displayA() {
        System.out.println("I am display A");
    }
    
    public void displayB() {
        System.out.println("I am display B");
    }

    public static void main(String[] args) {
        C c = new C();
        c.displayA();
        c.displayB();
        System.out.println("a = " + A.a); // Accessing using interface name
        System.out.println("b = " + B.b); // Accessing using interface name
    }
}
