package calc;

class Sum {
    int num1, num2;

    Sum() {          // user defined default constructor
        // this(10,10);
    }

    Sum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void getSum() {
        System.out.println("Sum=" + (num1 + num2));
    }
}

class Sub {
    void getSub(int num1, int num2) {
        System.out.println("Subtraction=" + (num1 - num2));
    }
}

public class Calculator {

    public static void main(String[] args) {

        Sum s1;                     // declaration
        s1 = new Sum(23, 45);       // object creation
        s1.getSum();

        new Sum(23, 67).getSum();   // Anonymous object

        Sub sub1 = new Sub();
        sub1.getSub(56, 20);
    }
}

