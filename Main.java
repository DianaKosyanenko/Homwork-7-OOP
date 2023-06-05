public class Main {
    public static void main(String[] args) {
        TCalculableFactory calculableFactory = new CFactory();
        TCalculableFactory calcFactory = new CalcFactory(new LogConsole(), calculableFactory);
        ViewCalculator view = new ViewCalculator(calcFactory);
        view.run();

    }
}
