package parcial1;

/**
 *
 * @author SEBAS TU NEW PAPU
 */
public class Cliente {
    
    String documentoIdentidad [];
    String Nombre[];
    String Apellido [];
    int Edad [];

        
    public void setDocumentoIde(String[] docuIdent){
        
        this.documentoIdentidad  = docuIdent;
        
    }
    
    public String[] getDocumentIden(){
        
        return  this.documentoIdentidad;
        
    }
    
    public void setNombre(String[] Nombre){
        
        this.Nombre = Nombre;
    }    
    
    public String[] getNombre(){
        
        return Nombre;
    }
    
    public void setApellido(String[] Apellido){
        
        this.Apellido = Apellido;
    }
    
    public String[] getApellido(){
        
        return Apellido;
    }    
    
    public void setEdad(int [] edad){
        
        this.Edad = edad;
    }
    
    public int[] getEdad (){
        
        return  Edad;
    } 
    
}
