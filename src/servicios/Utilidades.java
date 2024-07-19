package servicios;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utilidades {

    public static String encriptarSHA1(String texto) {
        
        
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] hash = md.digest(texto.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean verificarPassword(String passwordIngresada, String passwordAlmacenada) {
        // Encripta la contraseña ingresada y la compara con la contraseña almacenada
        String passwordEncriptada = encriptarSHA1(passwordIngresada);
        return passwordEncriptada.equals(passwordAlmacenada);
    }
}
    
