package trafficLight;

public class prac {
    public static class TrafficSignalNode {
        String signalColor;
        int duration;
        TrafficSignalNode next;

        public TrafficSignalNode(String signalColor, int duration) {
            this.signalColor = signalColor;
            this.duration = duration;
            this.next = null;
        }
    }

    public static class TrafficSignalList {
        TrafficSignalNode head = null;
        TrafficSignalNode tail = null;

        public void insertSignal(String signalColor, int duration) {
            TrafficSignalNode newNode = new TrafficSignalNode(signalColor, duration);
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }

        public void displaySignals() {
            TrafficSignalNode current = head;
            if (head != null) {
                do {
                    System.out.println("Signal Color: " + current.signalColor + ", Duration: " + current.duration);
                    current = current.next;
                } while (current != head);
            } else {
                System.out.println("The list is empty.");
            }
        }

        public void simulateTrafficSignals(int cycles) {
            for (int i = 0; i < cycles; i++) {
                TrafficSignalNode current = head;
                do {
                    System.out.println("Signal Color: " + current.signalColor + " for " + current.duration + " seconds.");
                    try {
                        // Delay for the duration of the current signal
                        Thread.sleep(current.duration * 1000);
                    } catch (InterruptedException e) {
                        System.out.println("Simulation interrupted.");
                    }
                    current = current.next;
                } while (current != head);
            }
        }

    }

}
