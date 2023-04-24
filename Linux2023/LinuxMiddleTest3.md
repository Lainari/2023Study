# 사용자 관리

## 사용자 전환
`su [username]`
- 아이디를 생략하면 관리자로 전환
  - 관리자의 경우 : 비밀번호 없이 전환
  - 그외 : 변경하고자 하는 아이디의 비밀번호를 입력
`exit` : su 이전의 아이디로 돌아온다
  - 중첩해서 su 를 할 수 있으며 중첩한 횟수만큼 exit로 돌아온다

```bash:사용자 전환
1. 관리자 계정으로 접속하려고 하고 root 로 접속하였는지 확인하는 명령어까지 작성하라
2. studentA 계정에 접속하려고 한다. 이때 사용하는 명령어는?

# 정답
# 1. su (접속 후) whoami (root 결과 확인)
# 2. su studentA
```

## 비밀번호 변경
`passwd [username]`
- 관리자가 초기화 할 때
  - user 지정
  - 최소 글자 지키지 않아도 초기화 가능
- 자신의 비밀번호를 입력할 때
  - `passwd` 만 입력
  - 현재 비밀번호 넣고 새 비밀번호 입력
  - 최소 글자 규칙 지켜야 함(5자 이상)

```bash:비밀번호 변경
1. 관리자로 접속한 뒤, studentA 의 비밀번호를 바꾸는 명령어를 작성하라
2. 현재 접속 중인 본인 계정의 비밀번호를 변경하는 명령어는?

# 정답
# 1. su (접속 후) passwd studentA
# 2. passwd
```

## 리눅스의 사용자
1. 관리자(root) 계정
- 모든 권한을 가진 특수한 계정

2. 시스템 계정
- 리눅스를 설치하거나 시스템 소프트웨어를 설치할 때 생성되는 계정
- 각 기능에 맞게 제한된 기능을 수행

3. 사용자 계정
- 실제 사용자를 위한 계정

## 사용자 정보 파일 /etc/passwd

### 전체 계정에 대한 리스트
> jinseok : x : 1000 : 1000 : jinseok : /home/jinseok : /bin/bash
`:` 로 각 파트별로 구분할 수 있다
1. user name : 로그인할 때의 아이디
2. password : 별도의 파일로 관리, x로 표기됨
3. user id(uid) : 로그인 아이디와 별도로 관리되는 숫자 아이디
4. group id(gid) : 그룹의 숫자 아이디
5. user full name : 사용자 실명 또는 연락처로 사용, 옵션 정보
6. home directory 주소
7. shell
  a. /bin/shell명 : 일반 사용자가 선택할 수 있는 shell 들
  b. /sbin/nologin : 쉘 로그인 불가능. 홈디렉토리 제공하지 않음
  c. /bin/false : 쉘 로그인 불가능, ftp 접근 불가능, shell, ssh 불가능 등 대부분 제약

```bash:사용자 정보 파일 /etc/passwd
1. 사용자 정보 파일의 절대 주소로 표현하면?
2. 다음 계정 정보를 보고 틀린 문항을 고른다면?
  - jinseok : x : 1000 : 1000 : jinseok : /home/jinseok : /bin/bash
  a. 해당 계정 유저 명은 'jinseok'이다.
  b. 해당 계정 유저의 비밀번호는 1000 로 표기되어 있다
  c. 해당 계정 유저의 uid와 gid는 각각 1000으로 지정되어 있다
  d. 해당 계정 유저의 홈 디렉터리는 /bin/bash 로 지정되어 있다
  e. 해당 계정 유저의 user full name 은 jinseok 이며, bash 쉘을 사용할 수 있다
3. 사용자 정보 파일 중 /sbin/nologin 과 /bin/false 의 공통점은?


# 정답
# 1. /etc/passwd
# 2. b, d
# 3. 쉘 로그인이 불가능하다는 점이다

```

