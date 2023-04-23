#include <iostream>
using std::cout;
using std::cin;
using std::endl;


int main(){
    // pointers
    int *a;
    a = new int;
    int *b;
    b = new int;
    int *c;
    c = new int;
    // asking for input from user
            cout << "Enter a number: " << endl;
               try{
                cin >> *a;
                }catch (const std::exception& ex) {
                    cout << "An exception!" << endl;
                }
            cout << "Enter another number: " << endl;
                  try{
                cin >> *b;
                }catch (const std::exception& ex) {
                    cout << "An exception!" << endl;
                }
            cout << "Enter a final number: " << endl;
                  try{
                cin >> *c;
                }catch (const std::exception& ex) {
                    cout << "An exception!" << endl;
                }
// There are four arithmetic operators that can be used on pointers: ++, --, +, and -

            int sumOfAB = *a + *b;
            int sumOfBC = *b + *c;
            int sumOfAC = *a + *c;
            int sumOfABC = *a + *b + *c;
            int minusOfAB = *a  - *b;

            cout << "You entered: " << *a << ", " << *b << ", " << *c << endl;
            cout << "And " << *a << " is at " << a << " in main memory " << endl;
            cout << "While " << *b << " is at " << b << " in main memory " << endl;
            cout << "And " << *c << " is " << " is at " << c << " in main memory " << endl;

            cout << "Using those addresses, math can be used find the sums such as " << *a << " + " << *b << " = " << sumOfAB << endl;
            cout << "Or to find the sum of " << *b << " + " << *c << " = " << sumOfBC << endl;
            cout << "And even for " << *a << " + " << *c << " = " << sumOfAC << endl;
            cout << "Finally altogether it is " << *a << " + " << *b << " + " << *c << " = " << sumOfABC << endl;
            cout << "Also there is subtraction " << *a << " - " << *b << " = " << minusOfAB << endl;

            cout << "So far this has been adding but there is also increment, like " << *a << " at " << a <<" becomes :" << endl;
            for(int i = 0; i < 2; i++){
                a++;
            }
            cout << *a << " at " << a << endl;
            cout << "Or it can decrement, like: " << endl;
            for(int i = 2; i > 0; i--){
                a--;
            }
            cout << *a << " at " << a << endl;
// freeing and deleting the memorys
        free(a);
        free(b);
        free(c);
        delete a;
        delete b;
        delete c;

    return 0;
    }