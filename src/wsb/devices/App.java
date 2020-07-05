package wsb.devices;

public class App {

    private String name;
    private String version;
    private Double price;
    private String http;

    public App(String name, String version, Double price, String http) {
        this.name = name;
        this.version = version;
        this.price = price;
        this.http = http;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name + " " + this.version;
    }
    public String getHttp() {
        return http;
    }
}
