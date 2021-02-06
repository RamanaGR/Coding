import sys


class IOFiles:


    def read_File(self):
        read = open("Example.txt", mode='rt', encoding='utf-8')
        print(read.read())
        print(read.readlines())
        print(read.readline())

    read_File()