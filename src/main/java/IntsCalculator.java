public class IntsCalculator extends Calculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        return this.sum(arg0,arg1);
        //считаем через target
    }

    @Override
    public int mult(int arg0, int arg1) {
        return this.mult(arg0,arg1);
        //считаем через target
    }

    @Override
    public int pow(int a, int b) {
        return this.pow(a,b);
        //считаем через target
    }
}
