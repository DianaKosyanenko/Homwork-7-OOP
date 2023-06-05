public class CalcFactory implements TCalculableFactory{
    Logger log;
    TCalculableFactory calculableFactory;

    public CalcFactory(Logger log, TCalculableFactory calculableFactory) {
        this.log = log;
        this.calculableFactory = calculableFactory;
    }

    @Override
    public Calculable create(int primaryRealArg, int  primaryImageArg) {
        return new CalculatorLogger(log, calculableFactory.create(primaryRealArg, primaryImageArg));
    }
}
