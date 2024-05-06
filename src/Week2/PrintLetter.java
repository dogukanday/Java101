package Week2;

public class PrintLetter {
    public static void main(String[] args) {
        int dimension = 7; // B harfinin boyutu
        char[][] letter = new char[dimension][dimension];

        // Harfi oluşturma
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (j == 0 || (i == 0 || i == dimension / 2 || i == dimension - 1) && j < dimension - 1 || j == dimension - 1 && i != 0 && i != dimension / 2 && i != dimension - 1) {
                    letter[i][j] = '*';
                } else {
                    letter[i][j] = ' ';
                }
            }
        }

        // Harfi ekrana yazdırma
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(letter[i][j]);
            }
            System.out.println();
        }
    }
}
