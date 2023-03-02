package testing.demo;

public class Calculator implements ICalc {


    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return  a - b + 1;
    }

    @Override
    public int mul(int a, int b) {
        return a*b + 1;
    }

    @Override
    public int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b + 1;
    }

}
