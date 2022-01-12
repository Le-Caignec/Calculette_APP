/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.Le_Caignec.Robin.calculette.controler;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

/**
* @author Le Caignec Robin
* Dans cette classe sont présentes les méthodes qui permettent de gérer toutes 
* les opérations permetteant d'effecter les calcules que souhaite effectuer 
* l'utilisateur.
*/

public class methodes_operations {
    /**
    * Je stocke ici un ensemble de variables globales qui me serviront dans mes méthodes 
    * ci-dessous.
    */
    static public double calcul=0;
    static public String mon_nombre="";
    static public boolean mettre_point=true;
    static public String operation="";
    
    /**
    * Permet d'effacer tout ce qui ce trouve dans la consol d'affichage de la 
    * calculette et de remettre toutes variables à leur valeur par défaut.
    */
    public static void clear(){
        calcul=0;
        mon_nombre="";
        mettre_point=true;
        operation="";
    }
    
    
    /**
    * ici je créer mon premier nombre qui est construit sous forme d'une chaine
    * de caractère.
    * @param nb Cette methode prend en argument un chiffre ( un entier)
    */
    public static void getChiffre(int nb){
        mon_nombre=mon_nombre+nb;
    }
  
    /**
    * Ici j'ajoute une point à mon nombre à condition qu'il n'y en ai pas déjà 
    * un existant dans ma chaine de caractère.Je mets ensuite la variable
    * mettre_point à False afin d'empecher l'utilisateur de pouvoir en rajouter 
    * un par la suite.
    * 
    * @return mon_nombre Le nombre avec le point si il était possible d'en 
    * ajouter un
    */
    public static String mettre_point(){
        if (mettre_point==true){
            if (mon_nombre.equals("")){
                mon_nombre="0";
            }
            mon_nombre=mon_nombre+".";
            mettre_point=false;
        }
        return mon_nombre;
    }
    
       
    /**
    * Je change le signe de mon_nombre en multipliant par -1.
    */
    public static void chang_sign() {                                      
        if (mon_nombre.equals("")){
            mon_nombre=""+calcul;
        }
        double signe=Double.valueOf(mon_nombre)*(-1);
        mon_nombre=""+signe;
        mettre_point=false;
    }
    
    /**
    * Permet de calculer le résulat du calcul.
    */
    public static void egale(String mon_nombre_tape){                                      
        get_resultat_calcul(mon_nombre_tape,operation);
        operation=""; 
    }
    
    /**
    * Si aucune opération n'a encore été demandée par l'utilisteur je stocke 
    * l'opération puis je tranfert la valeur de mon_nombre dans la variable 
    * globale calcul.Ensuite je réinitialise mon_nombre à un string vide.En 
    * revanche, si une opération à déjà été demandée par l'utilisateur alors 
    * j'effectue le calcul avec le chiffre présent dans l'affichage de
    * calculette je stocke l'opérande aprés avoir écrasé l'ancienne opérande.
    * @param mon_nombre_tape Prend en argument le nombre tapé par l'utilisateur.
    * @param op Prend en argument l'opérande  rentée par l'utilisateur.
    */ 
    public static void getCalcule(String mon_nombre_tape,String op) {
        if (operation.equals("")){
            operation=op;
            calcul=Double.valueOf(mon_nombre_tape);
            mon_nombre="";
            mettre_point=true;
        }else{
            get_resultat_calcul(mon_nombre_tape,operation);
            operation=op;
        }
    }
    
    /**
    * Je calcule le résultat demandé par l'utilisateur en récupérant la somme 
    * des anciens calculs effectués par celui-ci puis en ajoutant,soustrayant,...
    * le nouveau nombre demandé par l'utilisatuer puis j'affiche le résulat de 
    * ce calcul.
    * @param mon_nombre_tape Prend en argument le nombre tapé par l'utilisateur.
    * @param op Prend en argument l'opérande  rentée par l'utilisateur.
    */ 
    public static void get_resultat_calcul(String mon_nombre_tape,String op){

        switch(op){
            case "+": 
                calcul=calcul+Double.valueOf(mon_nombre_tape);
                break;
                
            case "-": 
                calcul=calcul-Double.valueOf(mon_nombre_tape);
                break;
                
            case "*": 
                calcul=calcul*Double.valueOf(mon_nombre_tape);
                break;
                
            case "/":              
                calcul=calcul/Double.valueOf(mon_nombre_tape);
                break;
                
            case "%":
                calcul=calcul%Double.valueOf(mon_nombre_tape);
                break;
        }
        
        mon_nombre="";
        mettre_point=true;
    }
    
    /**
    * METHODES SPÉCIFIQUES À LA CALCULETTE SCIENTIFIQUE.
    */
    
    
    /**
    * Méthodes permettant de calculer le sinus d'un nombre.
    * @param mon_nombre_tape Prend en argument le nombre tapé par l'utilisateur.
    * @return Retourne la valeur du sinus du nombre demandé par l'utilisateur.
    */
    public static double sinus(String mon_nombre_tape){
        double ma_valeur=Double.valueOf(mon_nombre_tape);
        double mon_resultat=sin(ma_valeur);
        return mon_resultat;
    }
    
    /**
    * Méthodes permettant de calculer le cosinus d'un nombre.
    *@param mon_nombre_tape Prend en argument le nombre tapé par l'utilisateur.
    *@return Retourne la valeur du cosinus du nombre demandé par l'utilisateur.
    */
    public static double cosinus(String mon_nombre_tape){
        double ma_valeur=Double.valueOf(mon_nombre_tape);
        double mon_resultat=cos(ma_valeur);
        return mon_resultat;
    }
    
    /**
    * Méthodes permettant de calculer le tangente d'un nombre.
    *@param mon_nombre_tape Prend en argument le nombre tapé par l'utilisateur.
    *@return Retourne la valeur du tangente du nombre demandé par l'utilisateur.
    */
    public static double tangente(String mon_nombre_tape){
        double ma_valeur=Double.valueOf(mon_nombre_tape);
        double mon_resultat=tan(ma_valeur);
        return mon_resultat;
    }
    
    /**
    * Méthodes permettant de calculer le factorielle d'un nombre.Pour cela, 
    * je vérifie au préalable qu'il ne s'agisse pas d'un nombre négatif ou 
    * bien d'un entier.
    *@param mon_nombre_tape Prend en argument le nombre tapé par l'utilisateur.
    *@return Retourne la valeur du factorielle du nombre demandé par l'utilisateur.
    */
    public static String factorielle(String mon_nombre_tape){
        double ma_valeur=Double.valueOf(mon_nombre_tape);
        int IntValue = (int) ma_valeur;
        System.out.println(IntValue);
        if (IntValue<0){
            return "Impossible d'effectuer cette opération car c'est négatif";
        }else if (Double.valueOf(IntValue)!=(ma_valeur) ){
            return "Impossible d'effectuer cette opération car ce n'est pas un entier";
        }else{ 
            int fact=1;
            int mon_entier=Integer.valueOf(mon_nombre_tape);
            for ( int i=1; i<=mon_entier;i++){
                fact*=i;
            }
            return ""+fact;
        }
    }   
}
