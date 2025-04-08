package casting;

public class HairGelParentCast {
    public void cast(HairGelParent obj) {
        System.out.println("Casting HairGelParent");
        obj.category();
        obj.keyIngredient();
        obj.benefits();
        obj.usage();
        obj.brands();
        if(obj instanceof HairGelParentDetails) {
            HairGelParentDetails ref = (HairGelParentDetails)obj;
            ref.extraMethod();
        }
    }
}
