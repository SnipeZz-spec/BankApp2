package MenuPac.PayOperations;

import MenuPac.Lists.PurchasesHashMap;

public class PayInformation {

    public void viewInformationOfPay(PurchasesHashMap purchasesHashMap) {
        //класс просмотра совершенных покупок

        while (true) {
            System.out.println("----------------------------------------------------------");
            System.out.println("------------ Информация о покупках и переводах -----------");
            System.out.println("----------------------------------------------------------");
            purchasesHashMap.viewServiceBase();
            break;
        }
    }


}
