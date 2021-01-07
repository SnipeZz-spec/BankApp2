package MenuPac;

import Cards.GeneralCard;
import MenuPac.Checks.ChecksOfInput;
import MenuPac.OperationsCard.CreateNewCard;
import MenuPac.OperationsCard.DeleteCard;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.*;

public class controlCardMenu {
    public void controlCardMenu(HashMap<Integer, GeneralCard> cardList) {
        ChecksOfInput checkMethod = new ChecksOfInput();
        InformationOfCard information = new InformationOfCard();
        CreateNewCard newCard = new CreateNewCard();
        DeleteCard deleteCard = new DeleteCard();

        while (true) {
            Scanner sc = new Scanner(System.in);
            MenuList menuList = new MenuList();
            System.out.println("----------------------------------------");
            System.out.println("---Вы вошли в меню управления картами---");
            System.out.println("----------------------------------------");
            menuList.viewControlCard();
            switch (checkMethod.checkInt()) {
                case 1:
                    if (cardList.isEmpty()) {
                        System.out.println("У вас пока нет созданных карт");
                        break;
                    }
                    else {
                        information.infOfCard(cardList);
                    }
                    break;
                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("----------Создание новой карты----------");
                    System.out.println("----------------------------------------");
                    newCard.createCard(cardList);
                    break;
                case 3:
                    System.out.println("----------------------------------------");
                    System.out.println("-------------Удаление карты-------------");
                    System.out.println("----------------------------------------");
                    deleteCard.deleteCard(cardList);
                    break;




            }
        }
    }

}
