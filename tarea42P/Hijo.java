
public class Hijo extends Padre
{
    private String Nombre;
    private String colordeojos ;
    public Hijo (String ApellidoPaterno,String Colorcabello,String tipodesangre,String Nombre,String colordeojos){
        super(ApellidoPaterno,Colorcabello,tipodesangre);
        this.Nombre = Nombre;
        this.colordeojos = colordeojos;
    }
}
