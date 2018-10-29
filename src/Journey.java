public class Journey {
    private String routeCode;
    private int delay;
    private Boolean weatherRelated;

    public Journey(String routeCode,int delay, Boolean weatherRelated){
        this.routeCode=routeCode;
        this.delay=delay;
        this.weatherRelated=weatherRelated;
    }

    public int getDelay() {
        return this.delay;
    }

    public String getRouteCode() {
        return this.routeCode;
    }

    public Boolean getWeatherRelated() {
        return this.weatherRelated;
    }
}