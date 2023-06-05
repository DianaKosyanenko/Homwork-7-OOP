public final class Calulator implements Calculable{
    private int primaryRealArg;
    private int primaryImageArg;

    public Calulator(int primaryRealArg, int primaryImageArg) {
        this.primaryRealArg = primaryRealArg;
        this.primaryImageArg = primaryImageArg;
    }

    @Override
    public Calculable sum( int realArg,  int imagArg) {
        primaryRealArg  += realArg;
        primaryImageArg += imagArg;
        return this;
    }

    @Override
    public Calculable multi( int realArg,  int imagArg) {
        this.primaryRealArg = primaryImageArg * realArg - this.primaryImageArg * realArg;
        this.primaryRealArg = primaryImageArg * imagArg + this.primaryImageArg * realArg;
        return this;
    }

    @Override
    public String getResult(){
        return String.format("%d + %dj", this.primaryRealArg, this.primaryImageArg);
    }
}
