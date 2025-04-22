package com.xworkz.interfacee.runner;

import com.xworkz.interfacee.external.*;
import com.xworkz.interfacee.internal.*;
import com.xworkz.interfacee.external.TransportManager;


public class Runner {
    public static void main(String[] args) {

        Transport transport = new Car();
        TransportManager transportManager = new TransportManager(transport);
        transportManager.use();
        System.out.println("--------------");

        PaymentGateway paymentGateway = new PayPal();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);
        paymentProcessor.use();
        System.out.println("--------------");

        Shape shape = new Circle();
        DrawingTool drawingTool = new DrawingTool(shape);
        drawingTool.use();
        System.out.println("--------------");

        Database database = new MySQL();
        DBManager dBManager = new DBManager(database);
        dBManager.use();
        System.out.println("--------------");

        Animal animal = new Dog();
        ZooKeeper zooKeeper = new ZooKeeper(animal);
        zooKeeper.use();
        System.out.println("--------------");

        Language language = new PythonLang();
        Compiler compiler = new Compiler(language);
        compiler.use();
        System.out.println("--------------");

        Device device = new Mobile();
        TechSupport techSupport = new TechSupport(device);
        techSupport.use();
        System.out.println("--------------");

        Game game = new Football();
        Coach coach = new Coach(game);
        coach.use();
        System.out.println("--------------");

        Appliance appliance = new WashingMachine();
        HomeService homeService = new HomeService(appliance);
        homeService.use();
        System.out.println("--------------");

        Music music = new Guitar();
        MusicTeacher musicTeacher = new MusicTeacher(music);
        musicTeacher.use();
        System.out.println("--------------");

        Food food = new Pizza();
        Chef chef = new Chef(food);
        chef.use();
        System.out.println("--------------");

        Document document = new PDF();
        Printer printer = new Printer(document);
        printer.use();
        System.out.println("--------------");

        CloudService cloudService = new AWS();
        DevOps devOps = new DevOps(cloudService);
        devOps.use();
        System.out.println("--------------");

        SocialMedia socialMedia = new Instagram();
        SocialManager socialManager = new SocialManager(socialMedia);
        socialManager.use();
        System.out.println("--------------");

        MessageApp messageApp = new WhatsApp();
        Messenger messenger = new Messenger(messageApp);
        messenger.use();
        System.out.println("--------------");

        Currency currency = new Rupee();
        CurrencyExchanger currencyExchanger = new CurrencyExchanger(currency);
        currencyExchanger.use();
        System.out.println("--------------");

        Notification notification = new Email();
        Notifier notifier = new Notifier(notification);
        notifier.use();
        System.out.println("--------------");

        Sensor sensor = new TemperatureSensor();
        IoTDevice ioTDevice = new IoTDevice(sensor);
        ioTDevice.use();
        System.out.println("--------------");

        Engine engine = new DieselEngine();
        CarWorkshop carWorkshop = new CarWorkshop(engine);
        carWorkshop.use();
        System.out.println("--------------");

        Framework framework = new Spring();
        JavaDev javaDev = new JavaDev(framework);
        javaDev.use();
        System.out.println("--------------");

        Robot robot = new AndroidBot();
        AITrainer aITrainer = new AITrainer(robot);
        aITrainer.use();
        System.out.println("--------------");

        Camera camera = new DSLR();
        Photographer photographer = new Photographer(camera);
        photographer.use();
        System.out.println("--------------");

        Festival festival = new Diwali();
        EventOrganizer eventOrganizer = new EventOrganizer(festival);
        eventOrganizer.use();
        System.out.println("--------------");

        Plant plant = new Rose();
        Gardener gardener = new Gardener(plant);
        gardener.use();
        System.out.println("--------------");

        School school = new PrimarySchool();
        EducationBoard educationBoard = new EducationBoard(school);
        educationBoard.use();
        System.out.println("--------------");

        OS oS = new Linux();
        SysAdmin sysAdmin = new SysAdmin(oS);
        sysAdmin.use();
        System.out.println("--------------");

        Battery battery = new Lithium();
        Electrician electrician = new Electrician(battery);
        electrician.use();
        System.out.println("--------------");

