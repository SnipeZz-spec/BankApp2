package MenuPac;

import Cards.GeneralCard;

import java.util.HashMap;


public class CardBase {
    //создание БД с картами

    private final HashMap<Integer, GeneralCard> allCard = new HashMap<>();

    public void unitDB() {
        allCard.put(12345678, new GeneralCard("Visa", 12345678, 12, 22,0));
        allCard.put(98745612, new GeneralCard("Maestro", 98745612, 12, 25, 5000));
    }

    public HashMap<Integer, GeneralCard> getAllCard() {
        return allCard;
    }


    public String payOperation(int cardFrom,double balanceOfCard, double sumOfService) {
        while (true) {
        if (allCard.get(cardFrom).getBalance() < sumOfService) {
            System.out.println("На карте недостаточно средств!");
            System.out.println("Выберите другую карту");
            break;
        }
        System.out.println("Операция выполнена успешно");
        System.out.println("Сумма списания: " + sumOfService + " рублей");
        allCard.get(cardFrom).setBalance(allCard.get(cardFrom).getBalance() - sumOfService);
        break;
        }
        return "Операция не была завершена";
    }

    public double getBalanceOfCard(int cardFrom) {
        if (checkEnterOfCard(cardFrom)) {
                return allCard.get(cardFrom).getBalance();
        }
        return -1;
    }

    public boolean checkEnterOfCard (int numberOfCard) {
            if (numberOfCard < 10000000 || numberOfCard > 99999999) {
                System.out.println("Некорректный ввод!");
                return false;
            }
            var checking = allCard.containsKey(numberOfCard);
            if (checking == false) {
                return false;
            }
            return true;
        }
    }
