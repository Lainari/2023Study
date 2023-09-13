<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Register</title>
</head>
<body>
    <form action="/update" method="get">
        <h1>축하합니다~ 회원으로 등록되었습니다!</h1>
        <h2>{{$name}}님의 등록정보는 아래와 같습니다</h2>
        <input type="hidden" name="name" value="{{$name}}">
        <h3>이메일 : {{$email}}</h3>
        <h3>생년월일 : {{$birthDate}}</h3>
        <input type="hidden" name="birthDate" value="{{$birthDate}}">
        <h3>소속 : {{$organization}}</h3>
        <button>수정</button>
    </form>
</body>
</html>