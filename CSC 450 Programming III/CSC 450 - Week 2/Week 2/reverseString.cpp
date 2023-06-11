// program that reverseInput a string entered by user
#include <iostream>
#include <string>
using std::cout;
using std::cin;
using std::endl;
using std::string;

void reverseInput(const string& input);
int main() {
    string userString;
    for(int i = 0; i < 3; i++){
        cout << "Enter a string " << endl;
        getline(cin, userString);
        reverseInput(userString);       // call the reverseInput function
        cout << endl; 
    }
    return 0; 
}
void reverseInput(const string& userString) {
    size_t charAmount = userString.size();
    if(charAmount == 1)                     // base case
       cout << userString << endl;
    else {                                  // recursive case
       cout << userString[charAmount - 1];
                            // substr() gives the string up to second last character 
       reverseInput(userString.substr(0, charAmount - 1)); 
    }
}