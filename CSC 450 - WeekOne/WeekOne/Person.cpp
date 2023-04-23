/*
 * Person.cpp
 *
 *  Created on: Nov 19, 2022
 *      Author: Eric Newman
 */


#include <iostream>
#include <string>
using std::cout;
using std::endl;
using std::string;

class Person {
	public:
		string name;
		string fatherName;
		string motherName;
		string citizenship;
		string city;
		int age;
};
int main(){
	Person p;
	p.name = "Dan O'Connor";
    p.fatherName = "Rory O'Connor";
    p.motherName = "Caitlin O'Connor";
    p.citizenship = "British" ;
    p.city = "London";
    p.age = 37;

    cout << "Name: " << p.name << endl;
    cout << "Father's name: " << p.fatherName << endl;
    cout << "Mother's name: " << p.motherName << endl;
    cout << "Citizenship: " << p.citizenship << endl;
    cout << "City of residence: " << p.city << endl;
    cout << "Age: " << p.age << endl;
    return 0;
};
