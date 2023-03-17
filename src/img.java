public class img extends elementoMultimediale{

    public String formato = ".jpg";
    public int luminosità;

    public img(String a, int lum){
        super(a);
        this.luminosità = lum;
    }

    public void aumentaLuminosità(){ this.luminosità += 1; }

    public void diminuisciLuminosità(){
        this.luminosità -= 1;
    }

    public void show(){
        System.out.println(this.nome);

        for (int i = 0; i<this.luminosità; i++){
            System.out.print("*");
        }

  }

    public String getNome() {
        return nome + formato;
    }

}
