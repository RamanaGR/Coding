class FileReading:
    @staticmethod
    def read_ex():
        f = open("abcd.txt", 'r')
        data = f.read()

        # To read only first 10 characters
        # data=f.read(10)

        # To read data line by line
        # data = f.readline()

        # To read all lines into list
        # lines = f.readlines()
        # for line in lines:
        #     print(line, end='')
        # f.close()

        print(data)
        f.close()


FileReading.read_ex()


# The with statement:
def read_with():
    with open('abcd.txt', 'r') as f:
        data = f.read()
        print(data)
        f.close()

read_with()