package BID.SWE;

public class BetterCell extends Cell {
    @Override
    public int Grow() {
        _size *= 2;
        return _size;
    }

    public boolean IsAlive(int Neighbours) {
        return Neighbours % 2 == 0;
    }
}
