package MenuPac.Lists;

public class Services {
    private String nameOfService;
    private double costOfService;

    public Services(String nameOfService, double costOfService) {
        this.nameOfService = nameOfService;
        this.costOfService = costOfService;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public double getCostOfService() {
        return costOfService;
    }

    public void setCostOfService(double costOfService) {
        this.costOfService = costOfService;
    }

    @Override
    public String toString() {
        return "Услуга: " + nameOfService + " Стоимость: " + costOfService + " рублей";
    }



}
