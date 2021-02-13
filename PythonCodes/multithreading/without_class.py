from threading import *


def display():
    for i in range(1, 11):
        print("Child Thread")


t = Thread(target=display)  # creating Thread object
t.start()  # starting of Thread
for i in range(1, 11):
    print("Main Thread")
