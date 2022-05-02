import { User } from './../user';
import { SingupService } from './../singup.service';
import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  public users: User[] | undefined ;

  user:User=new User();
  
  constructor(private router: Router,private singupService:SingupService) { }

  ngOnInit() {
    this.getUsers();
  }

  getUsers(): void {
    this.singupService.getUsers().subscribe(
      (response: User[]) => {
        this.users = response;
        
        console.log(this.users);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }


  userRegister(singupForm :NgForm)
  {
    
    this.singupService.addUser(this.user).subscribe(
      (response: User) => {
        console.log(response);
  
        alert(this.user.username+" is sucessfully registered");
        singupForm.reset();
        this.router.navigate(['/login']);
        
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
        
      }
    );
    
    // console.log(this.user);
    // this.singupService.registerUser(this.user).subscribe(data=>
    // {
    //       alert("sucessfully user is registered")
    // },error=>alert("sorry user not register")
    // );
  }
  


}
