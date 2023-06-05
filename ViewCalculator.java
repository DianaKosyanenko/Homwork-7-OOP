import java.util.Scanner;

public class ViewCalculator {
    private TCalculableFactory calculableFactory;


    public ViewCalculator(TCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }
    public void run() {
        while(true) {
            int primaryTrueArg = promptInt("Введите первую действительную часть: ");
            int primaryImageArg = promptInt("Введите первую мнимую часть: ");
            Calculable calculator = calculableFactory.create(primaryTrueArg, primaryImageArg);
            while (true){
                String cmd =prompt("Введите команду (*, +, =): ");
                if (cmd.equals("*") ){
                    int realArg = promptInt("Введите вторую действительную часть: ");
                    int imageArg = promptInt("Введите вторую мнимую часть: ");
                    calculator.multi( realArg,  imageArg);
                    continue;
                }
                if (cmd.equals("+")){
                    int realArg = promptInt("Введите вторую действительную часть: ");
                    int imageArg = promptInt("Введите вторую мнимую часть: ");
                    calculator.sum( realArg, imageArg);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }

            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
        }
            break;


    }

    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}

