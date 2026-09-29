package org.example.design_patterns.behavorial.state_pattern;

public class TrafficLight {
    private State state;

    public TrafficLight(){
        state = new RedState(this);
    }

    public void change(){
        state.change();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
