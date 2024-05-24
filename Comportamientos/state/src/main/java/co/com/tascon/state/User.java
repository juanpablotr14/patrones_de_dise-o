package co.com.tascon.state;

public class User {
	
    private State state;
    private boolean buying;
    private boolean enable;

    public User() {
        this.state = new ActiveState(this);
        this.buying = false;
        this.enable = true;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public String activate() {
        return state.onActive();
    }

    public String disable() {
        return state.onDisable();
    }

    public String lock() {
        return state.onLock();
    }

    public String buy() {
        return state.onBuy();
    }

    public boolean isBuying() {
        return buying;
    }

    public void setBuying(boolean buying) {
        this.buying = buying;
    }

    public boolean getEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String startBuy() {
        return "Starting to buy...";
    }
}