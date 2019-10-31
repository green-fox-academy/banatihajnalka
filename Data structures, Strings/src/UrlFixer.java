public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds");
        String separateUrl = url.substring(5);
        url = "https:" + separateUrl;
        System.out.println(url);

    }
}
