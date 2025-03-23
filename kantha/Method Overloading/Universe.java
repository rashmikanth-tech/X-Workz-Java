public class Universe {
    public static void main(String[] args) {
        // Venus
        Venus.venusDefault("Yellowish-White");
        Venus.atmosphereColor("Thick Clouds");
        Venus.skyColor("Orange");
        Venus.gravity(8.87, 464);
        Venus.temperature(464);
        Venus.diameter(12104);
        Venus.distanceFromSun(108200000L);

        // Mars
        Mars.marsDefault("Red");
        Mars.surfaceColor("Reddish-Brown");
        Mars.skyColor("Pinkish");
        Mars.gravity(3.721, (byte) -63);
        Mars.temperature((byte) -63);
        Mars.diameter(6792);
        Mars.distanceFromSun(227943824L);

        // Jupiter
        Jupiter.jupiterDefault("Orange and White");
        Jupiter.stormColor("Red");
        Jupiter.atmosphereColor("White and Yellow");
        Jupiter.gravity(24.79, (short) -145);
        Jupiter.temperature((short) -145);
        Jupiter.diameter(139820);
        Jupiter.distanceFromSun(778500000L);

        // Saturn
        Saturn.saturnDefault("Yellowish-Brown");
        Saturn.ringColor("Golden");
        Saturn.atmosphereColor("Pale Yellow");
        Saturn.gravity(10.44, (short) -178);
        Saturn.temperature((short) -178);
        Saturn.diameter(116460);
        Saturn.distanceFromSun(1433500000L);

        // Uranus
        Uranus.uranusDefault("Pale Blue");
        Uranus.atmosphereColor("Blue-Green");
        Uranus.skyColor("Cyan");
        Uranus.gravity(8.69, (short) -224);
        Uranus.temperature((short) -224);
        Uranus.diameter(50724);
        Uranus.distanceFromSun(2871000000L);

        // Neptune
        Neptune.neptuneDefault("Deep Blue");
        Neptune.stormColor("Dark Blue");
        Neptune.atmosphereColor("Methane Clouds");
        Neptune.gravity(11.15, (short) -214);
        Neptune.temperature((short) -214);
        Neptune.diameter(49244);
        Neptune.distanceFromSun(4495100000L);

        // Moon (Sky Class)
        Sky.moonDefault("Greyish-White");
        Sky.fullMoon("Bright White");
        Sky.nearHorizon("Orange");
        Sky.gravity(1.62, (byte) -20);
        Sky.temperature((byte) -20);
        Sky.diameter(3474);
        Sky.outside(384400L);
    }
}
