from configparser import ConfigParser


def readConfig(section,key):
    config = ConfigParser()
    config.read("config.ini")
    return config.get(section,key)

print(readConfig("locator","username"))
