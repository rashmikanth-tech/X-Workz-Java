package casting;

public class OceanParentDetails extends OceanParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in OceanParentDetails");
    }

    @Override
    public void largestOcean() {
        System.out.println("Overridden: largestOcean in OceanParentDetails");
    }

    @Override
    public void averageDepth() {
        System.out.println("Overridden: averageDepth in OceanParentDetails");
    }

    @Override
    public void salinity() {
        System.out.println("Overridden: salinity in OceanParentDetails");
    }

    @Override
    public void famousTrench() {
        System.out.println("Overridden: famousTrench in OceanParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in OceanParentDetails");
    }
}
