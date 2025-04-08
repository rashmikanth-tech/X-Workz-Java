package casting;

public class SoapParentDetails extends SoapParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in SoapParentDetails");
    }

    @Override
    public void keyIngredient() {
        System.out.println("Overridden: keyIngredient in SoapParentDetails");
    }

    @Override
    public void benefits() {
        System.out.println("Overridden: benefits in SoapParentDetails");
    }

    @Override
    public void usage() {
        System.out.println("Overridden: usage in SoapParentDetails");
    }

    @Override
    public void brands() {
        System.out.println("Overridden: brands in SoapParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in SoapParentDetails");
    }
}
