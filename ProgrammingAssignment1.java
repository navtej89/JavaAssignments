public class SY2022bit063{
	public static void main(String[] args) {
        String[] registrationNumbers = {"2022BIT063", "2000BCS006","2023BME040", "2002GHI789", "2025ABC123","2005BIN001","1990BOM022"};
        int validCount = getValidRegistrationsCount(registrationNumbers);
        System.out.println("Number of valid registration numbers: " + validCount);
    }

    public static int getValidRegistrationsCount(String[] registrations) {
        int count = 0;
        for (String regNumber : registrations) {
            if (isValidRegistrationNumber(regNumber)) {
                count++;
            }
        }
        return count;
    }


	//Checking the length of registration number is not more than 10 inputs
    private static boolean isValidRegistrationNumber(String regNumber) {
        if (regNumber.length() != 10) {
            return false;
        }

        String yearStr = regNumber.substring(0, 4);
        String departmentID = regNumber.substring(4, 7);
        String sequenceNumber = regNumber.substring(7);

	    //Condition of first four digits of year is in between 2000 to 2024
        int year = checkDigit(yearStr);
        if (year < 2000 || year > 2024) {
            return false;
        }

	    //Condition of checking department codes 
        if (!departmentID.equals("BCS") && !departmentID.equals("BIT") && !departmentID.equals("BCE") && !departmentID.equals("BME")) {
            return false;
        }
	    
        if (!isNumeric(sequenceNumber)) {
            return false;
        }
        return true; 
    }

	//Checking of year is in numbers only
    private static int checkDigit(String yearStr) {
        int year = 0;
        for (char c : yearStr.toCharArray()) {
            if (!Character.isDigit(c)) {
                return -1; 
            }
            year = year * 10 + (c - '0');
        }
        return year;
    }

	//Checking of serial number 3 digits is in numbers only
    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; 
            }
        }
        return true;
    }
}

