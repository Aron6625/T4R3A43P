
public class Padre
{
    protected String tipodesangre;
    protected String ApellidoPaterno;
    protected String Colorcabello;
    
    public Padre(String ApellidoPaterno,String Colorcabello,String tipodesangre){
       this.tipodesangre = tipodesangre;
       this.ApellidoPaterno = ApellidoPaterno;
       this.Colorcabello = Colorcabello;
    }
    
    public String getApellidoPaterno(){
       return this.ApellidoPaterno;
    }
    
    public void setApellidoPaterno(String ApellidoPaterno){
       this.ApellidoPaterno=ApellidoPaterno;
    }
    
    public String getColorCabello(){
       return this.Colorcabello;
    }
    
    public void setColorcabello(String Colorcabello){
       this.Colorcabello = Colorcabello;
    }
    
    public String gettipodesangrel(){
       return this.tipodesangre;
    }
    
    public void settipodesangre(String tipodesangre){
       this.tipodesangre = tipodesangre;
    }
     
    public String mostrardatos(){
       return "tipo de sangre"+tipodesangre+"Color de cabello "+Colorcabello+"Apellido Paterno"+ApellidoPaterno;
    }
}
