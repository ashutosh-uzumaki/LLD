package org.example.design_patterns.behavorial.state_pattern;

public class GreenState implements State{
    private TrafficLight trafficLight;

    public GreenState(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }

    @Override
    public void change(){
        trafficLight.setState(new YellowState(trafficLight));
    }
}
