import classes.State;
import n_puzzle.NPuzzleState;
import n_puzzle.N_PuzzleInDepthFirst;

public class Main {
    public static void main(String[] args) {

        NPuzzleState initialState = new NPuzzleState(1000000000);
        NPuzzleState finalState = new NPuzzleState(1);

        N_PuzzleInDepthFirst algorithm = new N_PuzzleInDepthFirst(initialState, finalState);

        NPuzzleState res = (NPuzzleState) algorithm.execute();

        printTrace(res);
    }

    private static void printTrace(NPuzzleState res) {
        if (res.getPreviousState() != null)
            printTrace((NPuzzleState) res.getPreviousState());

        System.out.println(res.value);
    }


}
