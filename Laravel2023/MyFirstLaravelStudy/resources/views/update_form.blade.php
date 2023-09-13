<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Update</title>
</head>
<body>
    <form action="/update" method="post">
        @csrf
        @method("put")
        이름 : <input type="text" name="name" value="{{$name}}" readonly><br>
        생년월일(YYYY/MM/DD) : <input type="text" name="birthDate" value="{{$birthDate}}" readonly><br>
        email : <input type="email" name="email"><br>
        소속 : <input type="text" name="organization"><br>
        <button type="submit">수정</button>
    </form>
</body>
</html>