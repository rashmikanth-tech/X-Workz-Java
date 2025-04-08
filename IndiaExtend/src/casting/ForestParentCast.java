package casting;

public class ForestParentCast {
    public void cast(ForestParent obj) {
        System.out.println("Casting ForestParent");
        obj.category();
        obj.largestForest();
        obj.biodiversity();
        obj.forestArea();
        obj.forestImportance();
        if(obj instanceof ForestParentDetails) {
            ForestParentDetails ref = (ForestParentDetails)obj;
            ref.extraMethod();
        }
    }
}
