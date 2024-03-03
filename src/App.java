import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        assistenciaMedica am = new assistenciaMedica();
        System.out.print("Informe o valor do seu salário: ");
        am.setSalario(input.nextDouble());
        input.close();
    }
}
