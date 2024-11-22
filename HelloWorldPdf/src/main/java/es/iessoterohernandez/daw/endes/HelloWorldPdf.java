package es.iessoterohernandez.daw.endes;

/**
 * HelloWorldPdf
 * Hello world!
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class HelloWorldPdf {
    public static void main(String[] args) {
        // Ruta y nombre del archivo PDF que se generará
        String ruta = "archivo.pdf";

        // Crear un documento
        Document documento = new Document();

        try {
            // Crear el escritor de PDF que apunta a la ruta especificada
            PdfWriter.getInstance(documento, new FileOutputStream(ruta));

            // Abrir el documento para escribir en él
            documento.open();

            // Agregar contenido al PDF
            documento.add(new Paragraph("Hola Mundo"));
            

            System.out.println("PDF generado correctamente en: " + ruta);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            // Cerrar el documento
            documento.close();
        }
    }
}

