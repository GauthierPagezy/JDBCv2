package View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class View1 {
    public void showView(ResultSet resultat) throws SQLException {
        resultat.first();
        String libelledetest = resultat.getString("libelle");
        System.out.println("Spécialité "+libelledetest+" :");
        System.out.println(resultat.getString("nom"));
        while (resultat.next()){
            String libelleactuel = resultat.getString("libelle");
            if (!libelledetest.equals(libelleactuel)){
                libelledetest = libelleactuel;
                System.out.println("\n\nSpécialité "+libelleactuel);
            }
            System.out.println(resultat.getString("nom"));
        }
    }
}

