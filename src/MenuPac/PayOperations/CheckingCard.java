package MenuPac.PayOperations;

import Cards.GeneralCard;
import MenuPac.Lists.Services;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class CheckingCard {

    //метод получения стоимости услуги (например Интернет - 900 рублей)
    public double getCostOfService(int numberOfService, HashMap<Integer,Services> regularHashMap) {
        while (true) {
            if (numberOfService == 0) {
                break;
            }
            ArrayList<Services> servicesList = new ArrayList<>(regularHashMap.values());
            return servicesList.get(numberOfService).getCostOfService();
        }
        return -1;
    }

    // метод операции опалаты
    public void payOperation (HashMap<Integer, GeneralCard> cardList, HashMap<Integer,Services> regularHashMap) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            InformationOfCard information = new InformationOfCard();

            regularHashMap.forEach((k,v) -> System.out.println(v));
            System.out.println("Выберите услугу, оплату которой следует произвести: ");
            while (!sc.hasNextInt()) {
                System.out.println("Некорректное значение! Повторите ввод");
                sc.next();
            }
            var numberOfService = sc.nextInt();
            information.infOfCard(cardList);
            System.out.println("С какой карты выполнить оплату?");
            while (!sc.hasNextInt()){
                System.out.println("Некорректное значение повторите ввод");
                sc.next();
            }
            var cardFrom = sc.nextInt();
            var balanceOfCard = payCheck(cardFrom);
            var sumOfService = getCostOfService(numberOfService); //ругается
            //
            //
            //
            //
            // тут  дальше будет изменение баланса и так далее
            //
            //
            //
            //
        }
    }

    // метод проверки ввода данных карты и получения ее баланса
    public double payCheck(int numberOfCard) {
        while (true) {
            if (numberOfCard == 0) {
                break;
            } else if (numberOfCard < 10000000 || numberOfCard > 99999999) {
                System.out.println("Некорректное значение! Повторите ввод");
                continue;
            }
            var cardFrom = getCard(numberOfCard);
            if (cardFrom.isEmpty()) {
                System.out.println("Такой карты не существует");
                break;
            }
            return cardFrom.get().getBalance();
        }
        return -1;
    }

    // метод проверки наличия карты - работает совместно с PayCheck(выше)
    private Optional<GeneralCard> getCard(int number) {
        ArrayList<GeneralCard> cardNumberList = new ArrayList<>();
        var curCard = cardNumberList.stream().filter(c -> c.getNumber() == number).findFirst();
        if (curCard.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(curCard.get());
    }

}
