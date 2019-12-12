package BID.SWE;

public class BetterMap extends Map {
    @Override
    public String GetMapName() {
        return "BID-Map";
    }

    @Override
    public float GetMapSize(float amount) {
        return amount * amount;
    }

    @Override
    public int AddNewCells(int count) {
        return count;
    }
}
