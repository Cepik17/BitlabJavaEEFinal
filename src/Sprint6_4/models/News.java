package Sprint6_4.models;

public class News {
    Long id;
    String title;
    String content;
    int languageId; // 1 - English, 2 - Русский

    // Date postDate;

    public News(Long id, String title, String content, int languageId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.languageId = languageId;
    }

    public News() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
}
