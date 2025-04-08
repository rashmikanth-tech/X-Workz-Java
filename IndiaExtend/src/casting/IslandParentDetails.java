package casting;

public class IslandParentDetails extends IslandParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in IslandParentDetails");
    }

    @Override
    public void largestIsland() {
        System.out.println("Overridden: largestIsland in IslandParentDetails");
    }

    @Override
    public void mostPopulatedIsland() {
        System.out.println("Overridden: mostPopulatedIsland in IslandParentDetails");
    }

    @Override
    public void islandClimate() {
        System.out.println("Overridden: islandClimate in IslandParentDetails");
    }

    @Override
    public void famousIsland() {
        System.out.println("Overridden: famousIsland in IslandParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in IslandParentDetails");
    }
}
