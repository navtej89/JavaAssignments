import java.util.Random;

//RNG = registration number generate
public class RNG {
    
    private static void genAT(int size) {
        String[] registrationN = new String[size];
        long startTime, endTime, durN, durSB, durSC;
        
        //Naive approach
        startTime = System.nanoTime();
        genRNNaive(registrationN);
        endTime = System.nanoTime();
        durN = endTime - startTime;
        System.out.println("Naive approach: " + durN + " nanoseconds");
        
        //StringBuilder approach
        startTime = System.nanoTime();
        genRNStringBuilder(registrationN);
        endTime = System.nanoTime();
        durSB = endTime - startTime;
        System.out.println("StringBuilder approach: " + durSB + " nanoseconds");
        
        //String Concatenation approach
        startTime = System.nanoTime();
        genRNStringConcatenation(registrationN);
        endTime = System.nanoTime();
        durSC = endTime - startTime;
        System.out.println("String Concatenation approach: " + durSC + " nanoseconds");
    }
    
    private static void genRNNaive(String[] registrationN) {
        Random random = new Random();
        for (int i = 0; i < registrationN.length; i++) {
            String year = String.valueOf(2000 + random.nextInt(5)); 
            String branch = BRANCH_CODES[random.nextInt(BRANCH_CODES.length)];
            String serialN = String.format("%03d", i + 1); 
            registrationN[i] = year + branch + serialN;
        }
    }
    
    private static void genRNStringBuilder(String[] registrationN) {
        Random random = new Random();
        for (int i = 0; i < registrationN.length; i++) {
            StringBuilder regNBuilder = new StringBuilder();
            regNBuilder.append(2000 + random.nextInt(5)); 
            regNBuilder.append(BRANCH_CODES[random.nextInt(BRANCH_CODES.length)]);
            regNBuilder.append(String.format("%03d", i + 1)); 
            registrationN[i] = regNBuilder.toString();
        }
    }
    
    private static void genRNStringConcatenation(String[] registrationN) {
        Random random = new Random();
        for (int i = 0; i < registrationN.length; i++) {
            String regiNum = "" + (2000 + random.nextInt(5)) + BRANCH_CODES[random.nextInt(BRANCH_CODES.length)] + String.format("%03d", i + 1);
            registrationN[i] = regiNum;
        }
    }
    private static final int[] ARRAY_SIZES = {100, 1000, 10000};
    private static final String[] BRANCH_CODES = {"BCS", "BIT", "BME", "BEC", "BCE"};
    
    public static void main(String[] args) {
        for (int size : ARRAY_SIZES) {
            System.out.println("Array size: " + size);
            genAT(size);
            System.out.println();
        }
    }
}

