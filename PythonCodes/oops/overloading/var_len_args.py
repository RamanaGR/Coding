class Test:
    def sum(self, *args):
        result = 0
        for arg in args:
            result = result + arg
            print(result)

    def print_values(self, **kwargs):
        for key, value in kwargs.items():
            print("{} is {}".format(key, value))


t = Test()
t.sum()
t.sum(10)
t.sum(10, 20)
t.sum(10, 20, 30, 40)
t.sum(10, 20, 30, 50, 0, 10, 100)

t.print_values(Firstname="Sita", Lastname="Sharma", Age=22, Phone=1234567890)
t.print_values(Firstname="John", Lastname="Wood", Email="johnwood@nomail.com", Country="Wakanda", Age=25,
               Phone=9876543210)
