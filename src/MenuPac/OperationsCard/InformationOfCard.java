package MenuPac.OperationsCard;

import Cards.GeneralCard;

import java.util.HashMap;



public class InformationOfCard {
    //раздел получения информации о картах

    public void infOfCard(HashMap<Integer, GeneralCard> cardList) {
        if (cardList.isEmpty()) {
            System.out.println("У вас пока нет банковских карт");
            System.out.println(" ");
        }
        else {
            cardList.forEach((k,v) -> System.out.println(v));
        }
    }
}
