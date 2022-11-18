public class PriceLookup {
    public int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public int getAveragePrice(String item){
        int averagePrice;

        switch (item){
            case "nintendo-switch":
                //Mock data to replicate API call to get pricing information
                int[] switchPrices = new int[] {350,350,350,350};

                //Computing the average price of the item
                averagePrice = getSum(switchPrices) / switchPrices.length;
                break;
            case "macbook-pro":
                //Mock data to replicate API call to get pricing information
                int[] macPrices = new int[] {2000,1860,1825,2000};

                //Computing the average price of the item
                averagePrice = getSum(macPrices) / macPrices.length;
                break;
            default:
                averagePrice = 0;
        }

        return averagePrice;
    }
}
