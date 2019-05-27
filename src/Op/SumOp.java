package Op;

public class SumOp implements Op {
    public int forward(int x) {
        return String.valueOf(x).chars().map(Character::getNumericValue).sum();
    }
    public String toString() {
        return "Sum";
    }
}