package BID.SWE;

public class Exercise3Impl implements Exercise3 {
    @Override
    public BetterMap Method1() {
        return new BetterMap();
    }

    @Override
    public Bewegung[] Method2() {
        Springen jump = new Springen();
        Laufen run = new Laufen();

        Bewegung[] array = {jump, run};

        return array;
    }
}
