x = 100


class Test:
    ''' Functional Programming feature is Global variable '''

    def m1(self):
        #global x   # declare global variables inside class or method
        x = 888  # Local Variable
        print(x)

    def m2(self):
        print(x)  # Accessing Global Variable


t = Test()
t.m1()
t.m2()
print(x)
