import java.util.ArrayList;
import java.util.Iterator;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> introductionList = new ArrayList<>();

        System.out.println(introductionList.size());

        introductionList.add("William");

        System.out.println(introductionList.isEmpty());

        introductionList.add("John");
        introductionList.add("Amanda");
        System.out.println(introductionList.size());
        System.out.println(introductionList.get(2));

        Iterator<String> iterator = introductionList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        for (int i = 0; i < introductionList.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, introductionList.get(i));
        }

        introductionList.remove(1);

        for (int i = introductionList.size()-1; i >=0; i--) {
            System.out.println(introductionList.get(i));
        }
        introductionList.removeAll(introductionList);
        System.out.println(introductionList.size());
        }

}
