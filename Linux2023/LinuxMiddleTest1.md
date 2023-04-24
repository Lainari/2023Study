# 서버시스템 구축 - 리눅스(Linux)

# 기본명령어
- 명령어에 관한 실습은 VM Virtual Box 의 터미널에서 결과를 확인할 수 있습니다

## 1) cd 명령어
```bash
1. 현재 작업 디렉토리가 /home/user/Documents 일 때, cd 명령어를 사용하여 /home/user/Downloads 로 이동하는 방법은 무엇인가요?
2. cd 명령어를 사용하여 상위 디렉토리로 이동하는 방법은 무엇인가요?
3. 현재 작업 디렉토리가 /home/user/Documents 일 때, cd 명령어를 사용하여 상위 디렉토리에서 /home/user/Downloads 로 이동하는 방법은 무엇인가요?
4. cd 명령어를 사용하여 절대 경로로 /home/user/Downloads 로 이동하는 방법은 무엇인가요?
5. 상대 경로로 cd 명령어를 사용하여 /home/user/Documents/Test 디렉토리로 이동하는 방법은 무엇인가요?

# 정답
#1. cd ../Downloads
#2. cd ..
#3. cd ../Downloads
#4. cd /home/user/Downloads
#5. cd Test
```

## 2) ls 명령어
```bash
1. ls 명령어를 사용하여 현재 작업 디렉토리에 있는 모든 파일과 디렉토리를 나열하는 방법은 무엇인가요?
2. ls 명령어를 사용하여 현재 작업 디렉토리에 있는 숨김 파일들을 포함하여 모든 파일과 디렉토리를 나열하는 방법은 무엇인가요?
3. ls 명령어를 사용하여 파일과 디렉토리를 사람이 읽기 쉬운 형식으로 나열하는 방법은 무엇인가요?
4. ls 명령어를 사용하여 현재 작업 디렉토리의 파일과 디렉토리를 수정된 날짜와 함께 나열하는 방법은 무엇인가요?
5. ls 명령어를 사용하여 현재 작업 디렉토리의 파일과 디렉토리를 크기 순으로 나열하는 방법은 무엇인가요?
6. 현재 폴더에 파일 리스트를 출력하고자 한다. 파일 이름의 첫글자가 . 인 파일까지 모두 보려면 다음 명령어의 괄포 부분에 어떤 옵션을 적어야 하는가?


# 정답
# 1. ls -l
# 2. ls -a
# 3. ls
# 4. ls -l 
# 5. ls -S
# 6. ls -a
```

## 3) mkdir 명령어 : 단독으로 사용 불가능
```bash
1. mkdir 명령어를 사용하여 "my_folder" 라는 이름의 새로운 디렉토리를 현재 작업 디렉토리에 생성하는 방법은 무엇인가요?
2. mkdir 명령어를 사용하여 "my_folder" 라는 이름의 디렉토리를 현재 작업 디렉토리에 생성하고, 그 안에 "my_subfolder" 라는 이름의 서브 디렉토리를 생성하는 방법은 무엇인가요?
3. mkdir 명령어를 사용하여 "my_folder" 라는 이름의 디렉토리를 현재 작업 디렉토리에 생성하고, 그 안에 "my_subfolder" 라는 이름의 서브 디렉토리를 생성하며, 그 안에 "my_subsubfolder" 라는 이름의 서브 디렉토리를 생성하는 방법은 무엇인가요?
4. mkdir 명령어를 사용하여 "my_folder" 라는 이름의 디렉토리를 /home/user/Documents 경로에 생성하는 방법은 무엇인가요?
5. mkdir 명령어를 사용하여 "my_folder" 라는 이름의 디렉토리를 /home/user/Documents 경로에 생성하고, 그 안에 "my_subfolder" 라는 이름의 서브 디렉토리를 생성하는 방법은 무엇인가요?


# 정답
# 1. mkdir my_folder
# 2. mkdir -p my_folder/my_subfolder
# 3. mkdir -p my_folder/my_subfolder/my_subsubfolder
# 4. mkdir /home/user/Documents/my_folder
# 5. mkdir -p /home/user/Documents/my_folder/my_subfolder
```

