
#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int a[n];
        for(int i=0; i<n; i++){
            cin>>a[i];
        }
        int ans=INT_MIN, ai=0, aj=0;
        for(int i=0, j=n-1; i<=j; i++, j--){
            int mini=min(a[i],a[j]);
            if(mini>ans){
                ans=mini;
                ai=i;
            }
        }
        cout<<ai<<" "<<aj<<endl;
    }
    return 0;
}
