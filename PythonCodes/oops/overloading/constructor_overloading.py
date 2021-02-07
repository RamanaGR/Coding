class Test:
    '''Constructor overloading is not possible in Python.
       If we define multiple constructors then the last
       constructor will be considered.'''

    def __init__(self):
        print('No-Arg Constructor')

    def __init__(self, a):
        print('One-Arg constructor')

    def __init__(self, a, b):
        print('Two-Arg constructor')


'''
    # With Default Args
    def __init__(self, a=None, b=None, c=None):
        print('Constructor with 0|1|2|3 number of arguments')

    # With Key Words Args
    def __init__(self, *a):
        print('Constructor with variable number of arguments')
'''

# t1=Test()
# t1=Test(10)
t1 = Test(10, 20)
