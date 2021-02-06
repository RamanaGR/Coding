from closures.raise_to import raise_to
import time
square = raise_to(2)
print(square(5))
print(square.__closure__)
cube = raise_to(3)
print(cube(5))


def make_timer():
    last_called = None
    def elapsed():
        nonlocal last_called
        now = time.time()
        if last_called is None:
            last_called = now
            return None
        result = now - last_called
        last_called = now
        return result
    return elapsed

t = make_timer()

print(t())