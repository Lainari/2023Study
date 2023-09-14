<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <center><h1>어서오세요</h1></center>
    <hr>
    <div>
        <a href="/users/create">회원가입</a>
    </div>
    <div>
        <a href="/users">회원리스트</a>
        <hr>
        @foreach ($users as $user)
            <h4>
                이름 : {{$user["name"]}}
            </h4>
            <h4>
                이메일 : {{$user["email"]}}
                <button onclick="location.href='/users/{{$user['id']}}'">더보기</button>
            </h4>
            <hr>
        @endforeach
    </div>
</body>
</html>