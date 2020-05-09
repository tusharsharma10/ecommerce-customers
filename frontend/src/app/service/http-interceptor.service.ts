import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpRequest, HttpHandler, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TOKEN } from './basic-authentication.service';

@Injectable({
  providedIn: 'root'
})
export class HttpInterceptorService implements HttpInterceptor {

  constructor() { }
  
  
  intercept(request: HttpRequest<any>, next: HttpHandler):Observable<HttpEvent<any>> {
    
    let username = 'user';
    let password = 'password';
   let basicAuthHeader = `Bearer ${TOKEN}`;

   if(TOKEN !== null){
    request = request.clone({
      setHeaders: {
        'Authorization' : basicAuthHeader
      }
    });

  }

  else
    request;
    
    return next.handle(request);
  }


}
