#include <iostream>
#include <stack>
using namespace std;

int main(){
	
//	freopen("input.txt", "rt", stdin);
	char a[31], b[31];
	scanf("%s", &a);
	stack<char> st;
	
	bool ans = true;
	
	for(int i = 0; a[i] != '\0'; i++){
		
		if(a[i] == '('){
			st.push(a[i]);
		}
		else {
			
			if(st.empty()){ 
				ans = false;
				printf("NO\n");
				break;
			}
			char tmp = st.top();
			st.pop();
			
			if(tmp != '('){
				ans = false;
				printf("NO\n");
				break;
			}
		}
		
	}
	if(!st.empty()){
		ans = false;
	}
	
	if(ans == true){
		printf("YES\n");
	}
	else{
		printf("NO\n");
	}
	
	return 0;
}
