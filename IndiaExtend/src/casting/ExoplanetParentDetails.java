package casting;

public class ExoplanetParentDetails extends ExoplanetParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in ExoplanetParentDetails");
    }

    @Override
    public void firstDiscovered() {
        System.out.println("Overridden: firstDiscovered in ExoplanetParentDetails");
    }

    @Override
    public void exoplanetDetection() {
        System.out.println("Overridden: exoplanetDetection in ExoplanetParentDetails");
    }

    @Override
    public void habitableZone() {
        System.out.println("Overridden: habitableZone in ExoplanetParentDetails");
    }

    @Override
    public void exoplanetAtmosphere() {
        System.out.println("Overridden: exoplanetAtmosphere in ExoplanetParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ExoplanetParentDetails");
    }
}
