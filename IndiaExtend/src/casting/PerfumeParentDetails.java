package casting;

public class PerfumeParentDetails extends PerfumeParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in PerfumeParentDetails");
    }

    @Override
    public void keyIngredient() {
        System.out.println("Overridden: keyIngredient in PerfumeParentDetails");
    }

    @Override
    public void benefits() {
        System.out.println("Overridden: benefits in PerfumeParentDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in PerfumeParentDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in PerfumeParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in PerfumeParentDetails");
    }
}
