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
# 5. ls -h
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
touch file.txt
touch my_folder/file.txt
touch -t 202201011200 file.txt
touch -r file1.txt file2.txt
touch -d "yesterday" file.txt
#이 중, touch 명령어의 사용 방법과 결과를 묻는 문제이므로, 각 문제에서 touch 명령어를 사용한 결과물을 예측해보시면 됩니다.

6. 현재 내가 작업하는 폴더를 모른다는 가정하에 나의 홈 디렉토리에 abc 라는 이름의 빈 파일을 만들자고 한다

# 정답
# 1. file.txt 명을 가진 빈 파일 생성
# 2. 현재 디렉토리에 있는 my_folder 디렉토리 안에 file.txt 명을 가진 빈 파일 생성
# 3. file.txt 파일의 수정 시간을 2022년 1월 1일 12시 00분 으로 설정
# 4. file1.txt 파일의 타임스탬프를 기반으로 file2.txt 파일의 타임스탬프를 변경
# 5. 파일의 타임스탬프를 지정한 문자열에 따라 변경할 수 있는 옵션으로
# "yesterday"라는 문자열은 어제의 날짜를 내어서, file.txt 파일의 타임스탬프가 어제의 시간으로 변경
# 6. touch ~/abc
```

## 7) cp 명령어
```bash
1. 파일 file1.txt을 file2.txt로 복사
2. 파일 file1.txt을 /home/user/Documents/ 디렉토리로 복사
3. 디렉토리 my_folder를 /home/user/Documents/ 디렉토리에 복사
4. 디렉토리 my_folder를 /home/user/Documents/ 디렉토리에 복사하되, my_folder 이름을 my_folder_new로 변경하여 복사
5. 디렉토리 my_folder의 모든 내용을 /home/user/Documents/my_folder_new/ 디렉토리로 복사


# 정답
# 1. cp file1.txt file2.txt
# 2. cp file1.txt /home/user/Documents/file1.txt
# 3. cp my_folder -r /home/user/Documents/my_folder
# 4. cp my_folder -r /home/user/Documents/my_folder_new
# 5. cp my_folder -r /home/user/Documents/my_folder_new/
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
# 5. find . -type f -size +1M # 1MB 이상인 파일 이름 추출-> head -50 [1MB 이상 파일 이름] # 각 파일의 처음 50줄 출력

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
# 5. find . -type f -size +1M # 1MB 이상인 파일 이름 추출-> tail -50 [1MB 이상 파일 이름] # 각 파일의 마지막 50줄 출력
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