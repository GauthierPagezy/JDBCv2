package View;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View5 {

    private String nom;
    private Double moyenne;

    public void demanderMoyenneNomCandidat() {
        String moyenneNom = JOptionPane.showInputDialog(null, "Entrez la moyenne et le nom de l'étudiant séparés par un tiret :");
        String[] tab = moyenneNom.split("-");
        moyenne = Double.parseDouble(tab[0].trim());
        nom = tab[1].trim();
    }

    public String getNom() {
        return nom;
    }

    public void showView(ResultSet resultat) throws SQLException {
        double total = 0;
        int nbNotes= 0;
        System.out.println("Elève :"+nom);
        while (resultat.next()) {
            total += resultat.getBigDecimal("note").doubleValue();
            nbNotes++;
        }
        if (total/nbNotes>moyenne){
            System.out.println("La moyenne de "+nom+" est plus haute que"+moyenne);
        } else System.out.println("Echec");
    }
}
