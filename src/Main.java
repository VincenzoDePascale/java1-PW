import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        starter();
    }

    public static elementoMultimediale[] lista = new elementoMultimediale[5];

    public static void starter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Benvenuto sul tuo server\n (che purtroppo può contenere solo 5 files)");
        System.out.println("per prima cosa dimmi di cosa hai bisogno:\nse vuoi caricare i file premi 1\nse vuoi leggere i file premi 2");
        int e = input.nextInt();
        input.nextLine();
        switch (e) {
            case 1:
                createArray();
                break;
            case 2:
                readFiles();
                break;
        }
    }
        //((img)lista[0]).

        public static void createArray() {
            for (int i = 0; i < lista.length; i++) {
                nuovoElemento(i);
            }
            readFiles();
        }

        public static void nuovoElemento (int i){
            Scanner input = new Scanner(System.in);
            System.out.println("Creare il tuo elemento n:" + (i + 1));
            System.out.println("Seleziona il tipo di file:\n1: video\n2: immagine\n3: file audio");
            int e = input.nextInt();
            input.nextLine();
            //elementoMultimediale v1;
            switch (e) {
                case 1:
                    System.out.println("nome video:");
                    String nomeVideo = input.nextLine();
                    System.out.println("quanto dura il video?:");
                    int drtVideo = input.nextInt();
                    input.nextLine();
                    System.out.println("luminosità video:");
                    int lumVideo = input.nextInt();
                    input.nextLine();
                    video v1 = new video(nomeVideo, drtVideo, lumVideo);
                    System.out.println(v1.nome);
                    lista[i] = v1;
                    break;
                case 2:
                    System.out.println("nome img:");
                    String nomeImg = input.nextLine();
                    System.out.println("luminosità immagine:");
                    int lumImg = input.nextInt();
                    input.nextLine();
                    img i1 = new img(nomeImg, lumImg);
                    lista[i] = i1;
                    break;
                case 3:
                    System.out.println("nome audio:");
                    String nomeAudio = input.nextLine();
                    System.out.println("quanto dura l'audio?:");
                    int drtAudio = input.nextInt();
                    input.nextLine();
                    audio a1 = new audio(nomeAudio, drtAudio);
                    System.out.println(a1.nome);
                    lista[i] = a1;
                    break;
                default:
                    System.out.println("hai sbagliato ad inserire il comando\n riprova");
                    nuovoElemento(i);

            }
        }

        public static void readFiles() {
            Scanner input = new Scanner(System.in);
            System.out.println("se vuoi sapere quali sono i file che hai salvato premi 1\nse salvare nuovi file premi 2\nse vuoi leggere un singolo file premi 3");
            int e = input.nextInt();
            input.nextLine();
            switch (e) {
                case 1:
                    listFile();
                    break;
                case 2:
                    createArray();
                    break;
                case 3:
                    readOneFile();
                    break;
            }
        }

        public static void listFile() {
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i].getNome());
            }
        }

        public static void readOneFile() {
            Scanner input = new Scanner(System.in);
            System.out.println("dimmi quale file vuoi leggere i dati\n premi il numero relativo al file da leggere\n i numeri vanno da 1 a 5\n oppure premi 6 per rillegere quali file hai salvato");
            int e = input.nextInt();
            input.nextLine();
            switch (e) {
                case 1:
                    System.out.println(lista[e].getNome());
                    //readDataFile();
                    break;
                case 2:
                    System.out.println(lista[e].getNome());
                    //readDataFile();
                    break;
                case 3:
                    System.out.println(lista[e].getNome());
                    //readDataFile();
                    break;
                case 4:
                    System.out.println(lista[e].getNome());
                    //readDataFile();
                    break;
                case 5:
                    System.out.println(lista[e].getNome());
                    //readDataFile();
                    break;
                case 6:
                    listFile();
                    break;

            }

        }

        //non so come impostare lo switch per far si che per ogni caso possibile posa leggere i singoli dati.


    }
