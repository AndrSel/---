package runner;

import dto.Cart;
import dto.Catalog;
import dto.User;
import dto.item.impl.ChairItem;
import dto.item.impl.LampItem;
import dto.item.impl.MeatItem;
import dto.item.impl.TableItem;
import enums.SortEnum;
import repo.CatalogRepo;
import repo.ItemRepo;

import java.util.Date;
import java.util.HashMap;

import static constant.PropertyConstant.BCRYPT_CONSTANT_PARAMETER;

public class OnlineMarket {

    private static final HashMap<String, User> users = new HashMap<>(10);
    private static final Cart cart = new Cart();

    public static boolean isExistsUser(String login) {
        return users.containsKey(login);
    }

    public static User getUser(String login) {
        return users.get(login);
    }


    public static void main(String[] args) {

        init();

        User user = User.login("qwe", "qwe");
        System.out.printf("несуществующий пользователь: %s\n", user.getLogin());

        user = User.login("Andreyy", "Andreyy");
        System.out.printf("Существующий пользователь: %s\n", user.getLogin());

        Catalog.showAllCatalogs();

        initItems();
        System.out.println("Сортировка по цене");
        CatalogRepo.findByName("Furniture").printAndSortCatalogItems(SortEnum.PRICE);

        System.out.println("Сортировка по имени");
        Catalog catalog = CatalogRepo.findByName("Furniture");
        catalog.printAndSortCatalogItems(SortEnum.NAME);


        System.out.println("Добавление товаров в корзину");
        cart.addItem("Chair");
        cart.addItem("Table");
        cart.addItem("Lamp");
        //System.out.println("Show before add in cart");
        //catalog.printAndSortCatalogItems(SortEnum.NAME);

        System.out.println("Общая сумма корзины");
        System.out.printf("%.2f\n",cart.getSummary());

        cart.doOrder();
        System.out.println("Общая сумма корзины после покупки");
        System.out.printf("%.2f\n",cart.getSummary());
    }

    private static void init() {
        System.setProperty(BCRYPT_CONSTANT_PARAMETER, "$2a$10$DjOkk0IX5.zEu/VraKU7re");
        users.put("Andreyy", User.register("Andreyy", "Andreyy"));

        CatalogRepo.save(new Catalog("Food"));
        CatalogRepo.save(new Catalog("Furniture"));
    }

    private static void initItems() {
        Catalog catalog = CatalogRepo.findByName("Furniture");
        Catalog food = CatalogRepo.findByName("Food");
        ItemRepo.add(new ChairItem("NewChair", 12.2, catalog, "dsp", "hi-tech"));
        ItemRepo.add(new ChairItem("Chair", 21.2, catalog, "wood", "old"));
        ItemRepo.add(new TableItem("Table", 212.2, catalog, "wood", "old"));
        ItemRepo.add(new LampItem("Lamp", 21.2, catalog, "steel", "style", "white"));
        ItemRepo.add(new MeatItem("Meat", 41.2, food, new Date(), "old"));
    }

}
