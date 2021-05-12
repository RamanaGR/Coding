# class P:
#     a = 10
#
#     def __init__(self):
#         self.b = 20
#
#
# class C(P):
#     def m1(self):
#         print(super().a)
#         # print(super().b)
#
#
# c = C()
# c.m1()

class P:
    def __init__(self):
        print('Parent Construtor')

    def m1(self):
        print('Parent instance Method')

    @classmethod
    def m2(cls):
        print('Parent Class Method')

    @staticmethod
    def m3():
        print('Parent Static Method')


class C(P):

    def __int__(self):
        super().__int__()
        super().m1()
        super().m2()
        super().m3()


c = C()
# c.method()
