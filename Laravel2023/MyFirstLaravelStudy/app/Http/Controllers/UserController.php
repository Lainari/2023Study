<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        /*
            1. DB에서 사용자 정보를 가져온다
            2. 가져온 사용자 정보를 blade 파일에 넘겨주면서 실행한다
         */
        $users = [
            ['id'=>1, 'name'=>'김민재', 'birthDate'=>'1996/11/15','email'=>'mjkim4@gmail.com'],
            ['id'=>2, 'name'=>'大谷', 'birthDate'=>'1994/07/05','email'=>'ohtanishohey@gmail.com'],
            ['id'=>3, 'name'=>'손흥민', 'birthDate'=>'1992/07/08','email'=>'hmson7@gmail.com'],
            ['id'=>4, 'name'=>'渡辺', 'birthDate'=>'1994/10/13','email'=>'watanabe@gmail.com'],
            ['id'=>5, 'name'=>'Kane', 'birthDate'=>'1993/07/28','email'=>'kane10@gmail.com'],
            ['id'=>6, 'name'=>'Ronaldo', 'birthDate'=>'1985/02/05','email'=>'ronaldo7@gmail.com'],
            ['id'=>7, 'name'=>'Messi', 'birthDate'=>'1987/06/24','email'=>'messi10@gmail.com']
        ]; // DB에서 읽어온 정보를 $users 변수에 할당했다고 가정
        return View('welcome', ['users'=>$users]);
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return View('register_form');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $req)
    {
        /*
            1. Request 객체로부터 사용자가 폼에 입력한 값을 꺼낸다
            2. 1.에서 꺼낸 값을 DB에 넣는다
            3. 등록결과 페이지를 만들어서 반환한다
        */
        $name = $req -> input('name');
        $email = $req -> input('email');
        $organization = $req -> input('organization');
        $birthDate = $req -> input('birthDate');
        return View('register', ['name'=>$name, 'email'=>$email, 'organization'=>$organization, 'birthDate'=>$birthDate]);
    }

    /**
     * Display the specified resource.
     */
    public function show(string $name)
    {
        /*
            1. $name을 가지고 DB에서 레코드 하나를 인출한다
            2. 인출된 그 정보를 변수 $user에 할당
            3. 그 $user 값을 blade 에 전달하면서 실행
        */
        return View('user',['name'=>$name]);
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Request $req)
    {
        //
        $name = $req -> input('name');
        $email = $req -> input('email');
        return View('update_form', ['name'=>$name, 'email'=>$email]);
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $req)
    {
        //
        $name = $req -> input('name');
        $email = $req -> input('email');
        $organization = $req -> input('organization');
        $birthDate = $req -> input('birthDate');
        return View('update', ['name'=>$name, 'email'=>$email, 'organization'=>$organization, 'birthDate'=>$birthDate]);
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Request $req)
    {
        //
        $deleted_name = $req -> input('deleted_name');
        return View('remove', ['deleted_name'=>$deleted_name]);
    }
}
