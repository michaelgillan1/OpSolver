package Op;

public class RevOp implements Op {
    public int forward(int x) {
        String str = Integer.toString(x);
        str = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(str);
    }
    public String toString() {
        return "Rev";
    }
}
