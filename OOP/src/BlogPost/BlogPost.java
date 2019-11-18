package BlogPost;

import java.sql.Timestamp;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost() {
    }

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
}
