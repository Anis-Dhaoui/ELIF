import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        Document d1 = new Journal(false,"auteur x", "titre x", 150, 10.5f);
        Document d2 = new Journal(false,"auteur x", "titre x", 150, 10.5f);
        Document d3 = new Journal(false,"auteur x", "titre x", 150, 10.5f);
        Document d4 = new Journal(false,"auteur x", "titre x", 150, 10.5f);
        Document d5 = new Journal(false,"auteur x", "titre x", 150, 10.5f);
        Document d6 = new Journal(false,"auteur x", "titre x", 150, 10.5f);
        
        System.out.println(d1.toString());
    }

}
