import Op.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Op> opList = new ArrayList<Op>() {
            {
                add(new SumOp());
                add(new MultOp(5));
                add(new RepOp(5, 2));
                add(new DivOp(2));
            }
        };

        int target = 16;
        int source = 5;
        int moves = 5;

        Solver solver = new Solver(opList, target, source, moves);
        ArrayList<Op> sol = solver.solve();
        Collections.reverse(sol);
        System.out.println(sol);
    }
}