        Weather weather = new Rain();
        WeatherReporter weatherReporter = new WeatherReporter(weather);
        weatherReporter.use();
        System.out.println("--------------");

        Security security = new Firewall();
        NetworkAdmin networkAdmin = new NetworkAdmin(security);
        networkAdmin.use();
        System.out.println("--------------");

        SmartDevice smartDevice = new Alexa();
        SmartHome smartHome = new SmartHome(smartDevice);
        smartHome.use();
        System.out.println("--------------");

        Browser browser = new Chrome();
        WebTester webTester = new WebTester(browser);
        webTester.use();
        System.out.println("--------------");

        Vehicle vehicle = new Bike();
        Mechanic mechanic = new Mechanic(vehicle);
        mechanic.use();
        System.out.println("--------------");

        Tool tool = new Hammer();
        Carpenter carpenter = new Carpenter(tool);
        carpenter.use();
        System.out.println("--------------");

        Hospital hospital = new Apollo();
        HealthDept healthDept = new HealthDept(hospital);
        healthDept.use();
        System.out.println("--------------");

        Movie movie = new Inception();
        CinemaFan cinemaFan = new CinemaFan(movie);
        cinemaFan.use();
        System.out.println("--------------");

        Book book = new Ramayana();
        Librarian librarian = new Librarian(book);
        librarian.use();
        System.out.println("--------------");

        Toy toy = new TeddyBear();
        ToyStore toyStore = new ToyStore(toy);
        toyStore.use();
        System.out.println("--------------");

        Bank bank = new SBI();
        BankManager bankManager = new BankManager(bank);
        bankManager.use();
        System.out.println("--------------");

        Fuel fuel = new Petrol();
        FuelStation fuelStation = new FuelStation(fuel);
        fuelStation.use();
        System.out.println("--------------");

        Laptop laptop = new Dell();
        ITGuy iTGuy = new ITGuy(laptop);
        iTGuy.use();
        System.out.println("--------------");

        Job job = new Developer();
        HR hR = new HR(job);
        hR.use();
        System.out.println("--------------");

        CurrencyExchange currencyExchange = new Forex();
        Traveler traveler = new Traveler(currencyExchange);
        traveler.use();
        System.out.println("--------------");

        Service service = new Plumbing();
        HomeOwner homeOwner = new HomeOwner(service);
        homeOwner.use();
        System.out.println("--------------");

        Art art = new Painting();
        Artist artist = new Artist(art);
        artist.use();
        System.out.println("--------------");

        Color color = new Red();
        Painter painter = new Painter(color);
        painter.use();
        System.out.println("--------------");

        Furniture furniture = new Chair();
        Showroom showroom = new Showroom(furniture);
        showroom.use();
        System.out.println("--------------");

        Clothing clothing = new TShirt();
        FashionDesigner fashionDesigner = new FashionDesigner(clothing);
        fashionDesigner.use();
        System.out.println("--------------");

        TransportService transportService = new Uber();
        Rider rider = new Rider(transportService);
        rider.use();
        System.out.println("--------------");

        AIModel aIModel = new ChatGPT();
        Coder coder = new Coder(aIModel);
        coder.use();
        System.out.println("--------------");

        Sport sport = new Cricket();
        SportsAnalyst sportsAnalyst = new SportsAnalyst(sport);
        sportsAnalyst.use();
        System.out.println("--------------");

        News news = new BBC();
        Reporter reporter = new Reporter(news);
        reporter.use();
        System.out.println("--------------");

                Connector connector = new ConnectTothing();
                ConnecterUse connecterUse = new ConnecterUse(connector);
                connecterUse.DisplayAll();
                System.out.println();


                ICC icc = new IndianCricketTeamIccImpl();
                BCCI bcci = new BCCI(icc);
                bcci.icc.Fiarplay();
                System.out.println();

                Consitution consitution= new CitizenConstituionImpl();
                Government government = new Government(consitution);
                government.consitution.followLaws();
                System.out.println();


                TV tv = new Airtel();
                User user = new User(tv);
                user.tv.Reciver();
                System.out.println();

                Face face = new Body();
                Human human = new Human(face);
                human.Parts();
                System.out.println();





            }
}
