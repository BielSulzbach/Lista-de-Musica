import java.util.ArrayList;
import java.util.Arrays;

public class MusicLista {
    public static void main(String[] args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("Sinto sua falta");
        listaParaIlhaDeserta.add(" Até que enfim");
        listaParaIlhaDeserta.add("Paciência");
        listaParaIlhaDeserta.add("Até Que Durou");
        listaParaIlhaDeserta.add("Céu e Fé");
        listaParaIlhaDeserta.add("Tarja Preta");
        listaParaIlhaDeserta.add("Voz & Violão");
        listaParaIlhaDeserta.remove(2);
        listaParaIlhaDeserta.remove("Céu e Fé");
        int IndiceA = 0;
        int IndiceB = 4;
        String Temp = listaParaIlhaDeserta.get(IndiceA);
        listaParaIlhaDeserta.set(IndiceA, listaParaIlhaDeserta.get(IndiceB));
        listaParaIlhaDeserta.set(IndiceB, Temp);
        System.out.println(listaParaIlhaDeserta);
    }
}