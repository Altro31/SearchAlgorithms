package classes;

import java.util.ArrayDeque;

public abstract class UninformedSearchAlgorithm extends SearchAlgorithm {

    protected final ArrayDeque<State> frontier;
    protected final State initialState;
    protected final State finalState;

    protected UninformedSearchAlgorithm(State initialState, State finalState) {
        super();
        frontier = new ArrayDeque<State>();
        this.initialState = initialState;
        this.finalState = finalState;
    }

    protected abstract boolean testFunction(State actualState, State finalState);

    protected abstract Float heuristicFunction(State actualState, State finalState);
}
