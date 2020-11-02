import java.util.regex.Pattern;

public class Drawing {
    public String converte(String p) {

        String svg = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                "<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 20010904//EN\"\n" +
                "\"http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd\"><svg height=\"2000\"" +
                " width=\"2000\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"" +
                " xml:space=\"preserve\">\n";

        Integer x, y, x2, y2;

        x = 400;
        y = 400;
        x2 = 400;
        y2 = 400;

        for (String part : p.split(Pattern.quote(""))) {

            switch (part){
                case "N":
                    svg += "<line x1=\"" + (x+=60) + "\" y1=\"" + y + "\" x2=\""+ x2 +"\" y2=\"" + y2 + "\" style=\"stroke:rgb(255,0,0);stroke-width:2\" />\n";
                    break; //direita
                case "X":
                    svg += "<line x1=\"" + x + "\" y1=\"" + (y+=60) + "\" x2=\""+ x2 +"\" y2=\"" + y2 + "\" style=\"stroke:rgb(255,0,0);stroke-width:2\" />\n";
                    break; //baixo
                case "L":
                    svg += "<line x1=\"" + (x-=50) + "\" y1=\"" + y + "\" x2=\""+ (x2) +"\" y2=\"" + y2 + "\" style=\"stroke:rgb(255,0,0);stroke-width:2\" />\n";
                    break; //esquerda
                case "S":
                    svg += "<line x1=\"" + x + "\" y1=\"" + (y-=50) + "\" x2=\""+ x2 +"\" y2=\"" + (y2) + "\" style=\"stroke:rgb(255,0,0);stroke-width:2\" />\n";
                    break; //cima
                default:
                    break;
            }
            x2 = x;
            y2 = y;
        }
        return svg += "</svg>";
    }
}
