public class Calculator{

    public int a;

    public int b;

    public static Calculator calculator;

    private Calculator(){
        System.out.println("Calculator created");
    }

    public int sum(){
        return a*b;
    }

    public static Calculator getInstane(){

        if(calculator == null){
            synchronized(Calculator.class) {
                if(calculator == null){
                    calculator = new Calculator();
                }
            }
        }

        return calculator;
    }
}