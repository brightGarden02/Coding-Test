class Solution {
 public:
  vector<int> findEvenNumbers(vector<int>& digits) {
      
        vector<int> count(10, 0);
        for (auto& d : digits) count[d]++;

        vector<int> ans;

        for (int num = 100; num < 999; num += 2) {
          vector<int> currCount(10, 0);
          int tmp = num;

          while (tmp) {
            currCount[tmp % 10]++;
            tmp /= 10;
          }

          bool flag = true;
          for (int i = 0; i < 10; i++) {
            if (currCount[i] > count[i]) {
                flag = false;
                break;
            }
          }

          if (flag) {
            ans.push_back(num);
          }
        }
        return ans;
  }
};