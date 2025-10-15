 class Racer extends Thread {
    private String racerName;
    private int sleepTime;

    public Racer(String name, int sleepTime) {
        this.racerName = name;
        this.sleepTime = sleepTime;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(racerName + " - Completed step " + i);
                Thread.sleep(sleepTime);
            }
            System.out.println(racerName + " - Finished the race!");
        } catch (InterruptedException e) {
            System.out.println(racerName + " was interrupted!");
        }
    }
}

public class RaceSimulator {
    public static void main(String[] args) {
        Racer racerA = new Racer("Racer A", 500); // 500ms per step
        Racer racerB = new Racer("Racer B", 700); // 700ms per step
        Racer racerC = new Racer("Racer C", 600); // 600ms per step

        System.out.println("Race started");
        racerA.start();
        racerB.start();
        racerC.start();
    }
}
