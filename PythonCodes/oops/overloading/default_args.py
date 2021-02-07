class Test:
    def sum(self, a=None, b=None, c=None):
        if a is not None and b is not None and c is not None:
            print('The Sum of 3 Numbers:', a + b + c)
        elif a is not None and b is not None:
            print('The Sum of 2 Numbers:', a + b)
        else:
            print('Please provide 2 or 3 arguments')


t = Test()
t.sum(10, 20)
t.sum(10, 20, 30)
t.sum(10)
