import { Login } from './../login';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginUser:Login=new Login();

  constructor() { }

  ngOnInit(): void {
  }
  userLogin(loginForm :NgForm)
  {
      console.log(this.loginUser)
  }

}
