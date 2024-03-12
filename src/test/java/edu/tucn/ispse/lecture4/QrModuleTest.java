package edu.tucn.ispse.lecture4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author Radu Miron
 * @version 1
 */
public class QrModuleTest {
    public static final String TEST_READ_QR_SERIAL_NUMBER = "70b35985-2b56-4c59-9737-6765367e8b7d";
    public static final String TEST_CREATE_QR_SERIAL_NUMBER = "d6123355-eda4-464b-871f-547a682479d1";

    @Test
    public void testReadExistingQrFile() {
        File qrCodeFile = new File("tickets/" + TEST_READ_QR_SERIAL_NUMBER + ".png");
        QrModule qrModule = new QrModule();
        String serialNumber = qrModule.readQrCode(qrCodeFile);

        Assertions.assertEquals(TEST_READ_QR_SERIAL_NUMBER, serialNumber, "the serial numbers should match");
    }

    @Test
    public void testReadNonExistingQrFile() {
        File qrCodeFile = new File("tickets/non-existing-file.png");
        QrModule qrModule = new QrModule();

        Assertions.assertThrows(RuntimeException.class, () -> qrModule.readQrCode(qrCodeFile),
                "an error should be thrown if the qr code doesn't exit");
    }

    @Test
    public void testCreateQrCode() {
        File qrCodeFile = new File("tickets/" + TEST_CREATE_QR_SERIAL_NUMBER + ".png");
        QrModule qrModule = new QrModule();
        qrModule.createQRImage(qrCodeFile, TEST_CREATE_QR_SERIAL_NUMBER);

        String readQrSerialNumber = qrModule.readQrCode(qrCodeFile);
        Assertions.assertEquals(TEST_CREATE_QR_SERIAL_NUMBER, readQrSerialNumber,
                "the created qr code should contain the given serial number");
    }
}
