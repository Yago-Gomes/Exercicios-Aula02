/**
 * @author Yago
 * @version 1.0
 * @since 03/03/21 - 12:24 AM
 * @category Model
 */
public class Aluno {
    private String name;
    private double n1, n2, n3;

    public Aluno() {
    }

    /**
     * @param name recebe o nome do aluno
     * @param n1 recebe a n1 do aluno
     * @param n2 recebe a n2 do aluno
     * @param n3 recebe a n3 do aluno
     */
    public Aluno(String name, double n1, double n2, double n3) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    /**
     * @return retorna o calculo da media
     */
    public double calcularMedia(){
        return (this.n1 + this.n2 + this.n3) / 3 ;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.name
             + "\nN1: " + this.n1
             + "\nN2: " + this.n2
             + "\nN3: " + this.n3
             + "\nMedia: " + calcularMedia();
    }
}
