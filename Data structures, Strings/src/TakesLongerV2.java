public interface TakesLongerV2 {
    public static void main(String[] args) {
        StringBuilder quote = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        String whereToInsert = "It you"; // find "It you" location
        int loc_of_ItYou = quote.indexOf(whereToInsert);
        System.out.println(loc_of_ItYou);

        quote.insert(loc_of_ItYou + 3, "always takes longer than ");
        System.out.println(quote);
    }


}
