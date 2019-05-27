package Op;

public class RepOp implements Op {
    private String _source;
    private String _target;

    public RepOp(int source, int target) {
        this._source = Integer.toString(source);
        this._target = Integer.toString(target);
    }

    public int forward(int x) {
        String str = Integer.toString(x);
        str = str.replace(_source, _target);
        return Integer.parseInt(str);
    }

    public String toString() {
        return _source + " => " + _target;
    }
}