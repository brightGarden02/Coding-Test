#include <iostream>

using namespace std;

int cnt[50001];

int main(){
	
//	freopen("9_divisors_of_number_of_all.txt", "rt", stdin);
	int number, i, j;
	scanf("%d", &number);
	for(i = 1; i <= number; i++){
		
		for(j = i; j <= number; j = j+i){
			cnt[j]++;
		}
	}
	
	for(i = 1; i <= number; i++){
		printf("%d ", cnt[i]);
	}
	
	return 0;
}
