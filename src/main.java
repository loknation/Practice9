import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SafeInput.prettyHeader(SafeInput.getNonZeroLenString(scan, "enter yo thing"));
    }
}
