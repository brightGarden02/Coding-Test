import java.util.ArrayList;
import java.util.List;

class Boxer {
    int id;
    int weight;
    int winCounts;
    int gameCounts;
    int winOverWeightCounts;
    double winRate;

    public Boxer(int id, int weight) {
        this.id = id;
        this.weight = weight;
        this.winCounts = 0;
        this.gameCounts = 0;
        this.winOverWeightCounts = 0;
    }
}

class Solution {
    public int[] solution(int[] weights, String[] head2head) {

        List<Boxer> boxers = new ArrayList<>();
        
        for (int i = 0; i < weights.length; i++) {
            boxers.add(new Boxer(i + 1, weights[i]));
        }
        
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j < weights.length; j++) {
                
                if (head2head[i].charAt(j) != 'N') {
                    boxers.get(i).gameCounts++;
                }
                if (head2head[i].charAt(j) == 'W') {
                    boxers.get(i).winCounts++;
                    
                    if (boxers.get(j).weight > boxers.get(i).weight) {
                        boxers.get(i).winOverWeightCounts++;
                    }
                }
                
            }
        }
        
        boxers.stream().forEach(a -> {
            if (a.gameCounts > 0) {
                a.winRate = (double) a.winCounts / a.gameCounts;
            }
        });

        boxers.sort((a, b) -> {
            if (a.winRate != b.winRate) {
                return (b.winRate - a.winRate) > 0 ? 1 : -1;
            }
            else if (a.winOverWeightCounts != b.winOverWeightCounts) {
                return b.winOverWeightCounts - a.winOverWeightCounts;
            }
            else if (a.weight != b.weight) {
                return b.weight - a.weight;
            }
            else {
                return a.id - b.id;
            }
        });
        
        return boxers.stream().mapToInt(a -> a.id).toArray();

    }
}
