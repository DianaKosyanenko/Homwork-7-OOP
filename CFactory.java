public class CFactory implements TCalculableFactory{
    @Override
    public Calculable create(int primaryRealArg, int primaryImageArg) {
        return new Calulator(primaryRealArg, primaryImageArg);
    }
}
