import fr.Le_Caignec.Robin.calculette.controler.*;
import static fr.Le_Caignec.Robin.calculette.controler.methodes_operations.calcul;
import static fr.Le_Caignec.Robin.calculette.controler.methodes_operations.mettre_point;
import static fr.Le_Caignec.Robin.calculette.controler.methodes_operations.mon_nombre;
import java.util.ArrayList;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
* @author Le Caignec Robin
* Dans cette classe je teste les différentes méthodes présentes dans mon 
* fichier: methodes_operations.java selon les différents arguments que ces 
* fonctions peuvent prendre.
*/

public class TestMyClass {
    
    
    @Test
    public void test_clear(){
        methodes_operations.clear();
        assertEquals(methodes_operations.calcul,0);
        assertEquals(methodes_operations.mon_nombre,"");
        assertEquals(methodes_operations.mettre_point,true);
        assertEquals(methodes_operations.operation,"");
    }
    
    @Test
    public void test_getChiffre(){
        methodes_operations.clear();

        for (int  k=0;k<10;k++){
            methodes_operations.getChiffre(k);
            int chiffre=Integer.valueOf(methodes_operations.mon_nombre);
            assertEquals(k,chiffre);
            methodes_operations.mon_nombre="";
        }
    }
    
    
    @Test
    public void test_mettre_point(){
        
        methodes_operations.clear();
        mettre_point=true;
        mon_nombre="";
        String test0=methodes_operations.mettre_point();
        assertEquals(test0,"0.");
        
        methodes_operations.clear();
        mettre_point=true;
        ArrayList<String> List_exemple_test_1 = new ArrayList<String>();
        List_exemple_test_1.add("56");
        List_exemple_test_1.add("0");
        List_exemple_test_1.add("-12");
        List_exemple_test_1.add("-1235");
        for (int k=0;k<List_exemple_test_1.size();k++){
            methodes_operations.clear();
            mon_nombre=List_exemple_test_1.get(k);
            String test1=methodes_operations.mettre_point();
            String valeur=List_exemple_test_1.get(k)+".";
            assertEquals(test1,valeur);
            assertEquals(methodes_operations.mettre_point,false);
        }
        
        methodes_operations.clear();
        mettre_point=false;
        ArrayList<String> List_exemple_test_2 = new ArrayList<String>();
        List_exemple_test_2.add("56.123");
        List_exemple_test_2.add("0.3");
        List_exemple_test_2.add("12");
        List_exemple_test_2.add("-12.35");
        for (int k=0;k<List_exemple_test_2.size();k++){
            mon_nombre=List_exemple_test_2.get(k);
            String test2=methodes_operations.mettre_point();
            assertEquals(test2,List_exemple_test_2.get(k));
            assertEquals(methodes_operations.mettre_point,false);
        }
        
    }
    
    
    @Test
    public void test_chang_sign1() {  
        methodes_operations.clear();
        
        ArrayList<String> List_exemple_test = new ArrayList<String>();
        List_exemple_test.add("56");
        List_exemple_test.add("0");
        List_exemple_test.add("12.45");
        List_exemple_test.add("-123.5");

        for (int k=0;k<List_exemple_test.size();k++){
            methodes_operations.calcul=Double.valueOf(List_exemple_test.get(k));
            methodes_operations.mon_nombre="";
            methodes_operations.chang_sign();
            String resultat_attendu=""+Double.valueOf(List_exemple_test.get(k))*(-1);
            assertEquals(resultat_attendu, methodes_operations.mon_nombre);
            assertEquals(methodes_operations.mettre_point,false);
        }
        
        methodes_operations.clear();
        for (int k=0;k<List_exemple_test.size();k++){
            methodes_operations.mon_nombre=List_exemple_test.get(k);
            methodes_operations.chang_sign();
            String résultat_attendu=""+Double.valueOf(List_exemple_test.get(k))*(-1);
            assertEquals(résultat_attendu, methodes_operations.mon_nombre);
            assertEquals(methodes_operations.mettre_point,false);
        }
    }  
    
    
    
