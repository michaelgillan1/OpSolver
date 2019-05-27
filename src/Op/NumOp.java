package Op;

public class NumOp implements Op {
    private String _operand;
    public NumOp(int n) {
        this._operand = Integer.toString(n);
    }
    public int forward(int x) {
        String str = Integer.toString(x);
        str = str + _operand;
        return Integer.parseInt(str);
    }
    public String toString() {
        return _operand;
    }
}