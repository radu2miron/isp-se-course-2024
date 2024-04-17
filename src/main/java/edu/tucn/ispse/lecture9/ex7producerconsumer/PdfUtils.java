package edu.tucn.ispse.lecture9.ex7producerconsumer;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

/**
 * @author Radu Miron
 * @version 1
 */
public class PdfUtils {
    public static String getText(File pdfFile) throws IOException {
        PDDocument doc = Loader.loadPDF(pdfFile);
        return new PDFTextStripper().getText(doc);
    }
}
