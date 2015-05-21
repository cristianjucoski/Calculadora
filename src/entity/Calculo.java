
package entity;

/**
 *
 * @author Cristian Jucoski
 */
public class Calculo{



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
    
    private int tempo_uso;
    private int  nivel_ruido;
    private int tempo_maximo;
    private int tempoTotalUso;



    
    public void calculo_tempoMaximo(){
    
    tempo_maximo = (int) ((480)/Math.pow(2,((nivel_ruido-85)/5)));
    
    
    
}

}
