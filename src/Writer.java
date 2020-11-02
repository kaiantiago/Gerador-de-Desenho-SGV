import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Writer {
    public void write(String text) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("imagem.svg");

        try {
            FileWriter g = new FileWriter("imagem.svg", true);

            PrintWriter gravar = new PrintWriter((g));

            gravar.print(text);

            g.close();
        } catch (Exception ex) {
            System.out.println("Erro na gravação do arquivo");
        }

    }
}
