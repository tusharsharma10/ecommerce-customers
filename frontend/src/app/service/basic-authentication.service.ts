import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Authentication } from '../model/authentication.model';
import { map } from 'rxjs/operators';
import { Router } from '@angular/router';
import { fixUrl, authenticater } from '../model/constants';

export var TOKEN = null;
export const AUTHENTICATED_USER = 'authenticaterUser';

@Injectable({
  providedIn: 'root'
})
export class BasicAuthenticationService {

 url = `${fixUrl}${authenticater}`;
 
 
  constructor(private http:HttpClient,private router:Router){}
 
 
  login(username,password){

   let body = {'username':username,'password':password};
    
   this.http.post(this.url,body).subscribe(data =>{

      console.log(data);
      TOKEN = data;
      TOKEN = TOKEN.token;
      this.router.navigate(['home']);
   });

 }

 logout(){

  TOKEN = null;
this.router.navigate(['']);

 }

 isUserLoggedIn(){
   
  return (TOKEN !== null)
 
}

}
