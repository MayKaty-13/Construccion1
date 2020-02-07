
package SEMANA01.Practico;
public class Auto15 {
    
    private String placa;
    private String colorCalcomania;
    
    public Auto15(){
        placa = "NoRegistrada";
        colorCalcomania = "NoRegistrada";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColorCalcomania() {
        return colorCalcomania;
    }

    public void setColorCalcomania(String colorCalcomania) {
        this.colorCalcomania = colorCalcomania;
    }
    
    public void registrarColor(){
        switch(placa.charAt(3)){
            case '1':
            case '2':
                colorCalcomania = "amarillo";break;
            case '3':
            case '4':
                colorCalcomania = "rosa";break;
            case '5':
            case '6':
                colorCalcomania = "roja";break;
            case '7':
            case '8':
                colorCalcomania = "verde";break;
            case '9':
            case '0':
                colorCalcomania = "azul";break;
        }
    }
    
}