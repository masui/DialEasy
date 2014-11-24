all:
	ant debug
install:
	adb install -r bin/DialEasy-debug.apk
clean:
	/bin/rm -r -f bin gen
