package View;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View4 {
    private String f1;
    private String f2;

    public void demanderFilieres() {
        String f1f2 = JOptionPane.showInputDialog(null, "Entrez F1 et F2 séparés par un tiret :");
        String[] tab = f1f2.split("-");
        f1 = tab[0].trim();
        f2 = tab[1].trim();
    }

    public String  getF1() {
        return f1;
    }

    public String getF2() {
        return f2;
    }

    public void showView(ResultSet resultat) throws SQLException {
        resultat.first();
        String filieredetest = resultat.getString("nomFil");
        System.out.println("FILIERE : "+filieredetest+"\n");
        System.out.println(resultat.getString("nom"));
        while (resultat.next()){
            String filiereactuelle = resultat.getString("nomFil");
            if (!filieredetest.equals(filiereactuelle)){
                filieredetest = filiereactuelle;
                System.out.println("\n\nETUDIANT : "+filiereactuelle+"\n");
            }
            System.out.println(resultat.getString("nom"));
        }
    }

}


