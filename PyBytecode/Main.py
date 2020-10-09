import compileall
import dis
import sys


'''
compileall.compile_dir(dir = "E:/tensorflow",
                       maxlevels = sys.getrecursionlimit(),
                       optimize = -1,
                       workers = 1,
                       force=True,
                       legacy=True)
'''

dis.dis(
    file = "E:/tensorflow/tensorflow/python/__pycache__/__init__.cpython-38.py",
)