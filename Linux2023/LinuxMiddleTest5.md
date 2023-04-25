# 쉘 스크립트

## 쉘 스크립트란?
- 사용하고자 하는 쉘 명령어를 파일에 기술한 것
  - 윈도우즈의 *.bat 파일도 명령어의 집합
- 쉘의 종류에 따라 스크립트의 문법은 달라질 수 있다
- 리눅스 대부분이 bash 기반의 쉘을 사용하므로 쉘 스크립트라고하면 보통 bash 기반의 스크립트를 말함
- 보통 확장자로 `.sh`를 사용한다

## 작성 및 실행

### 작성
- 확장자 `.sh`를 가지는 파일에 명령어를 기술

### 실행
1. `bash 파일이름`
  - bash에게 파일 이름을 전달하며 실행을 요청하는 방법
2. 쉘 스크립트 파일을 실행 가능한 파일로 작성
  - 코드 상단에 해당 코드를 실행할 쉘을 지정(생략할 경우 기본 쉘로 실행)
  - 코드 작성 후 `chmod u+x 파일명`
  - `./파일이름` : 작성한 스크립트 파일이 PATH에 없는 경우 ./ 를 명시해야 함

```bash:쉘 스크립트 작성 및 실행1
1. hello.sh 파일을 만들고 Hello!! 를 출력하는 쉘 스크립트 명령문을 작성하라
2. 해당 스크립트 파일에 실행 권한을 추가하라
3. 해당 스크립트 파일을 실행하라
4. 현재 디렉토리의 절대 경로를 출력하는 스크립트를 작성하라(파일명은 ex1.sh)
5. 자신의 홈 디렉토리(~)에 first 라는 이름의 빈 파일을 하나 만들고 같은 폴더에 second 라는 이름으로 복사한 다음 두 파일이 잘 만들어졌는지 확인할 수 있도록 작성하라(파일명은 ex2.sh)

# 정답
# 1.
# #! /bin/bash
# echo Hello!!
# 2. chmod u+x hello.sh
# 3. ./hello.sh
# 4. vi ex1.sh
    # #! /bin/bash
    # pwd
    # chmod u+x ex1.sh
    # ./ex1.sh
# 5. vi ex2.sh
    # #! /bin/bash
    # touch ~/first
    # cp ~/first ~/second
    # ls -l first second
    # chmod u+x ex2.sh
    # ./ex2.sh
```

## 변수
- 변수는 따로 선언 없이 처음 사용할 때 만들어진다
- 변수 이름은 대소문자를 구별한다
- 데이터 타입은 기본 문자열이다
- 변수를 만들거나 값을 수정할 때는 이름만 적는다
- 변수의 값을 읽을 때는 변수 이름 앞에 $를 붙인다
- `변수이름=값`의 형식이며 = 앞 뒤에는 공백이 없어야 한다
  - 값이 띄어쓰기를 포함한 경우 "" 로 묶는다
- 스크립트에서 선언한 변수 외에 환경변수에 선언된 변수도 사용할 수 있다

```bash: 변수예제
1. hello2.sh 파일에 변수 value, value2, value3에 각각 3, Hello, Hello World!를 저장하고 해당 파일을 실행 시 세 변수의 값이 호출되도록 작성하라
2. hello3.sh 파일을 실행 시 변수 msg와 msg2에 각각 Hello 유저명~ 과 Your home is 홈디렉토리경로 를 출력하는 파일을 만들어라

# 정답
# 1. vi hello2.sh
    # #! /bin/bash
    # value=3
    # value2=Hello
    # value3="Hello World!"
    # echo $value
    # echo $value2
    # echo $value3
    # chmod u+x hello2.sh
    # ./hello2.sh
# 2. vi hello3.sh
    # #! /bin/bash
    # msg="Hello $USER"
    # msg2="Your home is $HOME"
    # echo msg
    # echo msg2
    # chmod u+x hello3.sh
    # ./hello3.sh

```

### 명령행 인자(Command Line Argument)
`./파일명 인자0 인자1 `
- 파일을 실행할 때 전달되는 인자들
- 실행할 때 명령행 인자는 해당 파일을 실행 시 파일명 뒤에 붙이면 된다
> 명령행 인자
  1. $0 : 쉘 스크립트의 이름, `./파일명` 형식으로 반환
  2. $1, 2, ... : 인자0, 1, ... 를 의미
  3. $# : 매개변수의 개수를 저장
