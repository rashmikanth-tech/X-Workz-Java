package casting;

public class DesertParentDetails extends DesertParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in DesertParentDetails");
    }

    @Override
    public void largestDesert() {
        System.out.println("Overridden: largestDesert in DesertParentDetails");
    }

    @Override
    public void hottestDesert() {
        System.out.println("Overridden: hottestDesert in DesertParentDetails");
    }

    @Override
    public void averageRainfall() {
        System.out.println("Overridden: averageRainfall in DesertParentDetails");
    }

    @Override
    public void desertFlora() {
        System.out.println("Overridden: desertFlora in DesertParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in DesertParentDetails");
    }
}