## 4) rmdir 명령어 : 단독으로 사용 불가능
```bash
1. rmdir 명령어를 사용하여 "my_folder" 라는 이름의 빈 디렉토리를 삭제하는 방법은 무엇인가요?

2. rmdir 명령어를 사용하여 "my_folder" 라는 이름의 비어 있지 않은 디렉토리를 삭제하는 방법은 무엇인가요?

3. rmdir 명령어를 사용하여 "/home/user/Documents/my_folder" 경로에 있는 디렉토리를 삭제하는 방법은 무엇인가요?

4. rmdir 명령어를 사용하여 "/home/user/Documents/my_folder" 경로에 있는 디렉토리와 그 안에 있는 모든 파일과 서브 디렉토리를 삭제하는 방법은 무엇인가요?


# 정답
# 1. rmdir my_folder
# 2. rm -r my_folder
# 3. rmdir /home/user/Documents/my_folder
# 4. rm -r /home/user/Documents/my_folder
```

## 5) rm 명령어 : 단독으로 사용 불가능
```bash
1. rm 명령어를 사용하여 "file.txt" 라는 이름의 파일을 삭제하는 방법은 무엇인가요?
2. rm 명령어를 사용하여 디렉토리를 삭제하는 방법은 무엇인가요?
3. rm 명령어를 사용하여 삭제할 파일의 이름이 "-rf" 일 때, 이를 올바르게 삭제하는 방법은 무엇인가요?
4. rm 명령어를 사용하여 삭제할 파일의 이름이 공백을 포함할 때(my file.txt), 이를 올바르게 삭제하는 방법은 무엇인가요?
5. rm 명령어를 사용하여 삭제할 파일의 이름이 변수로 지정된 경우, 이를 올바르게 삭제하는 방법은 무엇인가요?

# 정답
# 1. rm file.txt
# 2. rm -r
# 3. rm -- -rf
# 4. rm my\file.txt 또는 rm "my file.txt"
# 5. rm -rf
```

## 6) touch 명령어 : 단독으로 사용 불가능
- touch 는 또한 소유권을 가진 파일이라면 해당 파일이 실행권한이 없어도 touch로 시간을 수정할 수 있다
```bash
1. touch file.txt
2. touch -i my_folder/file.txt
3. touch -t 202201011200 file.txt
4. touch -a file1.txt
5. touch -f file.txt
#이 중, touch 명령어의 사용 방법과 결과를 묻는 문제이므로, 각 문제에서 touch 명령어를 사용한 결과물을 예측해보시면 됩니다.

6. 현재 내가 작업하는 폴더를 모른다는 가정하에 나의 홈 디렉토리에 abc 라는 이름의 빈 파일을 만들자고 한다

# 정답
# 1. file.txt 명을 가진 빈 파일 생성
# 2. 현재 디렉토리에 있는 my_folder 디렉토리 안에 file.txt 명을 가진 파일을 삭제할 때 삭제 여부를 묻는다
# 3. file.txt 파일의 수정 시간을 2022년 1월 1일 12시 00분 으로 설정
# 4. 현재 시간을 기반으로 file1.txt 파일의 타임스탬프를 변경
# 5. file.txt 를 강제삭제하며 메시지를 보여주지 않는다
# 6. touch ~/abc
```

## 7) cp 명령어
```bash
1. 파일 file1.txt을 file2.txt로 복사
2. 파일 file1.txt을 /home/user/Documents/ 디렉토리로 복사
3. 디렉토리 my_folder를 /home/user/Documents/ 디렉토리에 복사
4. 디렉토리 my_folder를 /home/user/Documents/ 디렉토리에 복사하되, my_folder 이름을 my_folder_new로 변경하여 복사
5. 디렉토리 my_folder의 모든 내용을 /home/user/Documents/my_folder_new/ 디렉토리로 복사
6. 파일 file1.txt을 file2.txt로 복사하되, 동일한 이름이 있을 경우 경고 메시지 표출


# 정답
# 1. cp file1.txt file2.txt
# 2. cp file1.txt /home/user/Documents/file1.txt
# 3. cp my_folder -r /home/user/Documents/my_folder
# 4. cp my_folder -r /home/user/Documents/my_folder_new
# 5. cp my_folder -r /home/user/Documents/my_folder_new/
# 6. cp -i file1.txt file2.txt
```

