package classes;

import java.util.List;

public abstract class InDepthFirstAlgorithm extends UninformedSearchAlgorithm {

    protected InDepthFirstAlgorithm(State initialState, State finalState) {
        super(initialState, finalState);
    }

    @Override
    public final Object execute() {
        // Se limpia la frontera para que comience vacía
        frontier.clear();

        // Se añade el estado inicial a la frontera
        frontier.add(this.initialState);

        State aim = null;
        // Ejecuto el ciclo hasta que:
        //  - Se encuentre el nodo objetivo
        //  - La frontera esté vacía
        while (aim == null && !frontier.isEmpty()) {
            // Extraigo el 1er elemento de la forntera
            State actualState = frontier.pollFirst();

            // Si se cumple la función test
            if (testFunction(actualState, finalState)) {
                aim = actualState;
            } else {
                // Si nó, aplico la función sucesor
                List<State> successors = successorFunction(actualState);

                // Añado cada elemento al inicio de la frontera
                for (State state : successors.reversed()) {
                    state.setPreviousState(actualState);
                    frontier.addFirst(state);
                }

            }
        }

        return aim;
    }
}
