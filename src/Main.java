import Controller.Controller;
import Model.Connexion;
import Model.Repository3;
import Model.Repository5;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/concours1";
        Properties props = new Properties();
        props.setProperty("user","root");
        props.setProperty("password","");
        Connection conn = Connexion.getConnection(url,props);
        Controller controller = new Controller();






        //controller.selectCandidatFromSpecialite((com.mysql.jdbc.Connection) conn);
        //controller.selectCanditatNoteFromResultat((com.mysql.jdbc.Connection) conn);
        //controller.selectNoteByIdCand((com.mysql.jdbc.Connection) conn);
        //controller.selectMoyenneByNom((com.mysql.jdbc.Connection) conn);
        //controller.selectNomByFiliere((com.mysql.jdbc.Connection) conn);
        //controller.updateEmailDateCandidat((com.mysql.jdbc.Connection) conn);
        controller.deleteByIdCand((com.mysql.jdbc.Connection) conn);

    }
}