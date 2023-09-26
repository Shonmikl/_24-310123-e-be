package org.example._2023_09_26;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class QQRR {
    public static void main(String[] args) throws IOException, WriterException {
        String message = "https://www.msn.com/es-es/motor/noticias/" +
                "la-marca-que-ha-decidido-que-desde-ya-todos-sus-nuevos-" +
                "modelos-ser%C3%A1n-100-el%C3%A9ctricos/ar-AA1hheIY?ocid" +
                "=msedgntp&cvid=c9f8dca2048b4bb1a692b91ee3169549&ei=13";
        String path = "qrH.png";
        generateQR(message, path);
    }

    private static void generateQR(String url, String path) throws WriterException, IOException {
        int wight = 300;
        int height = 300;
        String format = "png";

        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        BitMatrix bitMatrix = new QRCodeWriter().encode(url, BarcodeFormat.QR_CODE, wight, height, hints);
        BufferedImage qrImage = new BufferedImage(wight, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < wight; x++) {
            for (int y = 0; y < height; y++) {
                qrImage.setRGB(x, y, bitMatrix.get(x, y) ? 0x000000 : 0xFFFFFF);
            }
        }

        File qrFile = new File(path);
        ImageIO.write(qrImage, format, qrFile);
        System.out.println("DONE");
    }
}