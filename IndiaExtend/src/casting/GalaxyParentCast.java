package casting;

public class GalaxyParentCast {
    public void cast(GalaxyParent obj) {
        System.out.println("Casting GalaxyParent");
        obj.category();
        obj.largestGalaxy();
        obj.galaxyTypes();
        obj.galaxyFormation();
        obj.galaxyImportance();
        if(obj instanceof GalaxyParentDetails) {
            GalaxyParentDetails ref = (GalaxyParentDetails)obj;
            ref.extraMethod();
        }
    }
}