## 비밀 번호 정보 파일 /etc/shadow
- 보안을 위해 ***root 계정만 내용을 볼 수 있음***
`username:$algorithm$salt$password::0:99999:7:::` ':'를 통해 역할을 구분한다
1. user name : 유저명
2. $algorithm
  a. $1  = MD5(사용금지)
  b. $2a = Blowfish
  c. $2y = Eksblowfish
  d. $5  = SHA-256
  e. $6  = SHA-512
3. $salt : 해시 함수에서 예측 불가능성을 높이기 위해 사용되는 임의의 문자열
4. $password
  a. *   : 비밀번호 없음. 로그인 불가
  b. !!  : 비밀번호 없음. 로그인 불가. 사용자가 생성만 하고 비밀번호를 할당하지 않아도 이 표시
  c. 빈칸 : 비밀번호가 없지만 로그인은 가능하다
5. :   = 마지막 비밀번호 변경 후 지난 날짜
6. :0  = 비밀 번호 변경 후 최소 사용일, 0이면 즉시 변경 가능
7. :99999 = 비밀번호 최대 사용 기간
8. :7 = 비밀 번호 만료 전 경고 일
9. : = 비활성화, 비밀번호가 만료 된 이후 비활성화 일. 이 기간내에 새로 설정해야함
10. : 계정 만료일, 만료되면 관리자가 비밀번호 초기화를 해주어야 사용가능

```bash:비밀 번호 정보 파일
1. 비밀 번호 정보 파일의 절대 주소 경로는?
2. 비밀 번호 정보 파일은 누구나 해당 내용을 볼 수 있다(O, X)
3. 다음 계정의 비밀번호 정보를 보고 틀린 문항을 고른다면?
  - `jinseok:$6$asdjBaj1491$sdfgklndasdk.a9::0:99999:7:::`
  a. username은 jinseok 이며 algorithm을 SHA-256을 사용하고 있다
  b. algorithm 이후에 salt 값과 password 가 정상적으로 기입되어 있다
  c. 만약 이 계정의 비밀번호를 변경하려면 99999일이 지나야 한다
  d. 비밀번호를 변경 후 99999일 동안 사용할 수 있고, 만료 7일 전에 경고 메시지가 온다
  e. 이 계정은 비밀번호가 만료된 이후 7일 된 계정이다
  f. 이 계정은 계정 만료일이 지난 상태다
4. 만일 비밀번호 란이 *, !!, 빈칸인 계정이 있을 때, 로그인 가능한 계정은?

# 정답
# 1. /etc/passwd
# 2. X, root 계정만 열람 가능
# 3. a(SHA-512 사용), c(즉시 변경가능), e(활성화 상태임), f(만료되지 않음)
# 4. 빈칸(!! 와 * 는 비번이 없고 로그인 불가능, 빈칸은 비번이 없어도 로그인 가능)

```

## 기본 설정 /etc/login.defs
- 로그인과 관련된 기본 설정 파일
1. 비밀번호 만료 및 길이에 대한 설정
  - PASS_MAX_DAYS : 비밀번호 사용 일수
  - PASS_MIN_DAYS : 비밀번호 변경 일수
  - PASS_MIN_LEN  : 최소 비밀번호 길이
  - PASS_WARN_AGE : 비밀번호 만료 경고 일

2. 시스템/사용자 아이디의 번호 설정
  - UID_MIN     : 사용자 아이디(uid)의 초기번호
  - UID_MAX     : 사용자 아이디(uid)의 최대번호
  - SYS_UID_MIN : 시스템 아이디의 초기번호
  - SYS_UID_MAX : 시스템 아이디의 최대번호

3. 시스템/사용자 그룹 아이디의 번호 설정
  - GID_MIN     : 사용자 그룹아이디(gid)의 초기번호
  - GID_MAX     : 사용자 그룹아이디(gid)의 최대번호
  - SYS_GID_MIN : 시스템 그룹아이디의 초기번호
  - SYS_GID_MAX : 시스템 그룹아이디의 최대번호

4. 비밀번호 암호화 알고리즘 설정
  - ENCRYPT_METHOD SHA512 : 알고리즘이 $6(SHA-512) 로 설정되어있음

