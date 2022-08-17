public class Caixa {
    private double tamanho;
    private String material;
    private boolean abertura;

    private boolean estado;

    public void setEstado(boolean estado){
        this.estado = estado;
    }
    public String getEstado(){
        if(estado){
            return "cheia";
        }
        else{
            return "vazia";
        }
    }
    public void setTamanho(double comprimento, double largura, double altura){
        this.tamanho = comprimento * (largura * altura);

    }

    public double getTamanho(){
        return this.tamanho;
    }


    public void setMaterial(String material){
        this.material = material;
    }

    public String getMaterial(){
        return this.material;
    }

    public void setAbertura(boolean abertura){
        this.abertura = abertura;
    }

    public String getAbertura(){
        if(abertura){
            return "aberta";
        }
        else{
            return "fechada";
        }
    }

    @Override
    public String toString() {
        return "Tamanho: " + this.tamanho + "\n" + "Material: " + this.material + "\n" + "Abertura: " + getAbertura() + "\n" + "Estado: " + getEstado();
    }
}
