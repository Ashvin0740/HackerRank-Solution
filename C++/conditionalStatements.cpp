#include <bits/stdc++.h>

using namespace std;



int main()
{
int in;
string num[9] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

cin >> in;

if(in > 9){
    cout << "Greater than 9"<<endl;
}
else{
    cout << num[in -1]<<endl;
}

return 0;
}
