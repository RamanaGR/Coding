class Student:
    '''
    PG: 232
    3 Types of Variables:
        1) Local Variables
        2) Instance Variables
        3) Static Variables

    3 Types of methods:
        1) Instance Methods
        2) Static Methods
        3) Class Methods
    '''

    # Instance Variable - Value of variable changes Obj to Obj
    def __init__(self, name, id):
        self.name = name
        self.id = id

    def info(self):
        x = 20  # Local Variable
        self.grade = 2

    def average(self, li):
        result = sum(li) / len(li)
        print('The Average Value: ', result)

    def delete(self):
        del self.id


s = Student('Vedang', '011')
print(s.name, s.id)
s.info()
s.age = 20
print(s.__dict__)
