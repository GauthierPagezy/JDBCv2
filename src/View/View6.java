package View;

import javax.swing.*;
import java.util.ArrayList;

public class View6 {

    private ArrayList <String> infos;

    public View6(){
        this.infos = new ArrayList<String>();
    }
    public void demanderInfos() {
        infos.add(JOptionPane.showInputDialog(null, "Entrez l'ID du candidat"));
        infos.add(JOptionPane.showInputDialog(null, "Entrez l'email à modifier"));
        infos.add(JOptionPane.showInputDialog(null, "Entrez la date à modifier"));
    }

    public ArrayList<String> getInfos() {
        return infos;
    }


}