```bash:기본 설정
1. 로그인과 관련된 기본 설정 파일의 절대경로는?
2. 로그인과 관련된 기본 설정 파일의 역할로 알맞지 않은 것은?
  a. 비밀번호 만료 및 길이에 대한 설정
  b. 시스템/사용자 아이디의 번호 설정
  c. 시스템/사용자 그룹명의 설정
  d. 비밀번호 암호화 알고리즘 설정

# 정답
# 1. /etc/login.defs
# 2. c (그룹 아이디 번호 설정을 담당)

```

## 그룹 정보 파일 /etc/group
- 시스템에 등록된 그룹 정보
- 리눅스에서 사용자는 ***반드시 1개 이상의 그룹에 소속되어야 한다***
  - 그룹이 명시되지 않으면, 사용자 아이디와 같은 이름의 그룹을 만들고 그 그룹에 등록된다
  - 따라서 설치 아이디는 해당 아이디와 같은 이름의 그룹에 속해있다
`group name : password : group number : group member`
1. group name : 그룹명
2. password : 그룹 비밀번호
  - gpasswd groupname 으로 설정, /etc/gshadow에 저장
3. group number : 그룹 번호
4. group member : 그룹 맴버
  - 이 그룹을 **부그룹**으로 사용하는 맴버명

```bash:그룹 정보 파일
1. 리눅스에서 시스템에 등록된 그룹 정보가 담긴 파일의 절대 주소는?
2. 리눅스에서 사용자는 1개 이상의 그룹에 소속되거나, 소속되지 않아도 된다(O, X)
3. 만약 그룹을 명시하지 않은채로 계정을 생성하면 해당 계정명과 같은 이름으로 그룹을 생성하고 그 그룹에 자동으로 속한다(O, X)
4. 다음 계정의 그룹 정보를 보고 틀린 문항을 고른다면?
  - `jinseok:x:1000:jinseok`
  a. 그룹명은 jinseok 이고, 비밀번호는 1000 이다
  b. 그룹번호는 1000 을 갖고 있으며 그룹 맴버로서 jinseok 이 있다


# 정답
# 1. /etc/group
# 2. X (무조건 1개 이상 소속되어야 한다)
# 3. O
# 4. a (비밀번호는 x로 감춰져있다)

```

# ⚠ 그룹, 사용자 관리(추가, 수정, 삭제)

## 그룹 관리
> 많은 사용자를 만들 때는 **그룹을 먼저 만들고,** 사용자를 이후에 추가해준다!

`groupadd [option] groupname`
- groupname 인 그룹을 추가한다
- `-g gid` 옵션을 통해 해당 그룹에게 그룹 아이디(숫자)를 지정해준다.
  - 이때 유일한 값을 사용해야 한다

`groupmod [option] groupname`
- groupname 인 그룹 정보를 수정하는 명령어
- `-n name` 옵션으로 그룹 이름을 name 으로 변경한다
- `-g gid`  옵션으로 그룹 아이디를 gid 로 변경한다

`groupdel groupname`
- groupname 인 그룹을 삭제한다
  - 해당 그룹에 소속된 사용자나 파일이 있을 경우 삭제 불가능!

`gpasswd [option] groupname`
- 그룹의 비밀번호를 설정한다
  - 그룹의 비밀번호는 /etc/gshadow 파일에 저장된다
- `-r`          옵션으로 그룹의 암호를 삭제한다
- `-a username` 옵션으로 username인 사용자를 그룹에 추가한다
- `-d username` 옵션으로 username인 사용자를 그룹에서 삭제한다

