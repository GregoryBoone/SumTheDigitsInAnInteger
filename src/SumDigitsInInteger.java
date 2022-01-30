public class SumDigitsInInteger {
    public int sumEmUp(int userInt){
        int sum = 0, digit = 0;

        while(userInt > 0){
            digit = userInt % 10;
            //adds last digit to the variable sum
            sum += digit;
            //removes the last digit from the number
            userInt /= 10;
        }
        return sum;
    }
    }

