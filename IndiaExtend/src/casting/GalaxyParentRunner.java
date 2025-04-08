package casting;

public class GalaxyParentRunner {
    public static void main(String[] args) {

        GalaxyParent obj1 = new GalaxyParent();
        obj1.category();
        obj1.largestGalaxy();
        obj1.galaxyTypes();
        obj1.galaxyFormation();
        obj1.galaxyImportance();
        System.out.println("----------------------");

        GalaxyParent obj2 = new GalaxyParentDetails();
        obj2.category();
        obj2.largestGalaxy();
        obj2.galaxyTypes();
        obj2.galaxyFormation();
        obj2.galaxyImportance();
        System.out.println("----------------------");

        GalaxyParentDetails obj3 = new GalaxyParentDetails();
        obj3.category();
        obj3.largestGalaxy();
        obj3.galaxyTypes();
        obj3.galaxyFormation();
        obj3.galaxyImportance();
        obj3.extraMethod();
        System.out.println("----------------------");

        GalaxyParentCast caster = new GalaxyParentCast();
        caster.cast(obj2);
    }
}
