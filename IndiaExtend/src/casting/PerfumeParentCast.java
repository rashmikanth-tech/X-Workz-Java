package casting;

public class PerfumeParentCast {
    public void cast(PerfumeParent obj) {
        System.out.println("Casting PerfumeParent");
        obj.category();
        obj.keyIngredient();
        obj.benefits();
        obj.usage();
        obj.brands();
        if(obj instanceof PerfumeParentDetails) {
            PerfumeParentDetails ref = (PerfumeParentDetails)obj;
            ref.extraMethod();
        }
    }
}
