package Aula03Lab;

public class Televisao {
    private String modelo;
    private float preco, tamanho;
    private int volume, canal;
    private boolean ligada;

    public void alterarVolume(int newVolume){
        this.volume = newVolume;
    }
    public void alterarCanal(){
        this.canal = this.canal - 1;
    }

    public String getModelo(){
        return this.modelo;
    }
    public float getTamanho(){
        return this.tamanho;
    }
    public float getPreco(){
        return this.preco;
    }
    public int getVolume(){
        return this.volume;
    }
    public int getCanal(){
        return this.canal;
    }
    public boolean getLigada(){
        return this.ligada;
    }

    public void setModelo(String newModelo){
        this.modelo = newModelo;
    }
    public void setPreco(float newPreco){
        if (newPreco < 0){
            newPreco = 0;
        }
        this.preco = newPreco;
    }
    public void setTamanho(float newTamanho){
        if (newTamanho < 0){
            newTamanho = 0;
        }
        this.tamanho = newTamanho;
    }
    public void setVolume(int newVolume){
        if (newVolume < 0){
            newVolume = 0;
        }
        this.volume = newVolume;
    }
    public void setCanal(int newCanal){
        if (newCanal < 0){
            newCanal = 0;
        }
        this.canal = newCanal;
    }
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
}