## 8) mv 명령어
```bash
1. file1.txt 파일의 이름을 file2.txt로 변경
2. 현재 디렉토리에 있는 my_folder 디렉토리를 /home/user/Documents/ 로 이동
3. /home/user/Downloads/my_file.txt 파일을 /home/user/Documents/ 로 이동
4. /home/user/Documents/my_folder 디렉토리의 이름을 /home/user/Documents/your_folder 로 변경
5. /home/user/Documents/my_folder 디렉토리를 /home/user/Pictures/ 로 이동
6. 현재 디렉토리에는 backups 라는 폴더가 있다. 이 폴더의 이름을 backups_old로 변경하라


# 정답
# 1. mv file1.txt file2.txt
# 2. mv my_folder /home/user/Documents/my_folder
# 3. mv /home/user/Downloads/my_file.txt /home/user/Documents/my_file.txt
# 4. mv /home/user/Documents/my_folder /home/user/Documents/your_folder
# 5. mv /home/user/Documents/my_folder /home/user/Pictures/my_folder
# 6. mv backups backups_old
```

## 9) cat 명령어
```bash
1. file.txt 파일의 내용을 출력하는 명령어를 작성하세요.
2. file1.txt와 file2.txt 파일의 내용을 병합하여 result.txt 파일을 생성하는 명령어를 작성하세요.
3. 현재 디렉토리에 있는 파일들 중에 "apple" 이라는 단어가 포함된 텍스트 파일의 내용을 출력하는 명령어를 작성해보세요.
4. 현재 디렉토리에 있는 모든 텍스트 파일의 내용을 터미널에서 한 번에 볼 수 있도록 출력하는 명령어를 작성해보세요.
5. 현재 디렉토리에 있는 file.txt 파일의 내용 중에서 "hello"라는 문자열을 포함한 라인들만 출력하는 리눅스 명령어를 작성하세요.

# 정답
# 1. cat file.txt
# 2. cat file1.txt file2.txt > result.txt
# 3. grep "apple" *.txt | cat
# 4. cat *.txt
# 5. cat file.txt | grep "hello"
```

## 10) head 와 tail 명령어
```bash
#head 명령어:

1. 현재 디렉토리에 있는 파일 중에서 가장 첫 번째로 등장하는 10줄을 출력하는 명령어를 작성하세요.
2. 현재 디렉토리에 있는 텍스트 파일의 첫 5줄을 출력하는 명령어를 작성하세요.
3. 특정 파일의 처음 20줄을 출력하는 명령어를 작성하세요.
4. 현재 디렉토리에 있는 파일 중에서 최신 5개 파일의 처음 15줄을 출력하는 명령어를 작성하세요.
5. 현재 디렉토리에 있는 파일 중에서 크기가 1MB 이상인 파일들 중에서 처음 50줄을 출력하는 명령어를 작성하세요.

# 정답
# 1. head file.txt
# 2. head -5 file.txt
# 3. head -20 file.txt
# 4. ls -t | head -5 # 최신 5개 파일 이름 추출 -> head -15 [5개 파일 이름] # 각 파일의 처음 15줄 출력
# 5. find . -type f -size +1M # 1MB 이상인 파일 이름 추출
# 이후에 head -50 [1MB 이상 파일 이름] # 각 파일의 처음 50줄 출력

#tail 명령어:
1. 현재 디렉토리에 있는 파일 중에서 가장 마지막으로 등장하는 10줄을 출력하는 명령어를 작성하세요.
2. 현재 디렉토리에 있는 텍스트 파일의 마지막 5줄을 출력하는 명령어를 작성하세요.
3. 특정 파일의 마지막 20줄을 출력하는 명령어를 작성하세요.
4. 현재 디렉토리에 있는 파일 중에서 최신 5개 파일의 마지막 15줄을 출력하는 명령어를 작성하세요.
5. 현재 디렉토리에 있는 파일 중에서 크기가 1MB 이상인 파일들 중에서 마지막 50줄을 출력하는 명령어를 작성하세요.

# 정답
# 1. tail file.txt
# 2. tail -5 file.txt
# 3. tail -20 file.txt
# 4. ls -t | head -5 # 최신 5개 파일 이름 추출 -> tail -15 [5개 파일 이름] # 각 파일의 마지막 15줄 출력
# 5. find . -type f -size +1M # 1MB 이상인 파일 이름 추출
# 이후에 tail -50 [1MB 이상 파일 이름] # 각 파일의 마지막 50줄 출력
```

