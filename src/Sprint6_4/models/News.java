package Sprint6_4.models;

import java.time.LocalDateTime;

public class News {
    private Long id;
    private String title;
    private String content;
    int languageId; // 1 - English, 2 - Русский

    LocalDateTime postDate;

    public LocalDateTime getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDateTime postDate) {
        this.postDate = postDate;
    }

    public News(String title, String content, int languageId) {

        this.title = title;
        this.content = content;
        this.languageId = languageId;
      //  this.postDate = postDate;
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
