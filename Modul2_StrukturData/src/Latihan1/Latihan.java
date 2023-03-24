package Latihan1;
import  java.util.ArrayList;
import java.util.List;

public class Latihan {
    public static void main(String[] args) {
        List<String> Hewan =new ArrayList<>(List.of("Sapi","Kelinci","Kambing","Unta","Domba"));
        List <String> DeleteHewan = new ArrayList<>(List.of("Kelinci", "Kambing", "Unta"));


        System.out.println("Hewan : "+Hewan);
        System.out.println("Hewan yang dihapus : "+DeleteHewan);

        Hewan.removeAll(DeleteHewan);
        System.out.println("Output Hewan :");
        for(String n : Hewan){
            System.out.print(" "+n);
        }
    }
}
