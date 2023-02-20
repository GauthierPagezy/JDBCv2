package Model;

import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Repository4 {
    java.sql.PreparedStatement pstmt = null;
    ResultSet resultat = null;

    public ResultSet selectNomByFiliere(Connection conn, String f1, String f2) {
        String sql = "SELECT nom, nomFil FROM candidat INNER JOIN filiere ON candidat.idFil = filiere.idFil WHERE nomFil = ? OR nomFil = ?";
        try {
            this.pstmt =  conn.prepareStatement(sql);
            pstmt.setString(1,f1);
            pstmt.setString(2,f2);
            this.resultat = pstmt.executeQuery();
        } catch (SQLException e) {
            System.out.println("Erreur lors du chargement "+e.getMessage());
        }
        return this.resultat;
    }
}

