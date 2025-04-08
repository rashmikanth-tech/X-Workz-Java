package casting;

public class ExoplanetParentCast {
    public void cast(ExoplanetParent obj) {
        System.out.println("Casting ExoplanetParent");
        obj.category();
        obj.firstDiscovered();
        obj.exoplanetDetection();
        obj.habitableZone();
        obj.exoplanetAtmosphere();
        if(obj instanceof ExoplanetParentDetails) {
            ExoplanetParentDetails ref = (ExoplanetParentDetails)obj;
            ref.extraMethod();
        }
    }
}
