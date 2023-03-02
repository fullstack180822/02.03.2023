package ecom.com;

public class LightSwitch extends Object implements ILightSwitch {

    public enum Light_state {
        ON,
        OFF,
        BROKEN
    }

    private Light_state state;
    private int attempts = 0;

//    public final static int ON = 1;
//    public final static int OFF = 0;
//    public final static int BROKEN = -1;

    public Light_state getState() {
        return state;
    }

    public LightSwitch(Light_state state) {
        this.state = state;
    }

    @Override
    public void switchOn() {
        if (this.state.equals("off")) {
            attempts = 0;
            this.state = Light_state.ON;
        }
    }

    @Override
    public void switchOff() {
        if (this.state.equals("on")) {
            attempts = 0;
            this.state = Light_state.OFF;
        }
        // switch already off
        else {
            attempts ++;
            if (attempts >= 3) {
                this.state = Light_state.BROKEN;
            }
        }
    }
}
