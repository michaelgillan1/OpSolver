package Op;

public class AddOp implements Op {
    private int _summand;
    public AddOp(int summand) {
        this._summand = summand;
    }
    public int forward(int x) {
        return x + _summand;
    }
    public String toString() {
        return "+" + _summand;
    }
}
