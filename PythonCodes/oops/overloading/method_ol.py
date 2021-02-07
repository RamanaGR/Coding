class MethodOverloading:
    '''In Python Method overloading is not possible.
       If we are trying to declare multiple methods
       with same name and different number of arguments
       then Python will always consider only last method.'''

    @staticmethod
    def m1():
        print('no arg method')

    @staticmethod
    def m1(other):
        print('one-arg method')


MethodOverloading.m1()