```bash: 명령행 인자 예제
1. 명령행 인자를 받는 hello4.sh 파일에 first와 second를 명령행 인자를 줬을 때 결과 값이 first, second, 2가 나오게 하는 명령문을 작성하라
2. 명령행 인자 2개를 받아 첫 번쨰 인자를 이름으로 하는 빈 파일을 만들고 두 번째 인자는 첫 번째 인자로 만들 파일을 가리키는 심볼릭 링크로 만들어라(단, 명령행 인자는 정확하게 2개가 들어온다고 가정할 것, ex3.sh로 작성)

# 정답
# 1. vi hello4.sh
    # #! /bin/bash
    # echo $1
    # echo $2
    # echo $#
# 2. vi ex3.sh
    # #! /bin/bash
    # touch $1
    # ln -s $1 $2
    # ls -l $1 $2
    # chmod u+x ex3.sh
    # ./ex3.sh

```

### read
- 스크립트 실행 후 사용자로부터 변수 입력을 받는 기능
`read 변수명`

```bash:read 예제
1. 사용자로부터 이름을 입력받고, 해당 입력을 출력하는 쉘 스크립트 파일 hello5.sh 를 작성하라
2. 스크립트 실행 후 사용자로부터 파일 이름을 입력 받고 키워드를 입력받아 해당 파일에 대소문자 상관없이 키워드를 찾아 터미널에 출력해주는 스크립트 ex4.sh 를 작성하라

# 정답
# 1. vi hello5.sh
   # #! /bin/bash
   # echo "Enter your name"
   # read name
   # echo "Hello! $name!!"
   # chmod u+x hello5.sh
   # ./hello5.sh
# 2. vi ex4.sh
   # #! /bin/bash
   # echo "Enter File name"
   # read file
   # echo "Enter Keyword"
   # read keyword
   # cat $file | grep -i $keyword
   # chmod u+x ex4.sh
   # ./ex4.sh

```

### 인용 부호
- 쉘 스크립트의 인용부호는 3가지
1. "" : 따옴표
  - 여러 단어를 하나의 단어로 만들어준다
  - 변수의 값을 반환한다
2. '' : 작은 따옴표
  - 여러 단어를 하나의 단어로 만들어준다
  - 변수 값을 반환하지 않는다
3. `` : 백틱
  - 명령어를 실행한다
  - 따옴표 안에서 사용가능하다

```bash:인용부호 예제
1. name 변수를 호출할 수 있도록 사용되는 인용부호는?
2. $name 을 적어도 해당 변수 내용 값이 출력되지 않는 인용부호는?
3. 현재 접속되어 있는 사용자 명을 출력하도록 사용되는 인용부호는?
4. 쉘 스크립트 hello6.sh에 변수 cmd 값이 whoami 일때, echo와 3가지 인용부호를 사용하여 변수 결과값을 설명하라

# 정답
# 1. 따옴표(echo "$name")
# 2. 작은 따옴표(echo '$name')
# 3. 백틱(echo `whoami`)
# 4. 
   # a. echo "$cmd" = whoami 가 출력
   # b. echo '$cmd' = $cmd 가 출력
   # c. echo `$cmd` = 현재 사용자명이 출력

```

### 산술 연산
- 쉘 스크립트의 변수는 기본적으로 문자열
- 산술 연산을 위해서는 추가 작업이 필요하다
  - 단, 정수형만 가능하다
1. expr : 연산문
  - 대부분 bash 에서 지원
  - expr과 변수 사이 연산자 사이 공백 필요
  - 다른 변수에 할당할 경우 `` 필요함
  - 곱하기 연산할 때 \*로 사용해야 함
2. $(()) : 연산문
  - += 등의 복잡한 연산자 제공
  - 변수와 연산자 사이 공백 필요 없음
  - 변수 이름에 $ 생략 가능
3. let : 선언문
  - 계산 및 결과 할당
  - 변수 이름에 $ 생략 가능
```bash:산술 연산 예제
1. 쉘 스크립트 hello7.sh 에 변수 a의 값이 10, b의 값이 2로 선언되어있다. 아래 코드를 보고 해당 명령문을 설명하라
  a = 10
  b = 2
  echo `expr $a + $b`
  echo $(( $a + $b))
  echo $(( a + b ))
  result=`expr $a - $b`
  echo $result
  result=$(( a - b ))
  echo $result
  let result=a-b
  echo $result

# 정답
# 1. 위에서 부터 명령문 결과
   # 12
   # 12
   # 12
   # 8
   # 8
   # 8

```

