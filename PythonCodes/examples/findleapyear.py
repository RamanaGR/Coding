# Python program to check if year is a leap year or not

# To get year (integer input) from the user
# year = int(input("Enter a year: "))
class FindLeapYear:
    @staticmethod
    def is_leap_year(year):
        if (year % 4) == 0:
            if (year % 100) == 0:
                if (year % 400) == 0:
                    print("{0} is a leap year".format(year))
                else:
                    print("{0} is not a leap year".format(year))
            else:
                print("{0} is a leap year".format(year))
        else:
            print("{0} is not a leap year".format(year))


leapYear = FindLeapYear()
leapYear.is_leap_year(2000)