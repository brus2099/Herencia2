
public class UnHijo extends Papa {
    
    public int dato;
    public String texto;
    
    UnHijo() {
        conta++;
        super.dato = 4;
        super.texto = super.texto+" Mundo";
        dato = 10;
        texto = "Adios";
    }
    
    void fA() {
        //super.fA();
        System.out.println("\nEl hijo dice dice: ");
        System.out.println("\n en el hijo: "+texto);
        System.out.println("\n en el padre: "+super.texto);
    }
    
}
