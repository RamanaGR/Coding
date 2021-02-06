class Employee:
    name = 'KMIT'

    def __init__(self, eno):  # , ename, esal, eaddr):
        self.eno = eno
        # self.ename = ename
        # self.esal = esal
        # self.eaddr = eaddr
        print(id(self))

    @classmethod
    def getEmployee(cls):
        print("College name: " + cls.name)

    @staticmethod
    def get_employee_name(self):
        print("College name: " + self.name)


s = Employee(25)
print(id(s))
s.getEmployee()
Employee.getEmployee()
