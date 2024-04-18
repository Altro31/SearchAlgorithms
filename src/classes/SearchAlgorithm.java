package classes;

import java.util.List;

public abstract class SearchAlgorithm {
    public abstract Object execute();

    public abstract List<State> successorFunction(State actualState);
}
