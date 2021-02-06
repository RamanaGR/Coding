import time
import gc


class Test:
    def __init__(self):
        print("Object Initialization...")

    """The __del__() method is a known as a destructor method in Python. 
    It is called when all references to the object have been deleted or when the program ends."""

    def __del__(self):
        print("Fulfilling Last Wish and performing clean up activities...")


t1 = Test()
# del t1

# t1 = None
# time.sleep(5)
print("End of application")


print(gc.isenabled())
gc.disable()
print(gc.isenabled())
gc.enable()
print(gc.isenabled())
