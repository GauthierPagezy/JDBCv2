package Model;

import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Repository7 {
        java.sql.PreparedStatement pstmt = null;
        private int state = 0;

        public void deleteByIdCand(Connection conn, String idCand) {
            String sql = "DELETE FROM candidat WHERE idCand = ? AND EXISTS (SELECT * FROM candidat WHERE idCand = ?);";
            try {
                this.pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, idCand);
                pstmt.setString(2, idCand);
               this.state = pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println("Erreur lors du chargement et retour de la fonction" + e.getMessage()+this.state);
            }
        }
    }



