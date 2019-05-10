import java.io.Console;
import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("what's your name:");
        String name = in.nextLine();

        System.out.println("How old are you:");
        int age = in.nextInt();

        System.out.println(String.format("Hello, %s. Next year you'll be %d", name, age + 1));

        // 需要从控制台启动
        Console cons = System.console();
        String username = cons.readLine("User name:");
        char[] password= cons.readPassword("password:");
        System.out.println(username);
        System.out.println(password);

    }
}
