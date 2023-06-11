/* Simple Program with a few Errors for Correction
   Please be sure to correct all outlined errors.*/
#include <iostream>
/* bring selected identifiers to the current scope with the help of the using declaration rather than
* using namespace std. The namespace std directive that brings all the identifiers can create naming
* conflicts with other namespaces */
using std::cout;                       // telling the compiler to bring only the identifier cout
using std::endl;                       // and endl

// Main Function
int main() {
     //Standard Ouput Statement
     cout << "Welcome to this C++ Program" << endl;
     cout << "I have corrected all errors for this program." << endl;
     // Wait For Output Screen
     return 0; // Main Function return Statement
};
