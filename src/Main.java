import java.util.Arrays;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        double sum=0.0;
        for(int i:totalWasteKgPerCapitaPerYear){
            sum+=i;
        }
        double mean = sum/totalWasteKgPerCapitaPerYear.length + 0.5 ;
        return (int) mean;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        double sum = 0.0;
        for(int i:householdEstimatesKgPerCapitaPerYear){
            sum+=i;
        }
        double mean = sum/householdEstimatesKgPerCapitaPerYear.length + 0.5 ;
        return (int) mean;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        double counter=0.0;
        for(int i:householdEstimatesTonnesPerYear)
        {
            counter+=i;
        }
        double mean=(counter/householdEstimatesTonnesPerYear.length)+0.5;
        return (int) mean;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int sum = 0;
        for (int i: retailEstimatesKgPerCapitaPerYear){
            sum += i;
        }
        double mean = (double) sum / retailEstimatesKgPerCapitaPerYear.length + 0.5;
        return (int) mean;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        double sum = 0.0;
        for (int i: retailEstimatesTonnesPerYear){
            sum += i;
        }
        double mean = sum/retailEstimatesTonnesPerYear.length + 0.5;
        return (int) mean;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        double sum = 0;
        for (int i: foodServiceEstimatesKgPerCapitaPerYear){
            sum += i;
        }
        double mean = sum/foodServiceEstimatesKgPerCapitaPerYear.length + 0.5;
        return (int) mean;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        int sum = 0;
        for (int i:foodServiceEstimatesTonnesPerYear){
            sum += i;
        }
        double mean = (double) sum /foodServiceEstimatesTonnesPerYear.length + 0.5;
        return (int) mean;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        Arrays.sort(totalWasteKgPerCapitaPerYear);
        int length = totalWasteKgPerCapitaPerYear.length;
        if (length % 2 == 1) {
            return totalWasteKgPerCapitaPerYear[length / 2];
        }
        else {
            int mid1 = totalWasteKgPerCapitaPerYear[(length / 2) - 1];
            int mid2 = totalWasteKgPerCapitaPerYear[(length / 2)];
            return (mid1+mid2) / 2;
        }
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        int[] array = householdEstimatesKgPerCapitaPerYear;
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (int) (array[length / 2 - 1] + array[length / 2] + 0.5) / 2;
        }
        else{
            return array[length/2];
        }
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int[] array = retailEstimatesKgPerCapitaPerYear;
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (int) (array[length / 2 - 1] + array[length / 2] + 0.5) / 2;
        } else {
            return array[length/2];
        }
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        int[] array = retailEstimatesTonnesPerYear;
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (int) (array[length / 2 - 1] + array[length / 2] + 0.5) / 2;
        } else {
            return array[length/2];
        }
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        int[] array = foodServiceEstimatesKgPerCapitaPerYear;
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (int) (array[length / 2 - 1] + array[length / 2] + 0.5) / 2;
        } else {
            return array[length/2];
        }
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        Arrays.sort(foodServiceEstimatesTonnesPerYear);
        int lengthOfArray = foodServiceEstimatesTonnesPerYear.length;
        if (lengthOfArray % 2 == 0) {
            int positionOfFirstNeededNumber = (lengthOfArray / 2) - 1;
            int positionOfSecondNeededNumber = lengthOfArray / 2;
            int theMedian = (foodServiceEstimatesTonnesPerYear[positionOfFirstNeededNumber] + foodServiceEstimatesTonnesPerYear[positionOfSecondNeededNumber]) / 2;
            return theMedian;
        } else {
            return foodServiceEstimatesTonnesPerYear[lengthOfArray / 2];
        }
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Max Methods
     */
    
    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static String getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int result=0;
        for(int i=0;i< countries.length;i++){
            if(countries[i]==country){
                result=totalWasteKgPerCapitaPerYear[i];
            }
        }
        return ""+result;
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int maxI=0;
        for(int i=1;i<totalWasteKgPerCapitaPerYear.length;i++){
            if(totalWasteKgPerCapitaPerYear[i]>totalWasteKgPerCapitaPerYear[maxI]){
                maxI=i;
            }
        }
        return countries[maxI];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        int maxI=0;
        for(int i=1;i<percentagesShareInPoverty.length;i++){
            if(percentagesShareInPoverty[i]>percentagesShareInPoverty[maxI]){
                maxI=i;
            }
        }
        double maxPov=percentagesShareInPoverty[maxI];
        int count=0;
        for(int i=0;i<percentagesShareInPoverty.length;i++){
            if(percentagesShareInPoverty[i]==maxPov) count++;
        }
        String[] result=new String[count];
        int temp=0;
        for(int i=0;i<percentagesShareInPoverty.length;i++){
            if(percentagesShareInPoverty[i]==maxPov){
                result[temp++]=countries[i];
            }
        }
        return result;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        int count=0;
        for(int i=0;i<confidences.length;i++){
            if(confidences[i]=="High Confidence") count++;
        }
        String[] result=new String[count];
        int temp=0;
        for(int i=0;i<confidences.length;i++){
            if(confidences[i]=="High Confidence") {
                result[temp++] = countries[i];
            }
        }
        return result;
    }
}
