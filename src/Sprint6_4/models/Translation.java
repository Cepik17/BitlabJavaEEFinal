package Sprint6_4.models;

import java.util.ArrayList;

public class Translation {
    public static ArrayList<ArrayList<String>> translations = new ArrayList<>();

    static {
        ArrayList<String> english = new ArrayList<>();
        ArrayList<String> russian = new ArrayList<>();

        english.add("Admin panel");
        english.add("Posted");
        english.add("Add News");
        english.add("Title");
        english.add("Post date");
        english.add("Language");
        english.add("Details");
        english.add("Content");
        english.add("Cancel");

        russian.add("Админ панель");
        russian.add("Опубликовано");
        russian.add("Добавить");
        russian.add("Заголовок");
        russian.add("Дата публикации");
        russian.add("Язык");
        russian.add("Подробнее");
        russian.add("Содержание");
        russian.add("Отмена");

        translations.add(english);
        translations.add(russian);

    }
}
