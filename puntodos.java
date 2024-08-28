    import java.util.regex.Pattern;
    import java.util.regex.Matcher;
    import java.util.Scanner;

    public class puntouno {
        public static void main(String[] args){
            String texto = "Hola mundo Ana encontró una piedra en el bosque con la inscripción: 'Hola'. Al tocarla, el mundo a su alrededor se iluminó, mostrándole que cada día es una nueva oportunidad para descubrir la magia oculta en cada rincón del planeta.";
            String regex = "\\bHola\\b.*\\bmundo\\b";

            Pattern patron = Pattern.compile(regex);
            Matcher coincidencia = patron.matcher(texto);

            if (coincidencia.find()){ 
                System.out.print("Se encontró la frase hola mundo ");
            } else{ 
                System.out.print("No se encontró la frase hola mundo ");
            }

        }
}

public class puntodos {
            public static void main(String[] args) {
                String texto = "Ana dijo: 'HOLA MUNDO'. Y luego dijo: 'hola mundo'.";
                String regex = "(?i)\\bHola mundo\\b";
        
                Pattern patron = Pattern.compile(regex);
                Matcher coincidencia = patron.matcher(texto);
        
                if (coincidencia.find()) {
                    System.out.println("Se encontró la frase 'Hola mundo' en cualquier combinación de mayúsculas y minúsculas.");
                } else {
                    System.out.println("No se encontró la frase 'Hola mundo'.");
                }
            }
        }

public class puntotres {
    public static void main(String[] args){
        String texto = "";
        String regex = "\\bJava\\b.*\\bPython\\b\\bGo\\b.*\\bPascal\\b.*\\bPerl\\b";

        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia = patron.matcher(texto);

        if (coincidencia.find()){
            System.out.println("Se encontro");
        } else {
            System.out.println("No se encontro");
        }
    }
}

public class puntocuatro {
    public static void main(String[] args){
        String texto = "";
        String regex = "\\b@unison.mx\\b.*\\b@usoun.mx";

        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia = patron.Matcher(texto);
        
        if (coincidencia.find()){
            System.out.println("Se encontro ");
        } else {
            System.out.println("No se encontro");
        }
    }
}

public class puntocinco {
    public static void main(String[] args){
        String nombreArchivo = "ISI2023-1.txt";
        String regex = "^ISI\\d{4}-[12]\\.(txt|csv)$";

        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia = patron.matcher(nombreArchivo);

        if (coincidencia.matches()) {
            System.out.println("El nombre del archivo es válido.");
        } else {
            System.out.println("El nombre del archivo no es válido.");
        }
    }
}

public class puntoseis {
public static void main(String[] args){
    Scanner cadena = new Scanner(System.in);
    String linea = scanner.nextLine();
    System.out.println("Inserte una cadena");

        String regex = "^ISI\\d{4}-[12]\\.(txt|csv)$";

        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia = patron.matcher(linea);

        if (coincidencia.matches()) {
            System.out.println("El nombre del archivo es válido.");
        } else {
            System.out.println("El nombre del archivo no es válido.");
        }
        
}
}