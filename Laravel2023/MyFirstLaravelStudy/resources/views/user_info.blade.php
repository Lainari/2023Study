<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>회원정보</title>
</head>
<body>
    @if (count($user) == 0)
        <h2>사용자를 찾을 수 없습니다.</h2>
    @else
        <h2>사용자 상세 정보</h2>
        <img src="/image/{{$user['name']}}.jpg" alt="his name?"> <br>
        이름 : {{$user['name']}} <br>
        이메일 : {{$user['email']}} <br>
        생년월일 : {{$user['birthDate']}} <br>
        소속 : {{$user['organization']}} <br>
        <form method='post' action="/users/{{$user['id']}}">
            @csrf
            @method('delete')
            <input type="submit" value="삭제">
        </form>
        <br>
        <a href="/users/{{$user['id']}}/edit">
            <input type="submit" value="수정"><br><br>
        </a>
        <button onclick="location.href='/users'">돌아가기</button>
    @endif
</body>
</html>