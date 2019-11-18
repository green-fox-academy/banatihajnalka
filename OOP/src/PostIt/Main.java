package PostIt;

import BlogPost.BlogPost;
import PostIt.PostIt;

import java.awt.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        PostIt first = new PostIt();
        first.backgroundColor = Color.orange;
        first.text = "Idea 1";
        first.textColor = Color.blue;

        PostIt second = new PostIt();
        second.backgroundColor = Color.pink;
        second.text = "Awesome";
        second.textColor = Color.black;

        PostIt third = new PostIt();
        third.backgroundColor = Color.yellow;
        third.text = "Superb";
        third.textColor = Color.green;

        System.out.println(first.backgroundColor);
        System.out.println(second.text);
        System.out.println("The third post-it is " + third.backgroundColor + "using textcolor " + third.textColor);

    }
}
