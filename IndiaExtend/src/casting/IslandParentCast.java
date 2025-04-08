package casting;

public class IslandParentCast {
    public void cast(IslandParent obj) {
        System.out.println("Casting IslandParent");
        obj.category();
        obj.largestIsland();
        obj.mostPopulatedIsland();
        obj.islandClimate();
        obj.famousIsland();
        if(obj instanceof IslandParentDetails) {
            IslandParentDetails ref = (IslandParentDetails)obj;
            ref.extraMethod();
        }
    }
}
