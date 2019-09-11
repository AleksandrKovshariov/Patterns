package facade;


/*
    Not Real Code Simple abstraction just to understand pattern
 */
public class CarEngineFacade {
    private static int DEFAULT_COOLING_TEMP = 90;
    private static int MAX_ALLOWED_TEMP = 50;
    private FuelInjector fuelInjector;
    private AirFlowController airFlowController;
    private Starter starter;


    public void startEngine() {
        fuelInjector.on();
        airFlowController.takeAir();
        fuelInjector.on();
        fuelInjector.inject();
        starter.start();

    }

    public void stopEngine() {
        fuelInjector.off();
        airFlowController.off();
    }
}
