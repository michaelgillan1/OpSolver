package Op;

public class DivOp implements Op {
    private int _summand;
    public DivOp(int summand) {
        this._summand = summand;
    }
    public int forward(int x) {
        return x / _summand;
    }
    public String toString() {
        return "/" + _summand;
    }
}