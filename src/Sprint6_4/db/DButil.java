package Sprint6_4.db;

import Sprint6_4.models.News;
import java.sql.*;
import java.util.ArrayList;

public class DButil {
    private static Connection connection;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/g111_db",
                    "postgres",
                    "postgres"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<News> getNews() {
        ArrayList<News> news = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "select * from news i order by i.post_date desc");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                News novost = new News();
                novost.setId(resultSet.getLong("id"));
                novost.setTitle(resultSet.getString("title"));
                novost.setContent(resultSet.getString("content"));
                novost.setLanguageId(resultSet.getInt("language_id"));
                novost.setPostDate(resultSet.getTimestamp("post_date").toLocalDateTime());
                news.add(novost);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return news;
    }

    public static void addNews(News news) {
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "insert into news(title, content, language_id, post_date) " +
                    "values (?,?,?,NOW())");
            statement.setString(1, news.getTitle());
            statement.setString(2, news.getContent());
            statement.setInt(3,news.getLanguageId());
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static News getNewsById(Long id) {
        News novost = new News();
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "select * from news i where i.id=?");
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                novost.setId(resultSet.getLong("id"));
                novost.setTitle(resultSet.getString("title"));
                novost.setContent(resultSet.getString("content"));
                novost.setLanguageId(resultSet.getInt("language_id"));
                novost.setPostDate(resultSet.getTimestamp("post_date").toLocalDateTime());
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return novost;
    }

    public static void editNews(News news) {
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "update news " +
                    "set title=?, content=?, language_id=? " +
                    "where id=?");
            statement.setString(1, news.getTitle());
            statement.setString(2, news.getContent());
            statement.setInt(3,news.getLanguageId());
            statement.setLong(4, news.getId());
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteNewsById(Long id) {
        try {
            PreparedStatement statement = connection.prepareStatement("" +
                    "delete from news i where i.id=?");
            statement.setLong(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


