cd C:\Users\Krzysiek\IdeaProjects\kodilla-course\build\libs
DEL *.jar
cd C:\Users\Krzysiek\IdeaProjects\kodilla-course
call gradle build
cd C:\Users\Krzysiek\IdeaProjects\kodilla-course\build\libs

IF EXIST *.jar (mkdir project
copy *.jar project
) ELSE (
	echo compilation error
)