import Op.Op;

import java.util.ArrayList;
import java.util.Arrays;

public class Solver {
    private ArrayList<Op> _opList;
    private int _target;
    private int _source;
    private int _lim;
    public Solver(ArrayList<Op> opList, int target, int source, int lim) {
        this._opList = opList;
        this._target = target;
        this._source = source;
        this._lim = lim;
    }

    public ArrayList<Op> solve() {
        return this.solveHelper(_lim,  _opList, _target, _source);
    }

    private ArrayList<Op> solveHelper(int rem, ArrayList<Op> poss, int tar, int src) {
        if (rem == 0) {
            return null;
        }

        for (Op op : poss) {
            int next = op.forward(src);
            if (next == tar) {
                return new ArrayList<Op>(Arrays.asList(op));
            }

            ArrayList<Op> sol = solveHelper(rem - 1, poss, tar, next);
            if (sol != null) {
                sol.add(op);
                return sol;
            }
        }
        return null;
    }
}