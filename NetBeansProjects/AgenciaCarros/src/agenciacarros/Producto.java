package agenciacarros;
public class Producto extends Persona {
    private String color;
    private String trans;
    private double costo;
    private int modelo;
    private int descuento;
    private double preciofinal;
    
    static final int NINGUNO = 0;
    static final int AZUL = 1;
    static final int ROJO = 2;
    static final int NEGRO = 3;
    static final int BLANCO = 4;
    
    static final int ELECTRICO = 0;
    static final int AUTOMATICO = 1;
    static final int ESTANDAR = 2;
    
    static final int PERSONALIZADO = 0;
    static final int MIRAGE = 0;
    static final int MATIZ = 0;
    static final int XTRAIL = 0;
    static final int PICKUP = 0;
    static final int FIESTA = 0;
    static final int MAZDADOS = 0;
    
public Producto(){
    super();
    this.color="";
    this.trans="";
    this.costo=0; 
    this.modelo=0;
    this.descuento=0;
    this.preciofinal=0;
}

public Producto(int idcompra, String NombreV, String NombreC, String Tipo, String Pago ,String color, String trans, double costo, int modelo,int descuento, double preciofinal){
    super(idcompra, NombreV, NombreC,Tipo, Pago); 
    this.color=color;
    this.trans=trans;
    this.costo=costo;  
    this.modelo=modelo;
    this.descuento=descuento;
    this.preciofinal=preciofinal;
}   
public Producto(Producto p){
    super(p); 
    this.color=p.color;
    this.trans=p.trans;
    this.costo=p.costo;  
    this.modelo=p.modelo;
    this.descuento=p.descuento;
    this.preciofinal=p.preciofinal;
}   
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
     public double getPreciofinal() {
        return preciofinal;
    }

    public void setDescuento(double preciofinal) {
        this.preciofinal = preciofinal;
    }

}
