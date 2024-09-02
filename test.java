import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello Welcome to the world of Git");
        System.out.println("This is a test program");
        System.out.println("Enter the range of the prime number");
        Scanner sc = new Scanner(System.in);
        try {
            int i = sc.nextInt();
            int j = sc.nextInt();
            sc.close();
            prime(i, j);
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
    }

    static void prime(int i, int j) {
        
        writeToFile(i, j);
    }

    static void writeToFile(int i, int j) {
        try {
            FileWriter myWriter = new FileWriter("C:/Users/warre/OneDrive - Lehigh University/Documents/lehigh/Cse 216/git_test/prime.txt");
            myWriter.write("The prime numbers between " + i + " and " + j + " are: \n");
            for (int k = i; k <= j; k++) {
                int count = 0;
                for (int l = 1; l <= k; l++) {
                    if (k % l == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    myWriter.write(k + "\n");
                }
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
