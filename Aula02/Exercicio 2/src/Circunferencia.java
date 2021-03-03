/**
 * @author Yago
 * @version 1.0
 * @since 03/03/21 - 02:33 AM
 * @category Model
 */
public class Circunferencia {
    private double raio;

    public Circunferencia() {
    }

    /**
     * @param raio recebe o raio de uma circunferencia
     */
    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    /**
     * @return faz o calculo do diametro da circunferencia a partir do raio
     */
    public double calcularDiametro(){
        return (this.raio * 2);
    }

    /**
     * @return faz o calculo de um quadrante da circunferencia
     */
    public double calcularQuadrante(){
        return (this.calcularDiametro() / 4);
    }

    @Override
    public String toString() {
        return "\nRaio: " + this.raio
             + "\nDiametro: " + this.calcularDiametro()
             + "\n1 Quadrante: " +this.calcularQuadrante();
    }
}
