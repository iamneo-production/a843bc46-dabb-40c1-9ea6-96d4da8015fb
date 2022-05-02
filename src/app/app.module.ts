import { UsersComponent } from './users/users.component';
import { UserService } from './user.service';


import { LoginComponent } from './login/login.component';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { SignupComponent } from './signup/signup.component';
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';





@NgModule({
  declarations: [
    
    AppComponent,
    SignupComponent,
    LoginComponent,
    UsersComponent
   
  ],
  imports: [
 
    BrowserModule,
    HttpClientModule, 
    FormsModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    
  ],
  providers:  [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
