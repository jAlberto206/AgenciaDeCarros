package agenciacarros;
public class Persona {
//Atributos    
    private int    idcompra;
    private String NombreV;
    private String NombreC;
    private String    Tipo;
    private String    Pago;
//Constante para el tipo de usuario
    static final int NINGUNO = 0;
    static final int EMPRESARIO = 1;
    static final int PUUBLICO_GENERAL = 2;
    static final int EMPLEADO = 3;
//Constantes para pago
    static final int CONTADO = 0;
    static final int SEIS_MESES = 1;
    static final int DOCEMESES = 2;
    static final int VEINTEYCUATROMESES = 3;
//Constructor
//Constructor sin argumentos
    public Persona() {
        this.idcompra = 0;
        this.NombreV = "";
        this.NombreC = "";
        this.Tipo = "";
        this.Pago = "";
    }
    
//constructor con argumentos    
    public Persona(int idcompra, String NombreV, String NombreC, String Tipo, String Pago) {
        this.idcompra = idcompra;
        this.NombreV = NombreV;
        this.NombreC = NombreC;
        this.Tipo = Tipo;
        this.Pago = Pago;
    }
// Constructor copia
    public Persona(Persona p) {
        this.idcompra = p.idcompra;
        this.NombreV = p.NombreV;
        this.NombreC = p.NombreC;
        this.Tipo = p.Tipo;
        this.Pago = p.Pago;
    }    
// Metodos

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public String getNombreV() {
        return NombreV;
    }

    public void setNombre(String NombreV) {
        this.NombreV = NombreV;
    }
    
        public String getNombreC() {
        return NombreC;
    }

    public void setNombreC(String NombreC) {
        this.NombreC = NombreC;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String Pago) {
        this.Pago = Pago;
    }

    
            
}
