package Inner;

public class CameraRecords {
    public void cameraData(Camera camera){
        System.out.println("Camara Brand : "+camera.getBrand());
        System.out.println("Camara Price : "+camera.getPrice());
        System.out.println("Camara Type : "+camera.getType());;

    }
    public void addData(){
        Camera camera= new Camera();
        camera.setBrand("Nicon");
        camera.setPrice(950000);

        cameraData(camera);
    }
}
