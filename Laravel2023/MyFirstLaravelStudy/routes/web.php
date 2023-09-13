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
Route::get('/', function() {
    return view('welcome');
});

Route::get('/test', [UserController::class, 'test']);
Route::get('/register', [UserController::class, 'create']);
Route::get('/update', [UserController::class, 'edit']);
Route::get('/players', [UserController::class, 'index']);
Route::post('/register',[UserController::class, 'store']);
Route::put('/update',[UserController::class, 'update']);
Route::delete('/remove', [UserController::class, 'destroy']);