package MenuPac;

import MenuPac.Checks.ChecksOfInput;
import MenuPac.Lists.MenuList;
import MenuPac.Lists.PurchasesHashMap;
import MenuPac.Lists.RegularSpendingHash;
import MenuPac.OperationsCard.CreateNewCard;
import MenuPac.OperationsCard.DeleteCard;
import MenuPac.OperationsCard.InformationOfCard;

import java.util.*;

public class controlCardMenu {
    //меню управления картами

    public void controlCardMenu(CardBase base, RegularSpendingHash hash, PurchasesHashMap purchasesHashMap) {
        ChecksOfInput checkMethod = new ChecksOfInput();
        InformationOfCard information = new InformationOfCard();
        CreateNewCard newCard = new CreateNewCard();
        DeleteCard deleteCard = new DeleteCard();
        FirstMenu firstMenuClass = new FirstMenu();

        while (true) {
            Scanner sc = new Scanner(System.in);
            MenuList menuList = new MenuList();
            System.out.println("----------------------------------------");
            System.out.println("---Вы вошли в меню управления картами---");
            System.out.println("----------------------------------------");
            menuList.viewControlCard();
            switch (checkMethod.checkInt()) {
                case 1:
                    if (base.getAllCard().isEmpty()) {
                        System.out.println("У вас пока нет созданных карт");
                        break;
                    }
                    else {
                        information.infOfCard(base.getAllCard());
                    }
                    break;
                case 2:
                    System.out.println("----------------------------------------");
                    System.out.println("----------Создание новой карты----------");
                    System.out.println("----------------------------------------");
                    newCard.createCard(base.getAllCard());
                    break;
                case 3:
                    System.out.println("----------------------------------------");
                    System.out.println("-------------Удаление карты-------------");
                    System.out.println("----------------------------------------");
                    deleteCard.deleteCard(base.getAllCard());
                    break;
                case 0:
                    firstMenuClass.firstMenu(base, hash, purchasesHashMap);
            }
        }
    }

}
