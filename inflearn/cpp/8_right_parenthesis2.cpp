#include <iostream>

using namespace std;

int main(){
	
	freopen("right_parenthesis.txt", "rt", stdin);
	char a[100];
	int cnt = 0;
	scanf("%s", &a);
	for(int i = 0; a[i] != '\0'; i++){
		
		if(a[i] == '('){
			cnt++;	
		} 
		else if(a[i] == ')'){
			cnt--;
		}
		
		if(cnt < 0) break;
	}
	
	if(cnt == 0) printf("YES\n");
	else printf("NO\n");
	
	return 0;
}
