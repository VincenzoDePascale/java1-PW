public class video extends elementoMultimediale{
    public String formato = ".mp4";
    public int durata;
    public int luminosità;
    public int volume;

    public video(String a, int drt, int lum){
        super(a);
        this.durata = drt;
        this.luminosità = lum;
    }

    public void aumentaVolume(){ this.volume += 1; }

    public void abbassaVolume(){
        this.volume -= 1;
    }

    public void aumentaLuminosità(){ this.luminosità += 1; }

    public void diminuisciLuminosità(){
        this.luminosità -= 1;
    }

    public void play(){
        for (int i = 0; i<this.durata; i++){
            System.out.print(this.nome);
        }

        for (int i = 0; i<this.volume; i++){
            System.out.print("!");
        }

        for (int i = 0; i<this.luminosità; i++){
            System.out.println("*");
        }

    }

    public String getNome() {
        return nome + formato;
    }
}
