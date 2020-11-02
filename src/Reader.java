
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Reader {

        ArrayList<String> read() throws IOException, ParseException {
            FileInputStream fis = new FileInputStream("codigo.txt");
            Scanner s = new Scanner(fis);
            ArrayList<String> list = new ArrayList<String>();
            while (s.hasNextLine()) {
                list.add(s.nextLine());
            }
            s.close();
            System.out.println(list + " - antes da gramática");
            return list;
        }

}
