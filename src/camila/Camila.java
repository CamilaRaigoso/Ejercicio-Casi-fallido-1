/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camila;
import java.util.Scanner;
public class Camila {

   
    public static void main(String[] args) {
        Scanner lec = new Scanner (System.in);
        System.out.println(" tamaño de los dos vectores ");
            int tam = lec.nextInt();
            int[] vectorA = new int [tam];
            int[] vectorB = new int [tam];
            for (int i=0; i<tam; i++){
                System.out.println("Dato"+ i +"A");
                vectorA [i]= lec.nextInt();
                System.out.println ("Dato"+ i +"B");
                vectorB [i]= lec.nextInt();           
            }
            int[]resultado = Sumavector(vectorA, vectorB);
                    for(int i=0; i<tam; i++){
                        System.out.println(resultado[i]);
                    }
               
                
    }
                    
    static int[] Sumavector(int[]A,int[]B){
                    int[] r= new int[A.length];
                    for(int i=0; i<A.length; i++)
                        r[i]=A[i]+B[i];
                
          return r;
    }
}