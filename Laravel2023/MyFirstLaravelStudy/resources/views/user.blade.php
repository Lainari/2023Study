<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>{{$name}}</title>
</head>
<body>
    <img src="/image/{{$name}}.jpg" alt="his name?"> <br>
    이름 : {{$name}} <br>
    {{-- 이메일 : {{$email}} <br>
    생년월일 : {{$birthDate}} <br>
    조직 : {{$organization}} --}}
    <button onclick="location.href='/users'">돌아가기</button>
</body>
</html>