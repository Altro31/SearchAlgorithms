package classes;

public abstract class State {

    private State previousState;
    public State getPreviousState() {
        return previousState;
    }
    public void setPreviousState(State previousState) {
        this.previousState = previousState;
    }
}
