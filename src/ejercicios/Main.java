
package ejercicios;


import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in);
        Pizza[] pizzas=new Pizza[2];
        String cubierta= null;
        int diametro=0;
        double precio=0;
        
        for(int i=0; i<2; i++){
        System.out.println ("Ingredientes Pizza " + (i+1));
        cubierta= lectura.next();
        System.out.println ("Tamaño pizza " + (i+1));
        diametro= lectura.nextInt();
        System.out.println ("Precio pizza " + (i+1));  
        precio= lectura.nextDouble();
        pizzas[i]= new Pizza(cubierta, diametro, precio);
        }
        
        for (Pizza pizza: pizzas){
        System.out.println(pizza);
        }
    /*Pizza hawaiana= new Pizza("Piña, jamon y queso",15,7000);
    
    
    Pizza manhathan= new Pizza("Oregano, queso y tocineta",20,9000);
    
    
    System.out.println(hawaiana.getCubierta()+ "-" + hawaiana.getDiametro()+ "-" + hawaiana.getPrecio());
    System.out.println(manhathan.getCubierta()+ "-" + manhathan.getDiametro()+ "-" + manhathan.getPrecio());
*/    
}
    
}
