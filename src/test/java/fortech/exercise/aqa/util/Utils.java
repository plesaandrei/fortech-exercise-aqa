package fortech.exercise.aqa.util;

import fortech.exercise.aqa.models.RegistrationFormModel;

import java.util.Random;

public class Utils {


    public static  String getRandomAlphaNumericString(int n)   {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvwxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static  String getRandomOnlyAlphabeticalString(int n)   {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                  + "abcdefghijklmnopqrstuvwxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static int getRandomNumber()   {

        int n=Integer.MAX_VALUE;

        return (int) (n* Math.random());
    }

    public static int getRandomNumber(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static RegistrationFormModel getRandomRegistrationModel(){

        RegistrationFormModel registrationFormModel=new RegistrationFormModel(Utils.getRandomAlphaNumericString(Utils.getRandomNumber(1, 15)),
                Utils.getRandomAlphaNumericString(Utils.getRandomNumber(1,15)),
                Utils.getRandomOnlyAlphabeticalString(Utils.getRandomNumber(1,10))+"@"+Utils.getRandomOnlyAlphabeticalString(Utils.getRandomNumber(1,10))+"."+Utils.getRandomOnlyAlphabeticalString(3),
                String.valueOf(Utils.getRandomNumber(1, 100)),
                String.valueOf(Utils.getRandomNumber(1, 100_000)),
                Utils.getRandomAlphaNumericString(20));

        return registrationFormModel;

    }



}
