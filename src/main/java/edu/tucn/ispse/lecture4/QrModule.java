package edu.tucn.ispse.lecture4;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Hashtable;

/**
 * @author Radu Miron
 * @version 1
 */
public class QrModule {
    private static final int SIZE = 125;
    private static final String FILE_TYPE = "png";

    public void createQRImage(File qrCodeFile, String qrCodeText) {
        try {
            Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            QRCodeWriter writer = new QRCodeWriter();
            BitMatrix matrix = writer.encode(qrCodeText, BarcodeFormat.QR_CODE, SIZE, SIZE, hintMap);
            BufferedImage image = new BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB);
            image.createGraphics();

            Graphics2D graphics2D = (Graphics2D) image.getGraphics();
            graphics2D.setColor(Color.WHITE);
            graphics2D.fillRect(0, 0, SIZE, SIZE);
            graphics2D.setColor(Color.BLACK);

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (matrix.get(i, j)) {
                        graphics2D.fillRect(i, j, 1, 1);
                    }
                }
            }

            System.out.println("ticket serial number: " + qrCodeText);
            ImageIO.write(image, FILE_TYPE, qrCodeFile);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String readQrCode(File qrCodeFile) {
        try {
            BufferedImage image = ImageIO.read(qrCodeFile);
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            Result result = new MultiFormatReader().decode(bitmap);

            String textResult = result.getText();

            System.out.println("ticket serial number: " + textResult);

            return textResult;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
