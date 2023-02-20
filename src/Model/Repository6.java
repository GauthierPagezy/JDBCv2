package Model;

import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Repository6 {
    java.sql.PreparedStatement pstmt = null;

    public void updateEmailDateCandidat(Connection conn, String idCand, String date, String email) {
        String sql = "UPDATE candidat SET courriel = ?, datenaiss = ? WHERE idCand = ?";
            try {
            this.pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, date);
            pstmt.setString(3, idCand);
        } catch (SQLException e) {
            System.out.println("Erreur lors du chargement " + e.getMessage());
        }
    }
}

