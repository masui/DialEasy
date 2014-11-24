all:
	ant debug
install:
	adb install -r bin/DialEasy-debug.apk
clean:
	/bin/rm -r -f bin gen
masui:
	/bin/cp assets/masui/* assets
publish:
	/bin/cp assets/template/* assets
