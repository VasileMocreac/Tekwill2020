import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();

        String str2 = str.replace("a", "b");
        System.out.println(str2);
    }
}
