import { Component, OnInit } from '@angular/core';
import { BasicAuthenticationService } from '../service/basic-authentication.service';
import { Router } from '@angular/router';
import { HttpHeaders, HttpClient } from '@angular/common/http';



@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  invalidLogin = true;
  constructor(private authService:BasicAuthenticationService , private router:Router) { }

  
  

  ngOnInit(): void {

   
  }

  login(username,password){

    this.authService.login(username,password);

  }
  

}