# 쉘스크립트 조건문

## if

### 기본구조
```bash
if 조건문
then
# 참일 경우 실행할 명령어
fi # if의 끝
```
```bash
if 조건문
then
# 참일 경우 실행할 명령어
else
# 거짓일 경우 실행할 명령어
fi # if의 끝
```
```bash
if 조건문
then
# 참일 경우 실행할 명령어
elif 조건문
then
# elif에 참일 경우 실행할 명령어
else
# 위 조건문에 다 거짓인 경우 실행할 명령어
fi # if의 끝
```

### 조건문의 조건절
1. [조건절] : if 뒤 [ 와 ] 앞뒤로 공백 필수
  - 파일/디렉토리 관련, 문자열, 숫자 비교 가능
    - 단, < > 은 비교가 아닌 리다이렉션으로 처리
    - 또한 && || 는 명령어 조합으로 해석
2. test 조건절
  - 위와 동일, [] 대신 test 키워드로만 변경
3. [[조건절]]
  - < > 를 비교 연산자로 사용
  - && || 를 논리 연산자로 사용
  - 문자열 비교 할 때 Regular Expression 사용 가능
4. ((조건절))
  - 숫자 관련 비교를 할 때만 사용 가능
  - (()) 와 내부 조건절 사이 공백 필요없음
  - < > 등의 기호 사용 가능

### 조건절의 비교문법
1. 숫자 관련 조건문
- -eq : 앞 뒤의 값이 서로 같을 경우에만 참
- -ne : 앞 뒤의 값이 서로 다를 경우에만 참
- -gt : 앞의 값이 뒤에 값보다 클 경우에만 참
- -lt : 앞의 값이 뒤에 값보다 작을 경우에만 참
- -ge : 앞의 값이 뒤에 값보다 크거나 같을 경우에만 참
- -le : 앞의 값이 뒤에 값보다 작거나 같을 경우에만 참

2. 파일/디렉토리 관련 조건문
- -s : file이 존재하면서 크기가 0보다 큰 경우에만 참
- -f : 폴더가 아닌 file 인 경우에만 참
- -d : 폴더인 경우에만 참
- -w : 쓰기가 가능한 경우에만 참
- -r : 읽기가 가능한 경우에만 참
- !-옵션 : 옵션 내용이 거짓인 경우에만 참

3. 문자열 관련 조건문
- = : 앞 뒤 문자열이 같은 경우에만 참
- != : 앞 뒤 문자열이 다른 경우에만 참
- -z : 뒤에 있는 문자열 길이가 0인 경우에만 참
- -n : 뒤에 있는 문자열 길이가 0이 아닌 경우에만 참

```bash:숫자비교 조건문
쉘 스크립트 파일인 ifex1.sh 에 다음과 같은 변수가 있다
var=3
1. 이 값이 1보다 큰 경우 ok 를 출력하는 조건문을 작성하라(4가지)
2. 스크립트 실행 후 사용자로부터 username을 받고, 현재 로그인 아이와 같으면 USER, 다르면 GUEST라 출력하는 쉘 스크립트 ifex2.sh 를 작성하라
3. 스크립트 실행 후 사용자로부터 파일 이름을 입력 받아 사이즈에 관계 없이 해당 파일이 존재하면 TRUE, 없으면 FALSE를 출력하는 쉘 스크립트 ifex3.sh 를 작성하라
4. 스크립트 실행 후 사용자로부터 디렉토리를 입력 받고 디렉토리가 없으면 새로 만들고 이미 존재한다면 삭제 후 새로 만드는 쉘 스크립트 ifex4.sh 를 작성하라
5. 명령행 인자를 2개 받고 하나도 입력안 된 경우 둘 다 런타임에 입력 받고 하나만 입력한 경우 하나를 추가로 입력 받은 다음 두 인자가 같으면 SAME, 다르면 DIFF 를 출력하는 쉘 스크립트 ifex5.sh를 작성하라

# 정답
# 1. if [ $var -gt 1 ]  if test $var -gt 1  if [[ $var -gt 1 ]] if (( $var > 1 ))
#    then echo ok
#    fi
# 2. vi ifex2.sh
  # #! /bin/bash
  # echo "Enter username"
  # read username
  # if test $username = `whoami` 또는 [ $username = `whoami` ]
  # then echo USER
  # else echo GUEST
  # fi
# 3. vi ifex3.sh
  # #! /bin/bash
  # echo "Enter File name"
  # read file
  # if test -f $file 또는 if [ -f $name ]
  # then echo "TRUE"
  # else echo "FALSE"
  # fi
# 4. vi ifex4.sh
  # #! /bin/bash
  # echo "Enter Directory name"
  # read directory
  # if test -d $directory 또는 if [ -d $directory ]
  # then rm -rf $directory
  # fi
  # mkdir $directory
# 5. vi ifex5.sh
  # #! /bin/bash
  # if test $# -gt 0
  # then first=$1
  # else echo "Enter first parameter"
  #      read first
  # fi

  # if test $# -gt 1
  # then second=$2
  # else echo "Enter second parameter"
  #      read second
  # fi

  # if test $first = $second
  # then echo "SAME"
  # else echo "DIFF"
  # fi

```