```bash:그룹 관리
1. 많은 사용자를 만들 때는 사용자를 먼저 만들고 그룹을 만드는 것이 바람직하다(O, X)
2. Student 그룹을 생성하고, 이 그룹의 그룹 아이디를 1020번으로 지정하는 명령어를 작성하라
3. Student 그룹의 이름을 korStudent로 변경하고 이 그룹의 그룹아이디를 1001 번으로 변경하라
4. korStudent 그룹에 studentA 만 포함 되어있는 상황에서 studentA를 jpStudent 그룹에 추가하고 korStudent 그룹을 삭제하라
5. jpStudent 그룹의 비밀번호를 삭제하라

# 정답
# 1. X(그룹을 먼저 만들고 유저를 추가해주는게 바람직함!)
# 2. groupadd -g 1020 Student
# 3. groupmod -n korStudent -g 1001 Student
# 4. gpasswd -a studentA jpStudent (추가 후) groupdel korStudent
# 5. gpasswd -r jpStudent

```

## 사용자 추가
`useradd [option] username`
`-d home`      옵션으로 홈 디렉토리를 home으로 지정한다
  - 최상위 폴더에는 만들 수 없으며 생략할 경우 /home/username 으로 생성
`-g groupname` 옵션으로 주 그룹이 지정된다. 생략할 경우는 아래를 따른다
  - /etc/login.defs의 USERGROUPS_ENAB=yes 인 경우, username과 같은 이름을 생성하여 사용
  - 위 옵션이 허용되지 않을 경우 아니면 /etc/default/useradd 의 GROUP 사용
`-G groupname` 옵션으로 부 그룹이 지정된다
  - , 로 구분하여 여러 그룹을 지정한다(예 : -G A, B, C)
`-s shell`     옵션으로 기본 쉘을 지정한다
  - 생략할 경우 시스템 /etc/default/useradd 의 SHELL 을 사용한다
`-u uid`       옵션으로 사용자 번호를 지정한다
  - /etc/login.defs의 UID_MIN 보다 크고 UID_MAX 보다 작은 유일한 값이야만 함
`-c content`   옵션으로 full name 자리에 들어갈 내용을 지정한다


- 각 옵션을 생략할 경우 /etc/default/useradd 에 정의된 값을 사용함
> /etc/default/useradd
  1. GROUP : 그룹 생성이 허용되지 않는데 그룹이 미지정된 경우의 기본 그룹
  2. HOME  : 홈 디렉토리 지정. 이 디렉토리 하위에 username으로 생성된다
  3. INACTIVE : 비밀번호 만료 후 로그인을 막는 기간
    - -1:미설정, 0:없음
  4. EXPIRE : 계정 유효기간(YYYY-MM-DD)
  5. SHELL : 기본 쉘
  6. SKEL : 사용자 추가할 때 홈 디렉토리에 추가되는 기본파일들
  7. CREATE_MAIL_SPOOL : 사용자 추가할 때 메일 파일을 생성 여부

```bash:사용자 추가
1. studentA 사용자를 추가하되, 해당 유저의 홈 디렉토리를 /home/example로 설정하라
2. studentB 사용자를 추가하되, 해당 유저의 주 그룹을 B, 부 그룹을 A로 설정하라
3. studentC 사용자를 추가하되, 해당 유저의 사용자 번호를 1000 으로 설정하라
4. studentD 사용자를 추가하되, 해당 유저의 사용 쉘을 bash, full name을 Cstudent로 지정하라
5. 만일 사용자를 추가할 때 옵션을 생략할 경우, (   ) 에 정의된 값을 사용한다

# 정답
# 1. useradd -d /home/example studentA
# 2. useradd -g B -G A studentB
# 3. useradd -u 1000 studentC
# 4. useradd -s bash -c Cstudent
# 5. /etc/default/useradd

```

## 사용자 수정
> 변경 시 꼭 주의해야할 것!!
`usermod [option] username`
`-l newname` 옵션으로 newname 으로 아이디를 변경한다
  - 단, 아이디만 변경될 뿐 홈 디렉토리가 바뀌지 않는 것을 주의한다!
`-d home`    옵션으로 home 으로 홈 디렉토리를 변경한다
  - 단, /etc/passwd 파일만 수정하므로 없는 폴더를 만들지 않는다!
`-m`         옵션으로 홈 디렉토리 변경 시 폴더를 만들고 기존 파일 및 디렉토리 내용을 이동한다
  - -d 옵션이 있을 때만 사용가능하므로 주의할 것
