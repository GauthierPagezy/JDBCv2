package View;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View3 {
    private String idCandidat;

    public void demanderIdCandidat() {
        idCandidat = JOptionPane.showInputDialog(null, "Entrez l'ID du candidat : ");
    }

    public String getIdCandidat(){
        return idCandidat;
    }

    public void showView(ResultSet resultat) throws SQLException {
        double total = 0;
        int nbNotes= 0;
        System.out.println("Elève numéro n° "+idCandidat);
        while (resultat.next()) {
            total += resultat.getBigDecimal("note").doubleValue();
            nbNotes++;
        }
        System.out.println("Moyenne : "+total/nbNotes);
    }

}
