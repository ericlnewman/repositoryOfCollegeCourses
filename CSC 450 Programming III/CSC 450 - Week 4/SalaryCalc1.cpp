#include <iostream>
#include <iomanip>
#include <limits>

int main () {
    double hours, payRate, overtimeHours, overtime, salary, weekHours, overTimeRate;
    hours = -1.0;
    payRate = -1.0;
    overtimeHours = -1.0;
    weekHours = 40.0;
    overTimeRate = 1.5;
    int extraTime = 0;
    // asking for user input with input validation
    do{
        std::cout << "Standard hours worked: " << std::endl;
        while (!(std::cin >> hours)) {
        std::cin.clear();
        std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
        std::cout << "Enter a valid number for standard hours worked:\n";
        }
    } while(hours < 0);
    std::cout << "Did you work overtime? (1 for yes)" << std::endl;
    std::cin >> extraTime;
    if(extraTime = 1){
        do{
            std::cout << "Overtime hours worked: " << std::endl;
            while (!(std::cin >> overtimeHours)) {
            std::cin.clear();
            std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
            std::cout << "Enter a valid number for overtime hours worked:\n";
            }
        } while(overtimeHours < 0);
        } else{
            extraTime = 0;
        }
    do{
        std::cout << "Hourly wage: " << std::endl;
        while (!(std::cin >> payRate)) {
        std::cin.clear();
        std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
        std::cout << "Enter a valid number for wage:\n";
        }
    } while(payRate < 0);
    // pointer variables
    double *hp, *pp, *op, *sp, *wp, *otp, *othp;
    // assigning pointers to double variables
    hp = new double(hours);
    pp = new double(payRate);
    op = new double(overtime);
    sp = new double(salary);
    wp = new double(weekHours);
    otp = new double(overTimeRate);
    othp = new double(overtimeHours);
    // conditional statements to calculate salary depending on overtime 
    
    *sp = *hp * *pp;
        if(*othp > 0){
        *op = *othp * *pp;
        *sp = *sp + *op;
    }
    
    // fixed and set precision used to with exactly as many digits in the decimal in precision field
    std::cout << "Total Pay: \n"  << std::setw(20) // set output width to 20
    <<std::fixed << std::setprecision(2) << *sp << std::endl;
    // freeing and deleting the memory
    free(hp);
    free(pp);
    free(op);
    free(sp);
    free(wp);
    free(otp);
    delete hp, pp, op, sp, wp, otp;
return 0;
}