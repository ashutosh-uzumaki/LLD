package org.example.design_patterns.behavorial.state_pattern;

public class YellowState implements State{
    private TrafficLight trafficLight;
    public YellowState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void change(){
        trafficLight.setState(new RedState(trafficLight));
    }
}
