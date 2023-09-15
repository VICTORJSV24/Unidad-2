/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorademonedas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Calculadorademonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner abc = new Scanner (System.in);
    int mxn = abc.nextInt();
    System.out.println("ingrese la cantidad en $ mxn");
    double euro = mxn/18.21;
    double dolares = mxn/17.07;
    double yen = mxn/0.12;
    double libras = mxn/21.18;
    
    System.out.println("La cantidad" +mxn+ "en euro es" +euro+ "en dolares" +dolares+ "en yen" +yen+ "en libras" +libras);
   
   
    }
    
}
