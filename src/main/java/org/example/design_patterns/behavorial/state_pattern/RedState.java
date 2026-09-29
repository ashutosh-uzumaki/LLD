package org.example.design_patterns.behavorial.state_pattern;

public class RedState implements State{

    private TrafficLight trafficLight;

    public RedState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void change(){
        trafficLight.setState(new GreenState(trafficLight));
    }
}
