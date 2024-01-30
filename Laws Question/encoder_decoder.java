import java.util.Scanner;

class cipher {
    public static void main(String[] args) {
        char plaintext[] = "actf{laws_should_be_respected}".toCharArray();
        char key[] = "379411500469".toCharArray();
        int keycount = -1;
        String ciphertext = "";
        System.out.println(key.length);
        for (int i = 0; i < plaintext.length; i++) {
            char e = plaintext[i];
            if (plaintext[i] >= 'a' && plaintext[i] <= 'z') {
                keycount++;
                keycount %= key.length;
                int num = (int) (plaintext[i]) + ((key[keycount]) - '0');
                num %= (int) ('z');
                if (num < 'a') {
                    num += 'a';
                }
                e = (char) num;
            }

            ciphertext += e;
        }

        System.out.println(ciphertext);

        keycount = -1;
        String finaltext = "";
        char ciphertxt[] = ciphertext.toCharArray();
        for (int i = 0; i < ciphertxt.length; i++) {
            char e = ciphertxt[i];
            if (ciphertxt[i] >= 'a' && ciphertxt[i] <= 'z') {
                keycount++;
                keycount %= key.length;
                int num = (int) (ciphertxt[i]) - ((key[keycount]) - '0');

                if (num < 'a') {
                    num += 25;
                }
                e = (char) num;
            }

            finaltext += e;
        }
        System.out.println(finaltext);
    }
}