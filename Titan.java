import java.util.Random;

public class Titan implements Observer {
    private String name;
    private UI ui;
    private Eren eren;
    private Random rand = new Random();

    public Titan(String name, UI ui, Eren eren) {
        this.name = name;
        this.ui = ui;
        this.eren = eren;
        eren.addObserver(this);
    }

    @Override
    public void update(int energy) {
        if (rand.nextBoolean()) {
            ui.display(name + ": attacks Eren!");
            if (energy > 40)
                ui.display(name + ": Now we got problems, and I don't think we can solve 'em");
        }
    }
}
