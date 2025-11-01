import java.util.Random;

public class Friend implements Observer {
    private String name;
    private UI ui;
    private Eren eren;
    private Random rand = new Random();

    public Friend(String name, UI ui, Eren eren) {
        this.name = name;
        this.ui = ui;
        this.eren = eren;
        eren.addObserver(this);
    }

    @Override
    public void update(int energy) {
        if (rand.nextBoolean())
            ui.display(name + ": Eren! Please be safe!");
        if (energy < 20)
            ui.display(name + ": Rage, rage against the dying of the light!");
    }
}

