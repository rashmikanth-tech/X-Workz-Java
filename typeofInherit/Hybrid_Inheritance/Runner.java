package com.xworkz.typeofInherit.Hybrid_Inheritance;

public class Runner {
    public static void main(String[] args) {
        //1.
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Boat boat = new Boat();
        AmphibiousVehicle amphibiousVehicle = new AmphibiousVehicle();
        vehicle.startEngine();
        car.startEngine();
        car.drive();
        boat.startEngine();
        boat.sail();
        amphibiousVehicle.startEngine();
        amphibiousVehicle.drive();
        amphibiousVehicle.sail();
        //2.
        Equipment equipment = new Equipment();
        Electronics electronics = new Electronics();
        Machinery machinery = new Machinery();
        SmartPhone smartphone = new SmartPhone();
        equipment.turnOn();
        electronics.turnOn();
        electronics.displayInfo();
        machinery.turnOn();
        machinery.operate();
        smartphone.turnOn();
        smartphone.displayInfo();
        smartphone.makeCall();
        //3.
        Media media = new Media();
        Audio audio = new Audio();
        Video video = new Video();
        Song song = new Song();
        media.play();
        audio.play();
        audio.playAudio();
        video.play();
        video.playVideo();
        song.play();
        song.playAudio();
        song.playSong();
        //4.
        Device device = new Device();
        ElectronicDevice electronicDevice = new ElectronicDevice();
        MechanicalDevice mechanicalDevice = new MechanicalDevice();
        SmartPhone2 smartPhone2 = new SmartPhone2();
        device.turnOn();
        electronicDevice.turnOn();
        electronicDevice.displayInfo();
        mechanicalDevice.turnOn();
        mechanicalDevice.operate();
        smartphone.turnOn();
        smartphone.displayInfo();
        smartphone.makeCall();
        //5.
        LivingBeing livingBeing = new LivingBeing();
        Animal animal = new Animal();
        Plant plant = new Plant();
        Mammal mammal = new Mammal();
        livingBeing.breathe();
        animal.breathe();
        animal.eat();
        plant.breathe();
        plant.photosynthesize();
        mammal.breathe();
        mammal.eat();
        mammal.giveBirth();
        //6.
        Publication publication = new Publication();
        Book book = new Book();
        Article article = new Article();
        TechnicalBook technicalBook = new TechnicalBook();
        publication.publish();
        book.publish();
        book.read();
        article.publish();
        article.readArticle();
        technicalBook.publish();
        technicalBook.read();
        technicalBook.study();
        //7.
        Content content = new Content();
        Text text = new Text();
        MediaFile mediaFile = new MediaFile();
        Documentary documentary = new Documentary();
        content.display();
        text.display();
        text.read();
        mediaFile.display();
        mediaFile.play();
        documentary.display();
        documentary.play();
        documentary.watch();
        //8.
        Data data = new Data();
        TextData textData = new TextData();
        FileData fileData = new FileData();
        XMLData xmlData = new XMLData();
        data.process();
        textData.process();
        textData.readText();
        fileData.process();
        fileData.readFile();
        xmlData.process();
        xmlData.readFile();
        xmlData.parseXML();
        //9.
        BaseComponent baseComponent = new BaseComponent();
        UIComponent uiComponent = new UIComponent();
        DataComponent dataComponent = new DataComponent();
        ChartComponent chartComponent = new ChartComponent();
        baseComponent.render();
        uiComponent.render();
        uiComponent.display();
        dataComponent.render();
        dataComponent.loadData();
        chartComponent.render();
        chartComponent.display();
        chartComponent.drawChart();
        //10.
        BaseEntity baseEntity = new BaseEntity();
        Person person = new Person();
        Product product = new Product();
        Customer customer = new Customer();
        baseEntity.save();
        person.save();
        person.displayPerson();
        product.save();
        product.displayProduct();
        customer.save();
        customer.displayPerson();
        customer.purchase();
        //11.
        BaseTask baseTask = new BaseTask();
        ProcessTask processTask = new ProcessTask();
        ReportTask reportTask = new ReportTask();
        ScheduledTask scheduledTask = new ScheduledTask();
        baseTask.execute();
        processTask.execute();
        processTask.processData();
        reportTask.execute();
        reportTask.generateReport();
        scheduledTask.execute();
        scheduledTask.processData();
        scheduledTask.schedule();
    }
}
