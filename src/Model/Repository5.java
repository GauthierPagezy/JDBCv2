package Model;

import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Repository5 {
    java.sql.PreparedStatement pstmt = null;
    ResultSet resultat = null;

    public ResultSet selectMoyenneByNom(Connection conn, String idCand) {
        String sql = "SELECT note FROM resultat INNER JOIN candidat ON resultat.idCand = candidat.idCand WHERE nom = ?";
        try {
            this.pstmt =  conn.prepareStatement(sql);
            pstmt.setString(1,idCand);
            this.resultat = pstmt.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erreur lors du chargement "+e.getMessage());
        }
        return this.resultat;
    }
}

