import java.util.*;

public class Eren extends Thread {
    private int energy;
    private UI ui;
    private ArrayList<Observer> observers = new ArrayList<>();

    public Eren(int energy, UI ui) {
        this.energy = energy;
        this.ui = ui;
        start(); 
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(energy);
        }
    }

    @Override
    public void run() {
        Random r = new Random();
        while (energy > 0) {
            try {
                Thread.sleep((5 + r.nextInt(6)) * 1000); 
                ui.display("\nEren transforms into a Titan!");
                energy -= 5;
                notifyObservers();
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ui.display("\nEren has exhausted all energy!");
    }
}
