#include <iostream>

using namespace std;

int digit_sum(int x);

int main(){
	
	freopen("10_sum_of_digits.txt", "rt", stdin);

	int n, num, i, sum, max = INT_MIN, res;
	scanf("%d", &n);
	
	for(int i = 0; i < n; i++){
		
		scanf("%d", &num);
		sum = digit_sum(num);
		
		if(sum > max){
			max = sum;
			res = num;		
		}
		else if(sum == max){
			
			if(num > res){
				res = num;
			}
		}
	}
	cout << "res: " << res << endl;
	
	
	return 0;
}


int digit_sum(int x){
	
	int sum = 0;
	int rem = 0;
	while(x > 0){
		
		rem = x % 10;
		sum += rem;
		x = x/10;
	}
	
	
	return sum;
}
