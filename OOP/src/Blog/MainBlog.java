package Blog;
//Reuse your BlogPost class
//Create a Blog class which can
//        store a list of BlogPosts
//        add BlogPosts to the list
//        delete(int) one item at given index
//        update(int, BlogPost) one item at the given index and update it with another BlogPost


import java.util.List;

public class MainBlog {
    public static void main(String[] args) {
        Blog blog = new Blog();

        BlogPost fBP = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost sBP = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost tBP = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.", "2017.03.28.");

        blog.add(fBP);
        blog.add(sBP);
        blog.add(tBP);

//        System.out.println(blog);
        System.out.println(blog.listOfBlogs.toString());

        blog.delete(1);
        System.out.println(blog.listOfBlogs.toString());

        blog.update(0, tBP);
        System.out.println(blog.listOfBlogs.get(0));
    }
}
