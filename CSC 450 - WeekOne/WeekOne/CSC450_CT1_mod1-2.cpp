#include <iostream>
/* bring selected identifiers to the current scope with the help of the using declaration rather than
* using namespace std. The namespace std directive that brings all the identifiers can create naming
* conflicts with other namespaces */
using std::cout;                       // telling the compiler to bring only the identifier cout
using std::endl;                       // and endl

// Main Function
int main() {
     double myMoney = 1000.50;  //this should be printed out
     // Standard Ouput Statement
     cout << "Please be sure to correct all syntax errors in this program" <<endl;
     cout <<"I have corrected all errors for this program." << endl;
     cout << " The total amount of money available is = " << myMoney << endl;
     // Wait For Output Screen
     return 0; // Main Function return Statement
};
