class Solution {
public:
    int countOdds(int low, int high) {
        
        return (high - low + low%2 + high%2) / 2;
    }
};