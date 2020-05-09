import { Component, OnInit } from '@angular/core';
import { fromEvent, of, interval } from 'rxjs';
import { map, switchMap } from 'rxjs/operators';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Statistics } from './stats.model';
import { Info } from './info.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'demo';

 



 

  constructor(private http: HttpClient) {

  }

  ngOnInit() {

   

  }


  

}



// https://covid-193.p.rapidapi.com/statistics

// "x-rapidapi-host": "covid-193.p.rapidapi.com",
// "x-rapidapi-key": "cab47b4f38msh62fbf60c30377b2p10a242jsna2b61d764a2f"