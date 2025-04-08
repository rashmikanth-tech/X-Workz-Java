package casting;

public class HairGelParentDetails extends HairGelParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in HairGelParentDetails");
    }

    @Override
    public void keyIngredient() {
        System.out.println("Overridden: keyIngredient in HairGelParentDetails");
    }

    @Override
    public void benefits() {
        System.out.println("Overridden: benefits in HairGelParentDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in HairGelParentDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in HairGelParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in HairGelParentDetails");
    }
}