## 11) more 과 file 명령어
```bash
more 문제:
1. 현재 디렉토리에 있는 파일 중에서 "hello"라는 문자열이 포함된 첫 번째 텍스트 파일을 more 명령어를 사용하여 출력하는 명령어를 작성하세요.
2. 현재 디렉토리에 있는 모든 텍스트 파일을 more 명령어를 사용하여 출력하는 명령어를 작성하세요.

# 정답
# 1. grep "hello" *.txt | ls -t | head -1 | more
# 2. more *.txt

file 문제:
1. file 명령어를 사용하여 현재 디렉토리에 있는 파일들 중에서 텍스트 파일과 바이너리 파일을 구분하여 출력하는 명령어를 작성하세요.
2. file 명령어를 사용하여 특정 파일의 형식을 확인하는 명령어를 작성하세요. (예: "file example.txt"를 실행했을 때, "example.txt: ASCII text" 라는 출력이 나오는 것과 같이)

# 정답
# 1. file *
# 2. file -i example.txt
```

## 12) help, whatis, man, info 명령어
```bash
리눅스에서 사용할 수 있는 명령어들에 대한 설명서와 같은 역할을 하는 명령어 4가지를 작성하시오

# 정답
# help, whatis, man, info
```

## 13) find 명령어 : !!!find 명령어는 주소를 반환한다!!!
```bash
1. 현재 디렉토리에서 파일 크기가 100K인 파일을 찾아 출력하는 명령어를 작성하세요.
2. 현재 디렉토리에서 디렉토리를 찾아 출력하는 명령어를 작성하세요.
3. 현재 디렉토리에서 이름이 "hello"로 시작하는 파일을 찾아 출력하는 명령어를 작성하세요.
4. 현재 디렉토리에서 이름이 "world"로 끝나는 디렉토리를 찾아 출력하는 명령어를 작성하세요.
5. 현재 디렉토리에서 이름이 "log"로 끝나는 파일 중에서 크기가 0인 파일을 찾아 출력하는 명령어를 작성하세요.
6. 내 홈디렉토리 및 모든 서브 디렉토리를 대상으로 이름이 abc 인 파일 또는 디렉토리를 모두 찾아라

# 정답
# 1. find . -size 100K
# 2. find . -type d
# 3. find . -name "hello*" -type f
# 4. find . -name "*world* -type d
# 5. find . -name "*log* -size 0 -type f
# 6. find ~ -name "abc"
```


## 14) grep 명령어
```bash
1. 현재 디렉토리에서 "apple" 이라는 단어가 포함된 파일을 찾아서 해당 단어가 포함된 모든 라인을 출력하는 명령어를 작성하세요.
2. 현재 디렉토리에서 "banana" 이라는 단어가 포함된 파일을 찾아서 해당 단어가 포함된 모든 라인을 제외하고 출력하는 명령어를 작성하세요.
3. 현재 디렉토리에서 "*.txt" 파일에서 "orange" 이라는 단어가 포함된 라인의 개수를 출력하는 명령어를 작성하세요.
4. 현재 디렉토리에서 "*.md" 파일에서 "grape" 이라는 단어가 포함된 라인을 출력하는데, 대소문자 구분을 하지 않는 명령어를 작성하세요.
5. 현재 디렉토리에서 "kiwi" 또는 "melon" 이라는 단어가 포함된 파일을 찾아서 해당 파일에서 해당 단어가 포함된 라인을 출력하는 명령어를 작성하세요.

# 정답
# 1. grep -i -n "apple"
# 2. grep -v -w "banana"
# 3. grep -c "orange" *.txt
# 4. grep -i "grape" *.md
# 5. grep -f "kiwi\|melon"
```


