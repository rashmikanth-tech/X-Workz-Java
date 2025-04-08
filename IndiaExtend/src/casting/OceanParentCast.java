package casting;

public class OceanParentCast {
    public void cast(OceanParent obj) {
        System.out.println("Casting OceanParent");
        obj.category();
        obj.largestOcean();
        obj.averageDepth();
        obj.salinity();
        obj.famousTrench();
        if(obj instanceof OceanParentDetails) {
            OceanParentDetails ref = (OceanParentDetails)obj;
            ref.extraMethod();
        }
    }
}
