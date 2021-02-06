class Test:
    """Class Methods can have class variables (static variables).
        We can declare class method explicitly by using @classmethod decorator.
        We should provide cls variable at the time of declaration"""
    count = 0

    def __init__(self):
        Test.count = Test.count + 1

    @classmethod
    def get_no_of_objects(cls):
        print("The Number of Objects: {}".format(cls.count))


t = Test()
t1 = Test()
Test.get_no_of_objects()
