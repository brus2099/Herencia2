//Cuando tengo una jerarquia de clases con funciones y elementos iguales (fA)
//Los puedo meter en una clase abstracta (Papa)
//Y que invoca sus funciones especificas en un arreglo
//A eso le llamamos polimorfismo

//

public class Herencia2 {

    public static void main(String[] args) {
        Papa.conta=3;
        //System.out.println("Contador de objetos: "+Papa.conta);
        Papa Homero = new Papa();
        //System.out.println("Contador de objetos: "+Papa.conta);
        UnHijo ElBarto = new UnHijo();
        //System.out.println("Contador de objetos: "+Papa.conta);
        UnaHija Lissa = new UnaHija();        
        
        Papa Familia[] = new Papa[3];
        
        Familia[0]=Homero;
        Familia[1]=ElBarto;
        Familia[2]=Lissa;
        
        System.out.println("Los fA de la familia: ");
        for (int i=0 ; i<Familia.length ; i++){
            System.out.println(Familia[i].getClass());
            //if (Familia[i].getClass().toString().compareTo("class UnaHija") == 0)
            if (Familia[i].getClass() != Lissa.getClass())
                Familia[i].fA();
            else
                ((UnaHija)Familia[i]).fA(3);
        }
            
        
        System.out.println("Ya acabaron los fA.");
        
        Homero.fA();
        ElBarto.fA();
        Lissa.fA();
        
        if ( ElBarto == Familia[1])
            System.out.println("Si son iguales");
        else
            System.out.println("Nel");
        
        
        
    }
    
}
