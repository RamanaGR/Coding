""" general utility methods.
    We can declare static method explicitly by using @staticmethod decorator
    We can access static methods by using classname or object reference
"""


class Calculator:

    @staticmethod
    def add(x, y):
        return x + y

    @staticmethod
    def product(x, y):
        return x * y

    @staticmethod
    def average(x, y):
        return (x + y) / 2


print(Calculator.add(2, 5))
print(Calculator.product(2, 5))
print(Calculator.average(2, 5))
