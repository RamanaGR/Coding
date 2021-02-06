
class Employee:
    '''Static Variables --> Class level Varaibles /
    Single copy for all objects /Common variables'''

    company = 'Innovapath'  # 1 Static Variable

    def __init__(self, name, id):
        self.name = name
        self.id = id
        Employee.role = 'QA'  # 2

    def m1(self):
        Employee.salary = 2000  # 3

    @classmethod
    def m2(cls):
        cls.a = 20
        Employee.b = 40  # 4

    @staticmethod
    def m3():
        Employee.c = 60  # 5


employee = Employee('Surya', '23')
Employee.d = 80  # 6
del Employee.d

print(Employee.__dict__)
print(employee.id,employee.name,employee.company, Employee.company)
