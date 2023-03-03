package db;
import models.Item;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static Long id = 5L;
    private static List<Item> items = new ArrayList<>();
    static {
        items.add(new Item(1L,"Iphone X",50000,20));
        items.add(new Item(1L,"Iphone 12",60000,20));
        items.add(new Item(1L,"Iphone 13",70000,20));
        items.add(new Item(1L,"Iphone 14",80000,20));
    }
    public static List<Item> getItems(){
        return items;
    }
    public static void addItem(Item item){
        item.setId(id);
        items.add(item);
        id++;
    }
    public static Item getItemById(Long id){
        for (Item item : items){
            if (item.getId().equals(id)){
                return item;
            }

        }
        return null;
    }

    public static List<Item> getApplePhones() {
        return items.stream().filter(item -> item.getName().equals("IPhone")).toList();
//        List<Item> iphones = new ArrayList<>();
//        for (Item item : items) {
//            if (item.getName().equals("IPhone")) {
//                iphones.add(item);
//            }
//        }
//        return iphones;
    }


}
