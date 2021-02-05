package MenuPac.Lists;



import java.util.HashMap;

public class RegularSpendingHash {
    HashMap<Integer,Services> regularHashMap = new HashMap<>();

    public void createRegularHash () {
        regularHashMap.put(1,new Services("Интернет",900));
        regularHashMap.put(2,new Services("Подписки",650));
        regularHashMap.put(3,new Services("Комунальные услуги",1200));
        regularHashMap.put(4,new Services("Содеражание двора",350));
    }

    public void viewRegularHash() {
       regularHashMap.forEach((k,v) -> System.out.println(k + ":" + v));
    }

    public HashMap<Integer, Services> getRegularHashMap() {
        return regularHashMap;
    }


    public String getNameOfService(int numberOfService) {
        var getName = regularHashMap.containsValue(numberOfService);
        if (getName != true) {
            return regularHashMap.get(numberOfService).getNameOfService();
        }
        return "Такой услуги не найдено";
    }

    public double getCostOfService(int numberOfService) {
        var checkService = regularHashMap.containsKey(numberOfService);
        if (checkService != false) {
            return regularHashMap.get(numberOfService).getCostOfService();
        }
        return numberOfService;
    }

}
