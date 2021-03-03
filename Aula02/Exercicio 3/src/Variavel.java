/**
 * @author Yago
 * @version 1.0
 * @since 03/03/21 - 02:40 AM
 * @category Model
 */
public class Variavel {
    private double numero;

    public Variavel() {
    }

    /**
     * @param numero recebe um numero aleatorio digitado pelo usuario
     */
    public Variavel(double numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    /**
     * @return retorna o dobro da variavel inserida pelo usuario
     */
    public double calcularDobro(){
        return (this.numero * 2);
    }

    /**
     * @return retorna o triplo do dobro da variavel inserida pelo usuario
     */
    public double calcularTriplo(){
        return (this.calcularDobro() * 3);
    }

    /**
     * @return retorna a metade do triplo do dobro da variavel inserida pelo usuario
     */
    public double calcularMetadeDobro(){
        return (this.calcularTriplo() / 2);
    }

    /**
     * @return retorna o quadrado da variavel inserida pelo usuario
     */
    public double calcularQuadrado(){
        return (this.numero * this.numero);
    }

    /**
     * @return retorna a quinta parte da variavel inserida pelo usuario
     */
    public double calcularQuintaParte(){
        return (this.calcularDobro() / 5);
    }

    @Override
    public String toString() {
        return "\nVariavel: " + this.numero
             + "\nDobro da variavel: " + this.calcularDobro()
             + "\nTriplo do dobro: " + this.calcularTriplo()
             + "\nMetade do triplo do dobro: " + this.calcularMetadeDobro()
             + "\nQuadrado da variavel: " + this.calcularQuadrado()
             + "\nQuinta parte do dobro variavel: " + this.calcularQuintaParte();
    }
}
