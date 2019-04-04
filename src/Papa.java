
public class Papa {
    
    static protected int conta = 0;
    protected int dato;
    protected String texto;
    
    Papa(){
        conta++;
        dato = 2;
        texto = "Hola";
    }
   
    void fA() {
        System.out.println("\nEl Papa dice: ");
        System.out.println(texto);
    }
    
}
