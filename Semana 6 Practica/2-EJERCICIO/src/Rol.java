public class Rol
        extends Entidad
        implements Imprimible {

    public int getid() {
        return this.id
    }

    public void setID(int valor) {
        this.id = valor;
    }

    @Override
    public String imprimir() {
        return "ID:"
                + interger.tostring(this.id)
                + "rol:"this.nomnbre;
    }
}
