import { Injectable } from '@angular/core';
import { Router, CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { IfStmt } from '@angular/compiler';
import { TOKEN } from './basic-authentication.service';

@Injectable({
  providedIn: 'root'
})
export class RouteGuardService implements CanActivate {

  constructor(private router:Router) { }
 
  isUserLoggedIn(){

    return (TOKEN !== null)
  
  }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot)  {
  
    if(this.isUserLoggedIn())
    return true;

    this.router.navigate(['']);

    return false;

  }




}
