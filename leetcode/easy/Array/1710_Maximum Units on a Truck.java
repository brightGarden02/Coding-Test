class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1], a[1]));
        
        int i = 0;
        int numberOfUnits = 0;
        while(truckSize > 0 && i < boxTypes.length){
            
            if(boxTypes[i][0] >= truckSize){
                numberOfUnits += truckSize * boxTypes[i][1];
                truckSize = 0;
            }
            else{
                numberOfUnits += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            
            i++;
        }

	    return numberOfUnits;
    }
}