`-g groupname` 옵션으로 사용자를 groupname 인 그룹으로 변경한다
`-G groupname+` 옵션으로 사용자에게 grouname인 2차 그룹을 지정한다
`-a groupname+` 옵션으로 사용자에게 grouname인 2차 그룹을 추가한다
`-s shell`      옵션으로 사용자의 기본 쉘을 지정한다
`-u uid`        옵션으로 사용자 번호를 uid로 지정한다
  - /etc/login.defs의 UID_MIN 보다 크고 UID_MAX 보다 작은 유일한 값임
`-c content`    옵션으로 full name 자리에 들어갈 내용을 지정한다

- 각 옵션을 생략할 경우 /etc/default/useradd 에 정의된 값을 사용함

```bash:사용자 수정
1. student 유저의 아이디를 studentA로 변경하라 
2. studentA 유저의 홈 디렉토리를 /home/studentA로 폴더를 만들면서 변경하라
3. studentA 유저의 주 그룹을 A, 부 그룹을 B로 변경하라
4. studentA 유저의 부 그룹에 C를 추가하라
5. studentA 유저의 사용자 번호를 1000 으로 설정하라
6. studentA 유저의 사용 쉘을 bash, full name을 Astudent로 변경하라
7. 만일 사용자를 수정할 때 옵션을 생략할 경우, (   ) 에 정의된 값을 사용한다

# 정답
# 1. usermod -l studentA student
# 2. usermod -d /home/studentA -m studentA
# 3. usermod -g A -G B studentA
# 4. usermod -a C studentA
# 5. usermod -u 1000
# 6. usermod -s bash -c Astudent
# 7. /etc/default/useradd

```

## 사용자의 소속 그룹 확인
`id [username]`
- 사용자의 uid, gid, 그룹 리스트를 확인하고 username 생략시 현재 사용자 정보 확인
`groups [username]`
- 사용자의 그룹 리스트를 확인하고 username 생략시 현재 사용자의 그룹 리스트 확인
```bash:사용자의 소속 그룹 확인
1. studentA의 uid, gid, 그룹 리스트를 확인하는 명령어를 작성하시오
2. 현재 로그인된 사용자의 그룹 리스트를 확인하는 명령어를 작성하시오

# 정답
# 1. id studentA
# 2. groups

```

## 사용자 삭제
`userdel [option] username`
- username 인 사용자를 삭제하는 명령어로, 계정만 삭제하므로 주의한다
`-r` 옵션으로 계정 및 홈 디렉토리, 메일 파일까지 삭제한다
  - /etc/login.defs 설정에 따라 사용자의 홈 디렉토리 및 메일 스플릿을 찾는다
`-f` 옵션으로 사용자가 로그인 상태라도 강제 삭제한다

```bash:사용자 삭제
1. studentA 가 로그인 된 상태라도 해당 유저 계정을 삭제하되 홈 디렉토리, 메일 파일까지 삭제하는 명령어를 작성하시오

# 정답
# 1. userdel -rf studentA

```

## 세션의 그룹 바꾸기
`newgrp groupname`
- 자신이 속한 보조 그룹으로 시스템에 접근하는 명령어
  - 일반적으로 사용자가 로그인을 하면 주그룹(/etc/passwd 에 적힌 그룹)으로 처리되기 때문
- 해당 그룹으로 세션을 만듬
- 자신이 속하지 않은 그룹으로 변경하고, 그 그룹이 비밀번호가 설정된 경우?
  - 비밀번호를 입력하여 해당 그룹으로 변경해야 한다

```bash:세션의 그룹 바꾸기
1. studentA 는 B 라는 보조그룹에 속해있지만 C 라는 보조그룹에는 속해있지 않다. 이때 studentA 계정에서 B 보조그룹으로 세션을 만드는 과정과 C 라는 다른 보조 그룹으로 이동할 때 다른점을 서술하시오

# 정답
# 1. B 보조그룹으로 세션을 만드는 과정에서는 newgrp B 로 바로 이동하면 되지만, C 라는 다른 보조 그룹으로 이동할 때는 해당 C 그룹이 비밀번호가 설정된 경우에는 C 그룹의 비밀번호를 입력해야지만 해당 그룹의 세션으로 넘어가게 됩니다.

```