## 15) Command Sequence, Command group, Conditional Command Sequence
```bash
해당 명렁어들의 결과를 서술하시오.
1. pwd; ls
2. { mkdir a; touch a/b }
3. ls a && pwd
4. ls a || ls

# 정답
# 1. pwd 명령어를 실행하고 ls 명령어를 실행한다. 앞 명령어가 실패해도 뒤 명령어는 진행
# 2. a 라는 빈 디렉토리를 생성한 다음 a 디렉토리 안에 b 라는 빈 파일을 만든다
# 3. a 파일에 대한 ls 명령어를 실행하고 정상적으로 실행되면 이후의 pwd 명령어를 진행한다
# 4. a 파일에 대한 ls 명령어를 실행에 실패한 경우에만 뒤의 명령어를 실행한다
```

## 16) pipe 명령어
```bash
1. 현재 디렉토리에서 파일명이 "log"로 끝나는 파일 중에서 가장 최근에 수정된 3개의 파일의 이름을 출력하는 명령어를 작성하세요.
2. /etc/passwd 파일 중에서 user 가 포함된 행을 모두 찾아 터미널에 출력하라
3. 현재 디렉토리에서 확장명이 .txt 인 파일을 찾아라

# 정답
# 1. ls -t *log | head -3
# 2. cat /etc/passwd | grep "user"
# 3. ls | grep .txt
```

## 17) Redirection 명령어
```bash
1. "example.txt" 파일의 내용을 출력하여 "output.txt" 파일에 저장하시오.
2. "input.txt" 파일의 내용 중 "apple"이라는 단어를 포함한 라인을 "output.txt" 파일에 추가하시오.
3. "input.txt" 파일의 내용 중 "banana"라는 단어를 포함하지 않은 라인을 "output.txt" 파일에 추가하시오.
4. "input.txt" 파일의 내용 중 "orange"라는 단어를 포함한 라인의 갯수를 "output.txt" 파일에 저장하시오.
5. 현재 폴더의 ls 결과를 터미널에 출력하지 말고 현재 폴더에 ls.txt 파일로 저장해라
   만약 ls.txt에 기존 내용이 있다면 모두 삭제하고 덮어쓰도록 작성한다.

# 정답
# 1. cat "example.txt" > output.txt
# 2. grep -n "apple" input.txt > output.txt
# 3. grep -v -n "banana" input.txt > output.txt
# 4. grep -c "orange" input.txt > output.txt
# 5. ls > ls.txt
```

## 18) 기초명령어 종합세트문제
```bash
다음과 같은 폴더에서 실패하지 않는 명령어는?
단, 현재 나는 user 그룹의 user 사용자로 로그인 된 상태이다

drwxr-xr-x 2 user user 64 3 25 19:25 backups
drwxr-xr-x 2 user user 64 3 25 19:25 files
-rw-r--r-- 1 user user 35 3 25 19:25 log
drwxr-xr-x 2 user user 64 3 25 19:25 test
-rw-r--r-- 1 user user 0 3 25 19:25 users

1. mkdir backups
2. cd works
3. touch log
4. cat files

# 정답 : 3번
# 이유
# 1번 : 이미 같은 이름의 디렉토리가 있으므로 생성 불가능
# 2번 : 해당 디렉토리에 works 디렉토리가 없으므로 이동 불가능
# 4번 : cat files 실행 시 'files는 디렉토리입니다' 문구가 나오더라도 이는 실패를 뜻함
# 왜냐하면 cat 은 [파일]의 내용을 표현하는 것이지 [디렉토리]의 경우는 아무것도 실행되지 않기 때문


1. 현재 디렉토리에서 ".txt" 확장자를 가진 파일 중에서 가장 최근에 수정된 3개의 파일의 이름을 출력하세요.
2. 현재 디렉토리에서 ".txt" 확장자를 가진 파일 중에서 "hello"라는 문자열이 포함된 파일의 내용을 출력하는 명령어를 작성하세요.
3. 현재 디렉토리에서 파일명이 "log"로 끝나는 파일 중에서 가장 최근에 수정된 3개의 파일의 이름을 출력하는 명령어를 작성하세요.
4. 현재 디렉토리에 "mydir"이라는 디렉토리를 생성하세요.
5. 현재 디렉토리에서 "mydir"이라는 디렉토리를 삭제하세요.

# 정답
# 1. ls -t | grep .txt | head -3
# 2. grep "hello" *.txt | cat
# 3. ls -t | grep log | head -3
# 4. mkdir mydir
# 5. rmdir mydir
```