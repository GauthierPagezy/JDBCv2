package Controller;

import Model.*;
import View.*;
import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {
    private final Repository1 repository1 =  new Repository1();
    private final Repository2 repository2 = new Repository2();
    private final Repository3 repository3 = new Repository3();

    private final Repository4 repository4= new Repository4();
    private final Repository5 repository5 = new Repository5();
    private final Repository6 repository6 = new Repository6();

    private final Repository7 repository7 = new Repository7();

    private final View1 view1 = new View1();
    private final View2 view2 = new View2();
    private final View3 view3 = new View3();

    private final View4 view4 = new View4();
    private final View5 view5 = new View5();
    private final View6 view6 = new View6();
    private final View7 view7 = new View7();
    public void selectCandidatFromSpecialite(Connection conn) {
        try {
            ResultSet resultat = repository1.selectCandidatFromSpecialite(conn);
            view1.showView(resultat);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectCanditatNoteFromResultat(Connection conn) {
        try {
            ResultSet resultat = repository2.selectCanditatNoteFromResultat(conn);
            view2.showView(resultat);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectNoteByIdCand(Connection conn) {
        try {
            view3.demanderIdCandidat();
            ResultSet resultat = repository3.selectNoteByIdCand(conn, view3.getIdCandidat());
            view3.showView(resultat);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectMoyenneByNom(Connection conn) {
        try {
            view5.demanderMoyenneNomCandidat();
            ResultSet resultat = repository5.selectMoyenneByNom(conn, view5.getNom());
            view5.showView(resultat);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectNomByFiliere(Connection conn){
        try {
            view4.demanderFilieres();
            ResultSet resultat = repository4.selectNomByFiliere(conn, view4.getF1(), view4.getF2());
            view4.showView(resultat);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateEmailDateCandidat(Connection conn){
        try {
            view6.demanderInfos();
            String id = view6.getInfos().get(0);
            String email = view6.getInfos().get(1);
            String date = view6.getInfos().get(2);
            repository6.updateEmailDateCandidat(conn,id,date,email);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteByIdCand(Connection conn){
        try {
            String id = view7.demanderIdCand();
            repository7.deleteByIdCand(conn,id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
