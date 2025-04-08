package casting;

public class DesertParentCast {
    public void cast(DesertParent obj) {
        System.out.println("Casting DesertParent");
        obj.category();
        obj.largestDesert();
        obj.hottestDesert();
        obj.averageRainfall();
        obj.desertFlora();
        if(obj instanceof DesertParentDetails) {
            DesertParentDetails ref = (DesertParentDetails)obj;
            ref.extraMethod();
        }
    }
}
