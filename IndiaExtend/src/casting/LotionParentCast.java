package casting;

public class LotionParentCast {
    public void cast(LotionParent obj) {
        System.out.println("Casting LotionParent");
        obj.category();
        obj.keyIngredient();
        obj.benefits();
        obj.usage();
        obj.brands();
        if(obj instanceof LotionParentDetails) {
            LotionParentDetails ref = (LotionParentDetails)obj;
            ref.extraMethod();
        }
    }
}
