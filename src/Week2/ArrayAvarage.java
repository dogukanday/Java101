package Week2;

public class ArrayAvarage {
    public static void main(String[] args) {


        int [] numbers = {23,48,36,72,65};
        double harmonicNumber = 0 ;
        for(int i= 0 ; i<numbers.length; i++){

            harmonicNumber += (double) 1 / numbers[i];

        }
        double avarage = numbers.length / harmonicNumber;
        System.out.println("Harmonic avarage : " + avarage );


    }
}
