
public class Usuario
extends Entidad
implements Imprendible {

public String apellido;
public String correo;
public String telefono;
public Rol rolDelUsuario;

public Usuario(int ID) {
this.id = ID;

}
Public

int getID() {
return this.id;
}

}
