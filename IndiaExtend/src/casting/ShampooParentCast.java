package casting;

public class ShampooParentCast {
    public void cast(ShampooParent obj) {
        System.out.println("Casting ShampooParent");
        obj.category();
        obj.keyIngredient();
        obj.benefits();
        obj.usage();
        obj.brands();
        if(obj instanceof ShampooParentDetails) {
            ShampooParentDetails ref = (ShampooParentDetails)obj;
            ref.extraMethod();
        }
    }
}
