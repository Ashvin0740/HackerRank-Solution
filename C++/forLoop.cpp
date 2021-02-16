#include <iostream>
#include <cstdio>
using namespace std;

int main() {
   // Complete the code. 
string const number[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; 
   int a, b; 
   cin >> a >> b; 
   for (int i = a; i <= b; i++) 
   
        { 
            if (i > 9) 
                cout << (i % 2 ? "odd" : "even") << endl; 
                else cout << number[i - 1] << endl; 
        } 
        return 0;
     }
    
