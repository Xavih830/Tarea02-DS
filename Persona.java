


public class Persona {
    private String nombre;
    private String email;

    public Persona (String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }
    
    public String getNombre(){
        return nombre; 
    }

    public String getEmail(){
        return email; 
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }



}
