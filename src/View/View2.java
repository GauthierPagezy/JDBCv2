package View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class View2 {
    public void showView(ResultSet resultat) throws SQLException {
        resultat.first();
        String nomdetest = resultat.getString("nom");
        System.out.println("ETUDIANT : "+nomdetest+"\n");
        System.out.println(resultat.getString("designation")+"  : "+resultat.getString("note")+"");
        while (resultat.next()){
            String nomactuel = resultat.getString("nom");
            if (!nomdetest.equals(nomactuel)){
                nomdetest = nomactuel;
                System.out.println("\n\nETUDIANT : "+nomactuel+"\n");
            }
            System.out.println(resultat.getString("designation")+" : "+resultat.getString("note"));
        }
    }
}
