<?php

use App\Http\Controllers\UserController;
use Illuminate\Support\Facades\Route;
use Illuminate\Http\Request;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/test', function () {
    return view('welcome');
});

Route::get('/register', function () {
    return view('register_form');
});

Route::post('/register',function(Request $req){
    $name = $req->input("name");
    $email = $req->input("email");
    $birthDate = $req->input("birthDate");
    $organization = $req->input("organization");

    return view('register', ['name'=>$name, 'email'=>$email,'birthDate'=>$birthDate, 'organization'=>$organization]);
});

Route::get('/update', function (){
   return view('update_form');
});

Route::put('/update', function(Request $req){
    $name = $req->input("name");
    $email = $req->input("email");
    $birthDate = $req->input("birthDate");
    $organization = $req->input("organization");

    return view('update', ['name'=>$name, 'email'=>$email,'birthDate'=>$birthDate, 'organization'=>$organization]);
});

Route::get('/remove', function(){
    return view('remove_form');
});

Route::delete('/remove', function (Request $req) {
    $deleted_name = $req->input("deleted_name");

    return view('remove', ['deleted_name'=>$deleted_name]);
});

Route::get('user/{id?}', function (string $id = '100') {
    return 'User '.$id;
});

Route::get('/posts/{post}/comments/{comment}', function(string $postId, string $commentId){
    return '게시글 '.$postId.'번 글의 댓글'.$commentId.'번을 삭제했습니다.';
});

Route::get('/test', [UserController::class, 'test']);


Route::get('/test', [UserController::class, 'test']);
Route::get('/register', [UserController::class, 'create']);
Route::get('/update', [UserController::class, 'edit']);
Route::get('/players', [UserController::class, 'index']);
Route::post('/register',[UserController::class, 'store']);
Route::put('/update',[UserController::class, 'update']);
Route::delete('/remove', [UserController::class, 'destroy']);

Route::resource('photos',PhotoController::class);
// 클로저