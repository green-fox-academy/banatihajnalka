public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String stringToBeInserted = "always takes longer than";
        String whereToInsert = "It you"; // find "It you" location
        int loc_of_ItYou = quote.indexOf(whereToInsert);
        loc_of_ItYou = loc_of_ItYou + 3; // Shift with 3 characters (It )
        String part1 = quote.substring(0, loc_of_ItYou);
        String part2 = quote.substring(loc_of_ItYou, quote.length());
        quote = part1 + stringToBeInserted + " " + part2;
        System.out.println(quote);
    }
}
