public class SimpleReplace {
    public static void main(String[] args) {
        String example = "In a dishwasher far far away";
        System.out.println(example.replace("dishwasher", "galaxy"));

        example = example.replace("dishwasher", "galaxy");
        System.out.println(example);
    }
}
