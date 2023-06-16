package Org.LosRemedios.Programacion.T7.Actividades.Act2;

import java.io.FileWriter;

public class Act2 {

    public static void main(String[] args) throws IOException {
        File archivo = new File("C:/alumnos.txt");

        FileOutputStream fos = new FileOutputStream(archivo);
        BufferedOutputStream bufer = new BufferedOutputStream(fos);
        bufer.write("Antonio\n".getBytes());
        bufer.write("Ricardo\n".getBytes());
        bufer.write("Pablo\n".getBytes());
        bufer.write("Jossie\n".getBytes());
        bufer.write("Juan Jesus\n".getBytes());
        bufer.write("José\n".getBytes());
        bufer.write("Jorge\n".getBytes());
        bufer.write("Adrián\n".getBytes());
        bufer.write("Daniel\n".getBytes());
        bufer.write("Diego\n".getBytes());
        bufer.write("Jonathan\n".getBytes());
        bufer.write("Juan María\n".getBytes());
        bufer.write("Victor\n".getBytes());
        bufer.write("Julian\n".getBytes());
        bufer.write("Jose Antonio Jaén Gómez\n".getBytes());
        bufer.write("David\n".getBytes());
        bufer.write("Juan Manuel Saborido\n".getBytes());
        bufer.close();
        fos.close();
        File archivoNuevo = new File("C:/alumnosnew.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoNuevo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Renombrar el archivo prog.txt a prog_codificado.txt
        File archivoCodificado = new File(carpeta.getPath() + "/prog_codificado.txt");
        archivoProg.renameTo(archivoCodificado);

        // Añadir un alumno nuevo al final del archivo prog_codificado.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoCodificado, true))) {
            writer.write("Margarita\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sustituir el segundo y tercer caracter del nombre de cada alumno por una X
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoCodificado));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoCodificado))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.length() >= 3) {
                    String nuevoNombre = linea.substring(0, 1) + "XX" + linea.substring(3);
                    writer.write(nuevoNombre + "\n");
                } else {
                    writer.write(linea + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
