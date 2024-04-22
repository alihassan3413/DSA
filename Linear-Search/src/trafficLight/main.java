package trafficLight;

public class main {
    public static void main(String[] args) {
        prac.TrafficSignalList signalList = new prac.TrafficSignalList();
        signalList.insertSignal("Red", 10);
        signalList.insertSignal("Green", 10);
        signalList.insertSignal("Yellow", 10);

        signalList.displaySignals();
        signalList.simulateTrafficSignals(3); // Simulate 3 cycles of traffic signals
    }
}
