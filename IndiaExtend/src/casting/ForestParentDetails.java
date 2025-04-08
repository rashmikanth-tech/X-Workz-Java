package casting;

public class ForestParentDetails extends ForestParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in ForestParentDetails");
    }

    @Override
    public void largestForest() {
        System.out.println("Overridden: largestForest in ForestParentDetails");
    }

    @Override
    public void biodiversity() {
        System.out.println("Overridden: biodiversity in ForestParentDetails");
    }

    @Override
    public void forestArea() {
        System.out.println("Overridden: forestArea in ForestParentDetails");
    }

    @Override
    public void forestImportance() {
        System.out.println("Overridden: forestImportance in ForestParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ForestParentDetails");
    }
}
