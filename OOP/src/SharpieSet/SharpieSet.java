package SharpieSet;
//Sharpie Set
//        Reuse your Sharpie class
//        Create SharpieSet class
//        it contains a list of Sharpie
//        countUsable() -> sharpie is usable if it has ink in it
//        removeTrash() -> removes all unusable sharpies


import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
   public List<Sharpie> sharpieList;

   public SharpieSet() {
      sharpieList = new ArrayList<>();
   }

   public void add(Sharpie sharpie) {
      this.sharpieList.add(sharpie);
   }

   public int countUsable() {
      int usableSharpies = 0;
      for (int i = 0; i < sharpieList.size(); i++) {
         if (sharpieList.get(i).inkAmount > 0) {
            usableSharpies += 1;
         }
      }
      return usableSharpies;


   }

   public void removeTrash() {
      String removed = "";
      for (int i = 0; i < sharpieList.size(); i++) {
         if (sharpieList.get(i).inkAmount == 0) {
            removed += sharpieList.get(i);
            sharpieList.remove(i);
         }

      }
   }
}

