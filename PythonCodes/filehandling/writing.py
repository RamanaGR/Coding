class FileHandling:
    @staticmethod
    def write_operation():
        f = open("abcd.txt", 'a')
        f.write("Python\n")
        f.write("File\n")
        f.write("Handling\n")
        print("Data written to the file successfully")
        f.close()

    @staticmethod
    def writelines_operation():
        f = open("abcd.txt", 'w')
        list = ["python\n", "R\n", "Kotlin\n", "scala"]
        # tuple=("python\n","R\n","Kotlin\n","scala")
        # set = {"python\n","R\n","Kotlin\n","scala"}
        f.writelines(list)
        print("List of lines written to the file successfully")
        f.close()


FileHandling.write_operation()
FileHandling.writelines_operation()
