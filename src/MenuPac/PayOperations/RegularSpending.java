package MenuPac.PayOperations;

import Cards.GeneralCard;
import MenuPac.Checks.ChecksOfInput;
import MenuPac.Lists.RegularSpendingHash;
import MenuPac.Lists.Services;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RegularSpending {

    public void regularSpend(HashMap<Integer, GeneralCard> cardList, HashMap<Integer,Services> regularHashMap) {
        InformationOfCard information = new InformationOfCard();
        while (true) {
            Scanner sc = new Scanner(System.in);
            ChecksOfInput checks = new ChecksOfInput();
            RegularSpendingHash regularSpendingHash = new RegularSpendingHash();
            regularSpendingHash.createRegularHash();
            ArrayList<GeneralCard> cardNumberList = new ArrayList<>(cardList.values());
            ArrayList<Services> servicesList = new ArrayList<>(regularHashMap.values());

            while (true) {
                System.out.println("----------------------------------------------------------");
                System.out.println("-----Вы вошли в раздел оплаты регулярных счетов счетов----");
                System.out.println("----------------------------------------------------------");


            }

        }
    }
}