    @Test
    public void test_getCalcule() {
        /**
        * Premier cas où l'on rentre dans le if de la fonction test_getCalcule(),
        * autrement dit la variable operaion est vide (string vide).
        */
        
        methodes_operations.operation="";
        methodes_operations.clear();

        ArrayList<String> List_exemple_test = new ArrayList<String>();
        List_exemple_test.add("56");
        List_exemple_test.add("0");
        List_exemple_test.add("12.45");
        List_exemple_test.add("-123.5");
        
        ArrayList<String> List_exemple_op = new ArrayList<String>();
        List_exemple_op.add("+");
        List_exemple_op.add("-");
        List_exemple_op.add("*");
        List_exemple_op.add("/");
        
        for (int k=0;k<List_exemple_test.size();k++){
            for (int j=0;j<List_exemple_op.size();j++){
                methodes_operations.clear();
                methodes_operations.getCalcule(List_exemple_test.get(k),List_exemple_op.get(j));
                double mon_nombre_converti=Double.valueOf(List_exemple_test.get(k));
                assertEquals(methodes_operations.operation,List_exemple_op.get(j));
                assertEquals(methodes_operations.calcul,mon_nombre_converti);
                assertEquals(methodes_operations.mon_nombre,"");
                assertEquals(methodes_operations.mettre_point,true);
            }
        }
        
        /**
        * Deuxième cas où on rentre pas dans le if, autrement dit la variable 
        * operaion n'est pas vide( la varible contient déjà une opérande).
        */
        methodes_operations.clear();
        
        for (int k=0;k<List_exemple_test.size();k++){
            for (int j=0;j<List_exemple_op.size();j++){
                methodes_operations.clear();
                methodes_operations.operation=List_exemple_op.get(j);
                methodes_operations.getCalcule(List_exemple_test.get(k),List_exemple_op.get(j));
                assertEquals(methodes_operations.operation,List_exemple_op.get(j));
            }
        }
    }
    
   
    @Test
    public void testegale(){                                      
        methodes_operations.clear();
        for (int  k=0;k<10;k++){
            methodes_operations.egale(""+k);
            assertEquals(methodes_operations.operation,"");
        }
    }
    
    
    @Test
    public void test_get_resultat_calcul(){
        ArrayList<String> List_exemple_test = new ArrayList<String>();
        List_exemple_test.add("56");
        List_exemple_test.add("0");
        List_exemple_test.add("-3");
        List_exemple_test.add("-123.5");
        
        for (int k=0;k<List_exemple_test.size();k++){
            calcul=5;
            methodes_operations.get_resultat_calcul(List_exemple_test.get(k),"+");
            assertEquals(methodes_operations.calcul,5+Double.valueOf(List_exemple_test.get(k)));
            assertEquals(methodes_operations.mettre_point,true);
            assertEquals(methodes_operations.mon_nombre,"");
        }
        
        for (int k=0;k<List_exemple_test.size();k++){
            calcul=5;
            methodes_operations.get_resultat_calcul(List_exemple_test.get(k),"-");
            assertEquals(methodes_operations.calcul,5-Double.valueOf(List_exemple_test.get(k)));
            assertEquals(methodes_operations.mettre_point,true);
            assertEquals(methodes_operations.mon_nombre,"");
        }
        
        for (int k=0;k<List_exemple_test.size();k++){
            calcul=5;
            methodes_operations.get_resultat_calcul(List_exemple_test.get(k),"*");
            assertEquals(methodes_operations.calcul,5*Double.valueOf(List_exemple_test.get(k)));
            assertEquals(methodes_operations.mettre_point,true);
            assertEquals(methodes_operations.mon_nombre,"");
        }
        
        for (int k=0;k<List_exemple_test.size();k++){
            calcul=5;
            methodes_operations.get_resultat_calcul(List_exemple_test.get(k),"/");
            assertEquals(methodes_operations.calcul,5/Double.valueOf(List_exemple_test.get(k)));
            assertEquals(methodes_operations.mettre_point,true);
            assertEquals(methodes_operations.mon_nombre,"");
        } 
        
    }
    
    @Test
    public void test_tangente(){
        ArrayList<String> List_exemple_test = new ArrayList<String>();
        List_exemple_test.add("56");
        List_exemple_test.add("0");
        List_exemple_test.add("-3");
        List_exemple_test.add("-123.5");
        for (int k=0;k<List_exemple_test.size();k++){
            Double mon_resulat=methodes_operations.tangente(List_exemple_test.get(k));
            Double test=tan(Double.valueOf(List_exemple_test.get(k)));
            assertEquals(test,mon_resulat);
        }
    }
    
    @Test
    public void test_sinus(){
        ArrayList<String> List_exemple_test = new ArrayList<String>();
        List_exemple_test.add("56");
        List_exemple_test.add("0");
        List_exemple_test.add("-3");
        List_exemple_test.add("-123.5");
        for (int k=0;k<List_exemple_test.size();k++){
            Double mon_resulat=methodes_operations.sinus(List_exemple_test.get(k));
            Double test=sin(Double.valueOf(List_exemple_test.get(k)));
            assertEquals(test,mon_resulat);
        }
    }
    
    @Test
    public void test_cosinus(){
        ArrayList<String> List_exemple_test = new ArrayList<String>();
        List_exemple_test.add("56");
        List_exemple_test.add("0");
        List_exemple_test.add("-3");
        List_exemple_test.add("-123.5");
        for (int k=0;k<List_exemple_test.size();k++){
            Double mon_resulat=methodes_operations.cosinus(List_exemple_test.get(k));
            Double test=cos(Double.valueOf(List_exemple_test.get(k)));
            assertEquals(test,mon_resulat);
        }
    }
    
    @Test
    public void test_factorielle(){
        ArrayList<String> List_exemple_test = new ArrayList<String>();
        List_exemple_test.add("6");
        List_exemple_test.add("0");
        List_exemple_test.add("-3");
        List_exemple_test.add("123.5");
        String mon_resulat=methodes_operations.factorielle(List_exemple_test.get(0));
        assertEquals("720",mon_resulat);
        
        String mon_resulat_1=methodes_operations.factorielle(List_exemple_test.get(1));
        assertEquals("1",mon_resulat_1);
        
        String mon_resulat_2=methodes_operations.factorielle(List_exemple_test.get(2));
        assertEquals("Impossible d'effectuer cette opération car c'est négatif",mon_resulat_2);
        
        String mon_resulat_3=methodes_operations.factorielle(List_exemple_test.get(3));
        assertEquals("Impossible d'effectuer cette opération car ce n'est pas un entier",mon_resulat_3);
    }
    
}
