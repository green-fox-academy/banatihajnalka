package Blog;

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

    @Override
    public String toString() {
        return title;
    }
}
