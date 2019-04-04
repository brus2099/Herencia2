

public class UnaHija extends Papa {
    
    public int dato;
    public String texto;
    
    UnaHija() {
        conta++;
        super.dato = 4;
        super.texto = super.texto+" Mundo";
        dato = 10;
        texto = "Adios";
    }
    
    void fA(int x) {
        //super.fA();
        System.out.println("\nLa hija dice: ");
        System.out.println("\n en el hijo: "+texto);
        System.out.println("\n en el padre: "+super.texto);
    }
    
    
    
}
