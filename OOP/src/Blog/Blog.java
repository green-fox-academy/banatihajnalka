package Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    public List<BlogPost> listOfBlogs;

    public Blog() {
        this.listOfBlogs = new ArrayList<>();
    }

    public void add(BlogPost blogPost) {
        listOfBlogs.add(blogPost);
    }

    public void delete(int i) {
        listOfBlogs.remove(i);
    }

    public void update(int i, BlogPost updaterPost) {
        listOfBlogs.set(i, updaterPost);
    }

//    @Override
//    public String toString() {
//        String result = "";
//        for (int i = 0; i < listOfBlogs.size(); i++) {
//            result += listOfBlogs.get(i) + "" + ", ";
//        }
//        return result;
//    }
}
