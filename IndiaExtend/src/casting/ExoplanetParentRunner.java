package casting;

public class ExoplanetParentRunner {
    public static void main(String[] args) {

        ExoplanetParent obj1 = new ExoplanetParent();
        obj1.category();
        obj1.firstDiscovered();
        obj1.exoplanetDetection();
        obj1.habitableZone();
        obj1.exoplanetAtmosphere();
        System.out.println("----------------------");

        ExoplanetParent obj2 = new ExoplanetParentDetails();
        obj2.category();
        obj2.firstDiscovered();
        obj2.exoplanetDetection();
        obj2.habitableZone();
        obj2.exoplanetAtmosphere();
        System.out.println("----------------------");

        ExoplanetParentDetails obj3 = new ExoplanetParentDetails();
        obj3.category();
        obj3.firstDiscovered();
        obj3.exoplanetDetection();
        obj3.habitableZone();
        obj3.exoplanetAtmosphere();
        obj3.extraMethod();
        System.out.println("----------------------");

        ExoplanetParentCast caster = new ExoplanetParentCast();
        caster.cast(obj2);
    }
}
