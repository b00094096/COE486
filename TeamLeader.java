public class TeamLeader implements Observer {
    private String name;
    private int patience;
    private UI ui;
    private Eren eren;
    private boolean active = true;

    public TeamLeader(String name, int patience, UI ui, Eren eren) {
        this.name = name;
        this.patience = patience;
        this.ui = ui;
        this.eren = eren;
        eren.addObserver(this);
    }

    @Override
    public void update(int energy) {
        if (!active) return;
        patience -= 5;
        if (patience == 10)
            ui.display(name + ": My patience is waning!");
        else if (patience == 5)
            ui.display(name + ": Is this entertaining?");
        else if (patience <= 0) {
            ui.display(name + ": Omae wa mou shindeiru");
            active = false;
        }
    }
}
