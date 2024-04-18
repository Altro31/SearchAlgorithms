package n_puzzle;

import classes.InDepthFirstAlgorithm;
import classes.State;

import java.util.ArrayList;
import java.util.List;

public class N_PuzzleInDepthFirst extends InDepthFirstAlgorithm {

    public N_PuzzleInDepthFirst(NPuzzleState initialState, NPuzzleState finalState) {
        super(initialState, finalState);
    }

    @Override
    public List<State> successorFunction(State actualState) {
        List<State> list = new ArrayList<>();
        assert actualState instanceof NPuzzleState;

        int val = ((NPuzzleState) actualState).value;
        val = val % 2 == 0 ? val / 2 : 3 * val + 1;
        list.add(new NPuzzleState(val));
        return list;
    }

    @Override
    protected boolean testFunction(State actualState, State finalState) {
        return ((NPuzzleState) actualState).value == ((NPuzzleState) finalState).value;
    }
}
