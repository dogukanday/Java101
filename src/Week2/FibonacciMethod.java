package Week2;

public class FibonacciMethod {

    static void fibonacci(int num){
        int first = 0;
        int second = 1;
        int total;

        if(num==1 || num==2){
            System.out.println("1");
        }else {
            for (int i = 1; i <= num; i++) {
                System.out.print(first + " ");
                total= first + second;
                first = second;
                second = total;
            }
        }


    }

    public static void main(String[] args) {
        fibonacci(2);
    }
}
