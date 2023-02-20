package Model;

import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Repository2 {
        java.sql.Statement stmt = null;
        ResultSet resultat = null;

        public ResultSet selectCanditatNoteFromResultat(Connection conn) {
            String sql = "Select nom, note, designation  from candidat INNER JOIN resultat ON candidat.idCand = resultat.idCand INNER JOIN epreuve ON resultat.idEpr = epreuve.idEpr ORDER BY nom";
            try {
                this.stmt = (Statement) conn.createStatement();
                this.resultat = stmt.executeQuery(sql);
            } catch (SQLException e) {
                System.out.println("Erreur lors du chargement "+e.getMessage());
            }
            return this.resultat;
        }
    }

