//Create a function named isSymmetric that takes an n×n integer matrix (two dimensional array/list) as a parameter,
//and returns true if the matrix is symmetric or false if it is not.
//Symmetric means it has identical values along its diagonal axis from top-left to bottom-right, as in the first example.


import java.util.ArrayList;
import java.util.List;

public class IsSymmetricListWithGivenNumber {

    public static void main(String[] args) {
        List<List<Integer>> listOfNumbers = new ArrayList<List<Integer>>();
        int numberOfArrays = 3;
        for (int i = 0; i < numberOfArrays; i++) {
            listOfNumbers.add(new ArrayList<>());
        }
        listOfNumbers.get(0).add(1);
        listOfNumbers.get(0).add(0);
        listOfNumbers.get(0).add(1);

        listOfNumbers.get(1).add(0);
        listOfNumbers.get(1).add(2);
        listOfNumbers.get(1).add(2);

        listOfNumbers.get(2).add(1);
        listOfNumbers.get(2).add(2);
        listOfNumbers.get(2).add(5);

        System.out.println(listOfNumbers.get(0));
        System.out.println(listOfNumbers.get(1));
        System.out.print(listOfNumbers.get(2));
        System.out.println();

        int vertexCount = listOfNumbers.size();
        for (int i = 0; i < vertexCount; i++) {
            int edgeCount = listOfNumbers.get(i).size();
            for (int j = 0; j < edgeCount; j++) {
                Integer startVertex = i;
                Integer endVertex = listOfNumbers.get(i).get(j);
                System.out.printf("Vertex %d is connected to vertex %d%n", startVertex, endVertex);
            }
            }
        }
    }
