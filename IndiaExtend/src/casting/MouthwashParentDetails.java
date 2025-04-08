package casting;

public class MouthwashParentDetails extends MouthwashParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in MouthwashParentDetails");
    }

    @Override
    public void keyIngredient() {
        System.out.println("Overridden: keyIngredient in MouthwashParentDetails");
    }

    @Override
    public void benefits() {
        System.out.println("Overridden: benefits in MouthwashParentDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in MouthwashParentDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in MouthwashParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MouthwashParentDetails");
    }
}
