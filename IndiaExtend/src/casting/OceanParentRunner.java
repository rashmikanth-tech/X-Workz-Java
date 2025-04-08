package casting;

public class OceanParentRunner {
    public static void main(String[] args) {

        OceanParent obj1 = new OceanParent();
        obj1.category();
        obj1.largestOcean();
        obj1.averageDepth();
        obj1.salinity();
        obj1.famousTrench();
        System.out.println("----------------------");

        OceanParent obj2 = new OceanParentDetails();
        obj2.category();
        obj2.largestOcean();
        obj2.averageDepth();
        obj2.salinity();
        obj2.famousTrench();
        System.out.println("----------------------");

        OceanParentDetails obj3 = new OceanParentDetails();
        obj3.category();
        obj3.largestOcean();
        obj3.averageDepth();
        obj3.salinity();
        obj3.famousTrench();
        obj3.extraMethod();
        System.out.println("----------------------");

        OceanParentCast caster = new OceanParentCast();
        caster.cast(obj2);
    }
}
