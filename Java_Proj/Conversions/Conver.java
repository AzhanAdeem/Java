package Conversions;

public class Conver {
    public static int main(){  
    // Pad with leading zeros to make length a multiple of 4
       int[] binary = new int[6];
       binary = String.format("%" + (4 - binary.length() % 4) + "s", binary).replace(' ', '0');
    
        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 4) {
            String nibble = binary.substring(i, i + 4);
            int decimal = Integer.parseInt(nibble, 2);
            hex.append(Integer.toHexString(decimal).toUpperCase());
        }
    return hex.toString();

    StringBuilder binary = new StringBuilder();
    for (int i = 0; i < hex.length(); i++) {
        char c = hex.charAt(i);
        int decimal = Integer.parseInt(String.valueOf(c), 16);
        String nibble = Integer.toBinaryString(decimal);
        binary.append(String.format("%4s", nibble).replace(' ', '0'));
    }
    return binary.toString();

    
   }
}