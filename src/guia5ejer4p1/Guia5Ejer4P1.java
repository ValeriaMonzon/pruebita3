/*
 * En un nuevo proyecto, en el método main de su clase principal, se pide realizar un algoritmo
que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
 */
package guia5ejer4p1;
//hola hola pruebita3
/**
 *
 * @author valeria
 */
public class Guia5Ejer4P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
               
            for (int j = 0; j < 4; j++) {
               
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz [i][j]);
                
            }
           System.out.println("hola a todos ");   
        }
        System.out.println("------------------------");
           for (int j = 0; j < 4; j++) {
               
            for (int i = 0; i < 4; i++) {
               
                //matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz [i][j]);
                
            }
           System.out.println(" ");   
        }
      
    }
                   
}
