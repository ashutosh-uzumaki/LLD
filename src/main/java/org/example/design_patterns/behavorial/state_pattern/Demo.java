package org.example.design_patterns.behavorial.state_pattern;


public class Demo {

    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

        System.out.println("Start State: "
                + trafficLight.getState().getClass().getSimpleName());

        trafficLight.change();

        System.out.println("Changed State: "
                + trafficLight.getState().getClass().getSimpleName());

        trafficLight.change();

        System.out.println("Changed State: "
                + trafficLight.getState().getClass().getSimpleName());

        trafficLight.change();

        System.out.println("Changed State: "
                + trafficLight.getState().getClass().getSimpleName());
    }
}