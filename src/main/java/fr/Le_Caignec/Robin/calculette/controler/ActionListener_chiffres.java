package fr.Le_Caignec.Robin.calculette.controler;

import static fr.Le_Caignec.Robin.calculette.controler.methodes_operations.mon_nombre;
import fr.Le_Caignec.Robin.calculette.view.calculette_scientifique;
import fr.Le_Caignec.Robin.calculette.view.calculette_standard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
* @author Le Caignec Robin
* Dans cette classe des méthodes permettant d'écouter les boutons du types 
* "chiffres" de la calculettes qui ont été cliqués et d'appeler les méthodes 
* de la classe methodes_operations.java en conséquence.
*/

public class ActionListener_chiffres implements ActionListener {
    private calculette_standard gui;
    private calculette_scientifique gui2;

    public ActionListener_chiffres(calculette_standard view){
        this.gui=view;
    }
    public ActionListener_chiffres(calculette_scientifique view){
        this.gui2=view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e ){
        /**
        * Je recupère l'action de l'utilisateur ( quel bouton a été cliqué).
        */
        Object button_click= e.getSource();
        
        /**
        * Si un bouton de la caluette standard est cliqué alors je rentre dans 
        * le if ci-dessous.
        */
        if (this.gui!=null){
            /**
            * Je teste la valeur de l'objet button_click avec celle de tous les 
            * boutons du type "chiffre" présents dans la calculette standard et 
            * j'appele certaine méthode la classe methodes_operation.java en 
            * fonction du bouton cliqué par l'utilisateur.
            */
            
            if(button_click==gui.getNum_0()) {
                methodes_operations.getChiffre(0);
                gui.getResultat().setText(mon_nombre);

            }else if(button_click==gui.getNum_1()){
                methodes_operations.getChiffre(1);
                gui.getResultat().setText(mon_nombre);

            }else if(button_click==gui.getNum_2()){
                methodes_operations.getChiffre(2);
                gui.getResultat().setText(mon_nombre);

            }else if(button_click==gui.getNum_3()){
                methodes_operations.getChiffre(3);
                gui.getResultat().setText(mon_nombre);

            }else if(button_click==gui.getNum_4()){
                methodes_operations.getChiffre(4);
                gui.getResultat().setText(mon_nombre);

            }else if(button_click==gui.getNum_5()){
                methodes_operations.getChiffre(5); 
                gui.getResultat().setText(mon_nombre);

            }else if(button_click==gui.getNum_6()){
                methodes_operations.getChiffre(6); 
                gui.getResultat().setText(mon_nombre);

            }else if(button_click==gui.getNum_7()){
                methodes_operations.getChiffre(7);
                gui.getResultat().setText(mon_nombre);

            }else if(button_click==gui.getNum_8()){
                methodes_operations.getChiffre(8);
                gui.getResultat().setText(mon_nombre);

            }else if(button_click==gui.getNum_9()){
                methodes_operations.getChiffre(9); 
                gui.getResultat().setText(mon_nombre);
            }
        }
    
        /**
        * Si un bouton de la caluette scientifique est cliqué alors je rentre dans 
        * le if ci-dessous.
        */
        
        if (this.gui2!=null){
            /**
            * Je teste la valeur de l'objet button_click avec celle de tous les 
            * boutons du type "chiffre" présents dans la calculette scientifique et 
            * j'appele certaine méthode la classe methodes_operation.java en 
            * fonction du bouton cliqué par l'utilisateur.
            */
            
            if(button_click==gui2.getNum_0()) {
                methodes_operations.getChiffre(0);
                gui2.getResultat().setText(mon_nombre);

            }else if(button_click==gui2.getNum_1()){
                methodes_operations.getChiffre(1);
                gui2.getResultat().setText(mon_nombre);

            }else if(button_click==gui2.getNum_2()){
                methodes_operations.getChiffre(2);
                gui2.getResultat().setText(mon_nombre);

            }else if(button_click==gui2.getNum_3()){
                methodes_operations.getChiffre(3);
                gui2.getResultat().setText(mon_nombre);

            }else if(button_click==gui2.getNum_4()){
                methodes_operations.getChiffre(4);
                gui2.getResultat().setText(mon_nombre);

            }else if(button_click==gui2.getNum_5()){
                methodes_operations.getChiffre(5); 
                gui2.getResultat().setText(mon_nombre);

            }else if(button_click==gui2.getNum_6()){
                methodes_operations.getChiffre(6); 
                gui2.getResultat().setText(mon_nombre);

            }else if(button_click==gui2.getNum_7()){
                methodes_operations.getChiffre(7);
                gui2.getResultat().setText(mon_nombre);

            }else if(button_click==gui2.getNum_8()){
                methodes_operations.getChiffre(8);
                gui2.getResultat().setText(mon_nombre);

            }else if(button_click==gui2.getNum_9()){
                methodes_operations.getChiffre(9); 
                gui2.getResultat().setText(mon_nombre);
            }
        }
    }
}