## 사용자 관련 환경 설정 파일 요약

### 정보 파일
- /etc/passwd  : 전체 계정 정보
- /etc/shadow  : 비밀 번호 및 정책
- /etc/group   : 그룹 리스트
- /etc/gshadow : 그룹 비밀번호

### 설정 파일
- /etc/default/useradd : 새 사용자를 만드는 기본 설정
- /etc/login.defs      : 로그인 관련 기본 설정
- /etc/skel            : 홈 디렉토리 생성에 사용할 기본 파일들

```bash:사용자 관련 환경 설정 파일
1. 다음 정보 파일 중 파일명과 설명이 일치하지 않는것은?
  a. /etc/passwd : 현재 로그인 계정 정보
  b. /etc/shadow : 비밀 번호 및 정책
  c. /etc/group  : 그룹 리스트
  d. /etc/gshadow : 그룹 비밀번호

2. 다음 설정 파일 중 파일명과 설명이 일치하지 않는것은?
  a. /etc/default/usermod : 새 사용자를 만드는 기본 설정
  b. /etc/login.defs : 로그인 관련 기본 설정
  c. /etc/skel : 홈 디렉토리 생성에 사용할 기본 파일들

# 정답
# 1. a(현재 뿐만 아닌 전체 계정 정보를 담고있음)
# 2. a(/etc/default/useradd 파일임)

```

## 실습
> student 라는 그룹을 만들고 해당 그룹에 학생 s12345를 추가해보자
```bash:1번 예제

# 정답
# groupadd student
# useradd -g student s12345
```

> 학생 s12345에게 비밀번호를 설정하여 로그인이 가능하게 만들자
```bash:2번 예제

# 정답
# passwd s12345
```

> 그룹 firstGrade를 만들고 해당 그룹에 학생 s12345를 보조 그룹으로 추가해보자
```bash:3번 예제

# 정답
# groupadd firstGrade
# usermod -G firstGrade s12345
```

> 이름을 A, B, C로 하는 그룹 3개를 추가한다. gid는 자동으로 설정되도록 한다
```bash:4번 예제

# 정답
# groupadd A
# groupadd B
# groupadd C
```

> C 그룹은 비밀번호를 추가한다
```bash:5번 예제

# 정답
# gpasswd C
```

> 다음과 같이 사용자를 추가하라
```bash:6번 예제
username : test_a, group:A
username : testB,  group:B, subgroup:C
username : testC,  group:C

# 정답
# useradd -g A test_a
# useradd -g B -G C testB
# useradd -g C testC

```

> 새로 추가된 사용자들은 각각 username과 같은 비밀번호로 초기화 하라
```bash:7번 예제

# 정답
# passwd test_a
# passwd testB
# passwd testC
```

> test_a 아이디를 testA로 변경하고, 홈폴더도 testA로 변경하라
```bash:8번 예제

# 정답
# usermod -l testA test_a
# usermod -m -d /home/testA testA
```

> testB로 사용자 변경 후 현재 그룹을 C로 변경하라
```bash:9번 예제

# 정답
# su testB
# newgrp C
```

> testA로 사용자 변경 후 현재 그룹을 C로 변경
```bash:10번 예제

# 정답
# su testA
# newgrp C
# 비밀번호 입력
```

> testA, testB, testC 계정을 모두 삭제하라. 단, 각 계정의 홈 폴더까지 모두 삭제되어야 한다
```bash:11번 예제

# 정답
# userdel -r testA
# userdel -r testB
# userdel -r testC
```

> 그룹 A, B, C 모두 삭제하라
```bash:12번 예제

# 정답
# groupdel A
# groupdel B
# groupdel C
```