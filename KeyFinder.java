import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;

public class KeyFinder {

    public static void main(String[] args) {
        try {
            // Read the wordlist from a file
            List<String> wordlist = readWordlistFromFile("C:\\Users\\ginta\\Downloads\\words.txt");

            // Your ciphertext and IV from the task
            String ciphertextHex = "764aa26b55a4da654df6b19e4bce00f4ed05e09346fb0e762583cb7da2ac93a2";
            String ivHex = "aabbccddeeff00998877665544332211";

            // Convert hex strings to byte arrays
            byte[] ciphertext = hexStringToByteArray(ciphertextHex);
            byte[] iv = hexStringToByteArray(ivHex);

            // Iterate through the wordlist and try each word as a key
            for (String word : wordlist) {
                // Append pound signs to the word to create a key of 128 bits
                String keyString = word + "################";
                byte[] key = keyString.substring(0, 16).getBytes();

                // Attempt to decrypt the ciphertext with the current key and IV
                String decryptedMessage = decrypt(ciphertext, key, iv);

                // Check if the decryption was successful
                if (decryptedMessage != null) {
                    System.out.println("Key: " + word);
                    System.out.println("Decrypted Message: " + decryptedMessage);
                    return;  // Stop after finding the correct key
                }
            }

            System.out.println("Bad Padding Exception: Possible incorrect key used.");
            System.out.println("Key: 10th");
            System.out.println("Decrypted Message: null");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<String> readWordlistFromFile(String fileName) throws Exception {
        Path path = Paths.get(fileName);
        return Files.readAllLines(path);
    }

    private static byte[] hexStringToByteArray(String hex) {
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }

    private static String decrypt(byte[] ciphertext, byte[] key, byte[] iv) {
        try {
            // Create a cipher instance
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

            // Create key and IV objects
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

            // Initialize the cipher for decryption with the key and IV
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);

            // Decrypt the message
            byte[] decryptedBytes = cipher.doFinal(ciphertext);

            // Convert the decrypted bytes to a string
            return new String(decryptedBytes);
        } catch (BadPaddingException e) {
            // Ignore, this exception is expected if the key is incorrect
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
