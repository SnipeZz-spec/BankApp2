package MenuPac.Lists;

import java.util.HashMap;

public class PurchasesHashMap {
    //Класс в котором будет создаваться мапа покупок
    //тут хранится инфа с уникальным номером операции(key), название и сумма операции

    HashMap<String, Services> serviceBase = new HashMap<>();


    public void putInServiceBase(String nameOfService, double sumOfService) {
        var numberOfOperation = randomNumber();
        serviceBase.put(numberOfOperation, new Services(nameOfService, sumOfService));

    }

    // показать совершеные операции
    public void viewServiceBase() {
        while (true) {
            if (serviceBase.isEmpty()) {
                System.out.println("У вас пока нет совершенных операций");
                System.out.println(" ");
            }
            serviceBase.forEach((k, v) -> System.out.println("Номер операции: " + k + " || " + v + "\n"));
            break;
        }
    }

    // генерация номера операции покупки
    public String randomNumber() {
        var number = (int) ((Math.random() * 1000000000) + 1) ;
        var numberOfOperation = Integer.toString(number);
        numberOfOperation.substring(1,5);
        var codeString = numberOfOperation.substring(1,7).concat("**");
        return codeString;
    }
}
