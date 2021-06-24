
public class Hijo2 extends Padre 
{
    private String ApellidoMaterno;
    private String colordepiel;
    public Hijo2 (String ApellidoPaterno,String Colorcabello,String tipodesangre,String ApellidoMaterno,String colordepiel){
        super(ApellidoPaterno,Colorcabello,tipodesangre);
        this.ApellidoMaterno = ApellidoMaterno;
        this.colordepiel = colordepiel;
    }
}
