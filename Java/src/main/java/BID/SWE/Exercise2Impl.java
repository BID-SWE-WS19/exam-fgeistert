package BID.SWE;

public class Exercise2Impl implements Exercise2
{
    @Override
    public BetterCell Method1() {
        return new BetterCell();
    }

    @Override
    public int Method2() {
        BetterCell cell = new BetterCell();
        return cell.Grow();
    }

    @Override
    public boolean Method3(int i) {
        BetterCell cell = new BetterCell();
        return cell.IsAlive(i);
    }
}
