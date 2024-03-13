package Assgigment2;

class HillStations {
    String location;
    String place;

    void show(String location, String place) {
        System.out.println("Famous Place " + place + " " + " , Location " + location);
    }
}

class Manali extends HillStations {
    void show(String location, String place) {
        System.out.println("Famous Place " + place + " " + ", Location " + location);
    }
}

class Mussoorie extends HillStations {
    void show(String location, String place) {
        System.out.println("Famous Place " + place + " " + ", Location " + location);
    }
}

class Gulmarg extends HillStations {
    void show(String location, String place) {
        System.out.println("Famous Place " + place + " " + " Location " + location);
    }
}

public class Hill {
    public static void main(String[] args) {
        HillStations h = new HillStations();
        h.show("Delhi", "Burari");
        Manali ma = new Manali();
        ma.show("Goa", "beach");

        Mussoorie mu = new Mussoorie();
        mu.show("rajsthan", "sand");
    }
}