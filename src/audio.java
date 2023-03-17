public class audio extends elementoMultimediale{

    public String formato = ".mp3";
    public int durata;

    public int volume;

    public audio(String a, int drt){
        super(a);
        this.durata = drt;
    }

    public void aumentaVolume(){ this.volume += 1; }

    public void abbassaVolume(){
        this.volume -= 1;
    }

    public void play(){

        for (int i = 0; i<this.durata; i++){
            System.out.print(this.nome);
        }

        for (int i = 0; i<this.volume; i++){
            System.out.print("!");
        }

    }

    public String getNome() {
        return nome + formato;
    }
}
