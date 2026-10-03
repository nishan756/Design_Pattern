public class Main {
    public static void main(String[] args) {

        // Checking if the class is thread safe
        Thread t1 = new Thread(
            ()-> {
                Calculator.getInstane();
            }
        );

        Thread t2 = new Thread(
            ()-> {
                Calculator.getInstane();
            }
        );

        t1.start();
        t2.start();
        
        Calculator cal1 = Calculator.getInstane();

        Calculator cal2 = Calculator.getInstane();

        cal1.a = 10;
        cal1.b = 20;

        System.out.println(cal1.sum());

        System.out.println(cal1);

        cal2.a = 10;
        cal2.b = 20;

        System.out.println(cal2.sum());

        System.out.println(cal2);

    }
}
