package ecom.com;

public class Main {

    public static void main(String[] args) {

        LightSwitch my_switch = new LightSwitch(LightSwitch.Light_state.ON);
        System.out.println(my_switch.getState().name());

        switch (my_switch.getState()) {
            case ON:
                System.out.println("it is on!");
                break;
            case OFF:
                System.out.println("it is off!");
                break;
            case BROKEN:
                System.out.println("oh no! it is broken");
                break;
        }
        System.out.println("************ States:");
        for (LightSwitch.Light_state state:LightSwitch.Light_state.values()) {
            System.out.println(state);
        }
    }
}
