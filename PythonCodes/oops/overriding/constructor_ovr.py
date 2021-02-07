class P:
    '''
    if child class does not contain constructor then parent class constructor will
    be executed
    '''

    def __init__(self):
        print('Parent Constructor')


class C(P):
    def __init__(self):
        #super().__init__()
        print('Child Constructor')

    def msg(self):
        print('Child meth')


c = C()
