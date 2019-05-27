package Op;

public class MultOp implements Op {
    private int _summand;
    public MultOp(int summand) {
        this._summand = summand;
    }
    public int forward(int x) {
        return x * _summand;
    }
    public String toString() {
        return "x" + _summand;
    }
}