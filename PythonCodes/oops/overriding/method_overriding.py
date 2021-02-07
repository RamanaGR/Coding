class TestA:
    '''
        What ever members available in the parent class are bydefault available to the child class through
    inheritance. If the child class not satisfied with parent class implementation then child class is
    allowed to redefine that method in the child class based on its requirement. This concept is called
    overriding.
    Overriding concept applicable for both methods and constructors.
    '''

    def msg(self):
        print("Parent classs msg")

    def wish(self):
        print("Hello From Parent")


class TestB(TestA):

    # def msg(self):
    #     print("Child classs msg")
    def wish(self):
        #super().wish()
        print("Hello From Child")


t = TestB()
t.msg()
t.wish()
