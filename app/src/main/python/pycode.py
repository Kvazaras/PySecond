import io
import re

#https://stackoverflow.com/questions/54667573/how-to-configure-python-interpretor-in-android-studio
def countchars(inputString):
    return len(inputString)

def countwords(inputString):
    return len(re.findall(r'\w+', inputString))

