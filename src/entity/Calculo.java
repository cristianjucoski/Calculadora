
package entity;

/**
 *
 * @author Cristian Jucoski
 */
public class Calculo{



    
    private int tempo_uso;
    private int nivel_ruido;
    private int tempo_maximo;
    private int tempoTotalUso;
    private float subTotal;
    private float totalGeral;
    private float subtotal1 = 0;
    private float subtotal2 = 0;
    private double subtotal3 = 0;
    private double subtotal4 = 0; 
    private double subtotal5 = 0;
    
    
        public void calculo_totalGeral(){
        totalGeral = (float) (subtotal1 + subtotal2 + subtotal3 + subtotal4 + subtotal5);  
        
    }

          
               

    public void calculo_tempoMaximo(){
    
    tempo_maximo = (int) ((480)/Math.pow(2,((nivel_ruido-85)/5)));
    
    
    
}

    public void calculo_subtotal(){
      
      subTotal = (float) tempo_uso / tempo_maximo;
      
      
        
   }
    
    public int getTempo_uso() {
        return tempo_uso;
    }

    public void setTempo_uso(int tempo_uso) {
        this.tempo_uso = tempo_uso;
    }
    
    public int getNivel_ruido() {
        return nivel_ruido;
    }

    public void setNivel_ruido(int nivel_ruido) {
        this.nivel_ruido = nivel_ruido;
    }

    public int getTempo_maximo() {
        return tempo_maximo;
    }

    public void setTempo_maximo(int tempo_maximo) {
        this.tempo_maximo = tempo_maximo;
    }

    public int getTempoTotalUso() {
        return tempoTotalUso;
    }

    public void setTempoTotalUso(int tempoTotalUso) {
        this.tempoTotalUso = tempoTotalUso;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }
    public float getTotalGeral() {
        return totalGeral;
    }

    public void setTotalGeral(float totalGeral) {
        this.totalGeral = totalGeral;
    }

    public float getSubtotal1() {
        return subtotal1;
    }

    public void setSubtotal1(float subtotal1) {
        this.subtotal1 = subtotal1;
    }

    public float getSubtotal2() {
        return subtotal2;
    }

    public void setSubtotal2(float subtotal2) {
        this.subtotal2 = subtotal2;
    }

    public double getSubtotal3() {
        return subtotal3;
    }

    public void setSubtotal3(double subtotal3) {
        this.subtotal3 = subtotal3;
    }

    public double getSubtotal4() {
        return subtotal4;
    }

    public void setSubtotal4(double subtotal4) {
        this.subtotal4 = subtotal4;
    }

    public double getSubtotal5() {
        return subtotal5;
    }

    public void setSubtotal5(double subtotal5) {
        this.subtotal5 = subtotal5;
    }
    
}