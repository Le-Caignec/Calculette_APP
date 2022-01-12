package fr.Le_Caignec.Robin.calculette.controler;

import static fr.Le_Caignec.Robin.calculette.controler.methodes_operations.calcul;
import static fr.Le_Caignec.Robin.calculette.controler.methodes_operations.mon_nombre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import fr.Le_Caignec.Robin.calculette.view.calculette_standard;
import fr.Le_Caignec.Robin.calculette.view.calculette_scientifique;

/**
* @author Le Caignec Robin
* Dans cette classe des méthodes permettant d'écouter les boutons du types 
* "opération" de la calculettes qui ont été cliqués et d'appeler les méthodes 
* de la classe methodes_operations.java en conséquence.
*/

public class ActionListener_operation implements ActionListener{
private calculette_standard gui;
private calculette_scientifique gui2;

    public ActionListener_operation(calculette_standard view){
        this.gui=view;
    }
    
    public ActionListener_operation(calculette_scientifique view){
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
            * boutons du type "opérande" présents dans la calculette standard et 
            * j'appele certaine méthode la classe methodes_operation.java en 
            * fonction du bouton cliqué par l'utilisateur.
            */
            
            if(button_click==gui.getClear()) {
                gui.getResultat().setText("0");
                methodes_operations.clear();

            }else if(button_click==gui.getDiv()){
                String mon_nombre_tape=gui.getResultat().getText();
                methodes_operations.getCalcule(mon_nombre_tape,"/");
               gui.getResultat().setText(""+calcul);

            }else if(button_click==gui.getMoins()){
                String mon_nombre_tape=gui.getResultat().getText();
                methodes_operations.getCalcule(mon_nombre_tape,"-");
                gui.getResultat().setText(""+calcul);

            }else if(button_click==gui.getModulo()){
                String mon_nombre_tape=gui.getResultat().getText();
                methodes_operations.getCalcule(mon_nombre_tape,"%");
                gui.getResultat().setText(""+calcul);

            }else if(button_click==gui.getPlus()){
                String mon_nombre_tape=gui.getResultat().getText();
                methodes_operations.getCalcule(mon_nombre_tape,"+");
                gui.getResultat().setText(""+calcul);

            }else if(button_click==gui.getFois()){
                String mon_nombre_tape=gui.getResultat().getText();
                methodes_operations.getCalcule(mon_nombre_tape,"*");
                gui.getResultat().setText(""+calcul);

            }else if(button_click==gui.getSigne()){
                methodes_operations.chang_sign();
                gui.getResultat().setText(mon_nombre);


            }else if(button_click==gui.getEgale()){
                String mon_nombre_tape=gui.getResultat().getText();
                methodes_operations.egale(mon_nombre_tape);            
                gui.getResultat().setText(""+calcul);

            }else if(button_click==gui.getPoint()){
                String nombre=methodes_operations.mettre_point();
                gui.getResultat().setText(nombre);    
            }
        }
        
        /**
        * Si un bouton de la caluette scientifique est cliqué alors je rentre dans 
        * le if ci-dessous.
        */
        
        if (this.gui2!=null){
            /**
            * Je teste la valeur de l'objet button_click avec celle de tous les 
            * boutons du type "opération" présents dans la calculette scientifique et 
            * j'appele certaine méthode la classe methodes_operation.java en 
            * fonction du bouton cliqué par l'utilisateur.
            */
            
            if(button_click==gui2.getClear()) {
                gui2.getResultat().setText("0");
                methodes_operations.clear();

            }else if(button_click==gui2.getDiv()){
                String mon_nombre_tape=gui2.getResultat().getText();
                methodes_operations.getCalcule(mon_nombre_tape,"/");
                gui2.getResultat().setText(""+calcul);

            }else if(button_click==gui2.getMoins()){
                String mon_nombre_tape=gui2.getResultat().getText();
                methodes_operations.getCalcule(mon_nombre_tape,"-");
                gui2.getResultat().setText(""+calcul);

            }else if(button_click==gui2.getModulo()){
                String mon_nombre_tape=gui2.getResultat().getText();
                methodes_operations.getCalcule(mon_nombre_tape,"%");
                gui2.getResultat().setText(""+calcul);

            }else if(button_click==gui2.getPlus()){
                String mon_nombre_tape=gui2.getResultat().getText();
                methodes_operations.getCalcule(mon_nombre_tape,"+");
                gui2.getResultat().setText(""+calcul);

            }else if(button_click==gui2.getFois()){
                String mon_nombre_tape=gui2.getResultat().getText();
                methodes_operations.getCalcule(mon_nombre_tape,"*");
                gui2.getResultat().setText(""+calcul);

            }else if(button_click==gui2.getSigne()){
                methodes_operations.chang_sign();
                gui2.getResultat().setText(mon_nombre);


            }else if(button_click==gui2.getEgale()){
                String mon_nombre_tape=gui2.getResultat().getText();
                methodes_operations.egale(mon_nombre_tape);            
                gui2.getResultat().setText(""+calcul);

            }else if(button_click==gui2.getPoint()){
                String nombre=methodes_operations.mettre_point();
                gui2.getResultat().setText(nombre);    
                
            }else if(button_click==gui2.getSinus()){
                System.out.println("sinus");
                String mon_nombre_tape=gui2.getResultat().getText();
                Double mon_resultat=methodes_operations.sinus(mon_nombre_tape);
                gui2.getResultat().setText(""+mon_resultat);    
                
            }else if(button_click==gui2.getCosinus()){
                System.out.println("cosinus");
                String mon_nombre_tape=gui2.getResultat().getText();
                Double mon_resultat=methodes_operations.cosinus(mon_nombre_tape);
                gui2.getResultat().setText(""+mon_resultat);    
                
            }else if(button_click==gui2.getTangente()){
                String mon_nombre_tape=gui2.getResultat().getText();
                Double mon_resultat=methodes_operations.tangente(mon_nombre_tape);
                gui2.getResultat().setText(""+mon_resultat);   
                
            }else if(button_click==gui2.getFactorielle()){
                String mon_nombre_tape=gui2.getResultat().getText();
                String mon_resultat=methodes_operations.factorielle(mon_nombre_tape);
                gui2.getResultat().setText(mon_resultat);
                if(mon_resultat == "Impossible d'effectuer cette opération car ce n'est pas un entier"){
                    gui2.getResultat().setText("0");
                    methodes_operations.clear();
                }else if (mon_resultat == "Impossible d'effectuer cette opération car c'est négatif"){
                    gui2.getResultat().setText("0");
                    methodes_operations.clear();
                }
            }
        }
    }
}
