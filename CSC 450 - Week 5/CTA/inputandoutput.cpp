#include <iostream>
#include <fstream> // comes with ofstream/ifstream
/*
Name Eric Newman 
Project Name: 22WA-CSC450-1
Project Purpose: Demonstrate finding a text file, reading the text file, adding to it and checking if the file exists
Algorithm Used:  none
Program Inputs: text file, user input
Program Outputs: depdends upon user input, accepts strings of any number amount
Program Limitations: file is found in C:\MinGW\bin on PC
Program Errors: the second if else block which should print the contents of the text doc to the console does not
                but it does the second time the program is meant to print the output after the append to the console.
*/
#include <string>
#include <filesystem>
int main(){
    std::fstream myFile("CSC450_CT5_mod5.txt"); // instance of fstream
    myFile.open("CSC450_CT5_mod5.txt", std::ios::ate | std::ios::app); // open file
    std::string myString;           // string to accept file contents 
        // check to file exists
        if(myFile.is_open()){
            std::cout << "name found" << std::endl;
            // if file is empty adds information required
            if(std::filesystem::is_empty("CSC450_CT5_mod5.txt")){
                    std::string ifNoData("Please be sure to append your data to this text file. \n\nIf these first three lines are deleted, then your program is not functioning as expected.");
                    myFile << ifNoData;
            while(myFile.good()){
                std::getline(myFile, myString);     // get the string of the text file
                std::cout << myString << std::endl;
                }
            }
        myFile.close();
    }
    //open a file to perform read operation using file object
    myFile.open("CSC450_CT5_mod5.txt",std::ios::ate | std::ios::app); 
        if(myFile.is_open()){
            std::string userInput;
            std::cout << "Enter a string to add to the file" << std::endl;
            std::getline(std::cin, userInput);
            std::string asProgrammed ("\nThis file is appended.\nby Eric Newman");
            myFile << "\n" << userInput << "\n" << asProgrammed << std::endl;
            myFile.close();
            }   
    myFile.open("CSC450_CT5_mod5.txt"); //open a file to check if it has changed.    
        if(myFile.is_open()){
            while(myFile.good()){
                std::getline(myFile, myString);
                std::cout << myString << std::endl;
                }
            // check to see if file exists again
            if(myFile.is_open()){
                std::cout << "name found again" << std::endl;
            } else{
                std::cout << "file not found, creating CSC450-not-found.txt" << std::endl;
                myFile.open("CSC450-not-found.txt", std::ios::in | std::ios::out); // open file
                if(myFile.is_open()){
                std::string notFound ("name not found");
                myFile << notFound << std::endl;
                myFile.close();
                }   
            }
        myFile.close();
   }
return 0;
} // end main

/*

 The fstream as noted comes with ofstream/ifstream capabilities. This means it’s capable
    of creating files, writing to files,
    reading from data files. For example it has:
    - ios::app which is append mode. The output sent to the file is appended to it.
    - ios::ate which opens the file for the output then moves the read and write control to
               initial position at the end of the file.
    - ios::in which opens the file for a read.
    - ios::out which opens the file for a write.
    - ios::trunc which if a file exists, the file elements should be truncated (shortening
                 information by removing data at the end) prior to its opening.
    - ios::binary which open in binary mode.

    There is the functions:
    - open() function, which creates a new file.
    - eof() which stands for end of file and keeps on reading from the file.
    - close() function, which closes a file.
    - is_open() function, which checks to see if open.
    - good() function, which checks if the stream is good enough to work.
    - get() function, which reads in one character at a time. Does not ignore white
            space and instead treats it as a series of ordinary characters.
    - getline() which reads in the text until it encounters a line break.
    - tellg() function is used with input streams, and returns the current “get” position
              of the pointer in the stream. 

other ways to make this:
 std::fstream myFile("CSC450_CT5_mod5.txt"); // create an instance of the fstream class and give
                                    // it the name myFile. A a one liner could have been
                                    // std::fstream myFile("CSC450_CT5_mod5.txt") (or ifstream)
myFile.open("CSC450_CT5_mod5.txt", std::ios::ate | std::ios::app); // Use the open() function, which connects
                                    // myFile to a stream object, std::ios::ate starts at end of file,
                                    // std::ios::app is used to append the output to myFile.

 std::fstream myFile("CSC450_CT5_mod5.txt"); // create an instance of the fstream and name as myFile
            // automatically assumed mode operators:
            // ifstream ios::in 
            // ofstream ios::out
            // fstream	ios::in | ios::out

    std::string myString;           // declare a string variable that can hold the contents, named myString
        if(myFile.is_open()){
            while(myFile.good()){
                std::getline(myFile, myString);
                std::cout << myString << std::endl;
                myFile.close(); // close the file
            }       // end while
        } else {    // end if and start else
            std::cout << "No such file." << std::endl;
    }
// string
        if (myFile.is_open()) {     // a check whether the file is open
            while (myFile.good()) { // read the entire file ... can also just be while(myFile)
                myFile >> myString; // pipe file's content into stream
                std::cout << myString; // pipe stream's content to standard output
                myFile.close(); // close the file
            } // end while
        } // end if
    or..
        if(myFile.is_open()){
                while(myFile){
                    std::getline(myFile, myString);
                    std::cout << ": " << myFile.tellg() << std::endl;
                    myFile.close(); // close the file
                } // end while
            } // end if
// with char ... reads every single character 
        if (myFile.is_open()) {
                while ( myFile ) {
                    char ch;                        // declare a char with name ch
                    ch = myFile.get();              // use char and get() reads in one character at a time.
                    std::cout << ch;
                    myFile.close(); // close the file
                } // end while
            } // end if
// with first seeing if file is not a file present
        if(!myFile){                // Use an if statement and print out to user if file does not exist.
                    std::cout << "No such file." << std::endl;
                } else {            // end if and start else statement to state what to do if the file is found.  
                    while(1){               // while loop for iterating over the file contents.
                        myFile >> myString; // write/store contents of the file in the variable ch.
                        if(myFile.eof())    // if condition and eof() to ensure the compiler keeps on reading the file.
                            break; // break statement to stop reading from the file once the end is reached.
                        std::cout << myString; // show the contents of variable ch on the console.
                        myFile.close(); // close the file
                    } // end while
                } // end else
    other thoughts... when it creates a file if it does not exist then add the information

      
*/