// program that reverseInput a string entered by user
#include <iostream>
#include <string>
#include <iostream>
#include <stdexcept>
using std::cout;
using std::cin;
using std::endl;
using std::string;

void reverseInput(const string& input);
int main() {
    string userString;
    try {
        for(int i = 0; i < 3; i++){
        try{
            
            cout << "Enter a string " << endl;
            if(getline(cin, userString)){
                    if(userString.empty()){
                        cout << "Pressed Enter" << endl;
                    } else {
                        cout << "Thanks!" << endl;
                    }
                } else {
                cout << "Input failed - no more input?" << endl;
                }   
            reverseInput(userString);       // call the reverseInput function
            cout << endl; 
            } catch(std::invalid_argument const& ex){
                cout << "invalid argument " << ex.what() << '\n';
            }       
        }
    }  catch (std::ios_base::failure &e) {
        cout << "Caught an ios_base::failure." << endl;
    }
    string str(userString, cin.gcount());
    return 0; 
}
void reverseInput(const string& userString) {
    size_t charAmount = userString.size();
    if(charAmount == 1)                     // base case
       cout << userString << endl;
    
    else if(charAmount == 0){
        cout << "You pressed enter without typing anything" << endl;
    }
    else {                                  // recursive case
       cout << userString[charAmount - 1];
                            // substr() gives the string up to second last character 
       reverseInput(userString.substr(0, charAmount - 1)); 
    }
}