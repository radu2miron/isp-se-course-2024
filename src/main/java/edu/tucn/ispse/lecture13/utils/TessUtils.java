package edu.tucn.ispse.lecture13.utils;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * @author Radu Miron
 * @version 1
 */
public class TessUtils {
    public static String readText(File imageFile) {
        ITesseract instance = new Tesseract();
        instance.setDatapath("tessdata");
        String text = null;

        try {
            text = instance.doOCR(imageFile);
        } catch (TesseractException e) {
            e.printStackTrace();
        }

        return text;
    }
}
