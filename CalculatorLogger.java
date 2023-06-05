public class CalculatorLogger implements Calculable{
    private Logger log;
    private Calculable calc;

    public CalculatorLogger(Logger log, Calculable calc) {
        this.log = log;
        this.calc = calc;
        log.log("Первое число - " + calc.getResult() + "\n");
    }

    @Override
    public Calculable sum( int realArg,  int imagArg) {
        log.log("Суммируем со вторым числом: " + realArg + "+" + imagArg +" \n" );
        return calc.sum( realArg,  imagArg);
    }

    @Override
    public Calculable multi( int realArg, int imagArg) {
        log.log("Умножаем на второе число: " + realArg + "+" + imagArg +" \n"  );
        return calc.multi( realArg, imagArg);
    }
    public String getResult(){
        String result = calc.getResult();
        log.log("Результат: " + result);
        return result;
    }


}

