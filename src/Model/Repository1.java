package Model;

import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Repository1 {

    java.sql.Statement stmt = null;
    ResultSet resultat = null;
    public ResultSet selectCandidatFromSpecialite(Connection conn) {
        String sql = "Select libelle, nom From specialite INNER JOIN candidat ON candidat.idSpec = specialite.idSpec ORDER BY libelle";
        try {
            this.stmt = (Statement) conn.createStatement();
            this.resultat = stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Erreur lors du chargement "+e.getMessage());
        }
        return this.resultat;
    }
}