# 쉘 스크립트 - 반복문

## for

### 기본구조
```bash
for 변수 in 리스트
do
# 실행되는 명령어
done # 반복문 종료
```
```bash
for 변수 in `명령어`
do
# 실행되는 명령어
done # 반복문 종료
```
```bash
for 변수 in $(명령어)
do
# 실행되는 명령어
done # 반복문 종료
```
```bash
for 변수 in {시작숫자..끝숫자}
do
# 실행되는 명령어
done # 반복문 종료
```
```bash
for 변수 in {시작숫자..끝숫자..간격}
do
# 실행되는 명령어
done # 반복문 종료
```
```bash
for 변수 in $(seq 시작숫자 간격 끝숫자)
do
# 실행되는 명령어
done # 반복문 종료
```
```bash
for(( 초기화;비교;증감 ))
do
# 실행되는 명령어
done # 반복문 종료
```
> 여기서 반복문을 강제 종료하기 위해 break 사용 가능함
```bash:for 문 예제
1. Sam, Thomas, Henry 라는 리스트를 변수 i에 저장하여 각각 출력하는 쉘 스크립트 forex1.sh 파일을 작성하시오
2. ls 명령어의 실행 결과를 각 한줄씩 출력하게 하는 쉘 스크립트 forex2.sh 파일을 작성하시오(for문 사용, 2가지)
3. 1에서 5까지 출력하는 쉘 스크립트 forex3.sh 파일을 작성하시오(for문 사용, 4가지)
4. 현재 폴더의 ls 결과에 대하여 종류에 따라 다음과 같이 출력하는 forex4.sh 파일을 작성하시오
  a. Directory:이름 , File:이름
5. 자신이 홈폴더(~)에 backup 디렉토리가 없다면 추가하고 같은 이름의 파일이 있다면 파일을 backup~ 로 이름을 변경하고 backup 디렉토리 추가한다. 또한 backup 디렉토리 안에 b01, b02, b03, b04 서브 디렉토리를 추가하는 쉘 스크립트 forex5.sh 를 작성하라

# 정답
# 1. vi forex1.sh
  # #! /bin/bash
  # for i in Sam Thomas Henry
  # do
  # echo $i
  # done
# 2. vi forex2.sh
  # #! /bin/bash
  # for i in `ls` 또는 for i in $(ls)
  # do
  # echo $i
  # done
# 3. vi forex3.sh
  # #! /bin/bash
  # for i in {1..5} 또는 for i in 1 2 3 4 5 또는 for i in $(seq 1 1 5) 또는 (( i=1; i<=5; i++))
  # do
  # echo $i
  # done
# 4. vi forex4.sh
  # #! /bin/bash
  # for i in $(ls) 또는 for i in `ls`
  # do
  # if test -f $i 또는 if [ -f $i ]
  # then echo "File:$i"
  # else echo "Directory:$i"
  # fi
  # done
# 5. vi forex5.sh 
  # #! /bin/bash
  # if test -f ~/backup 또는 if [ -f ~/backup ]
  # then mv ~/backup ~/backup~
  # fi
  # if test -d ~/backup 또는 if [ -d ~/backup ]
  # then mkdir ~/backup
  # fi
  # for i in {1..4} 또는 for i in 1 2 3 4 또는 for i in $(seq 1 1 4) 또는 for i in (( i=1; i<=4; i++ ))
  # do
  # mkdir ~/backup/b0$i
  # done

```

